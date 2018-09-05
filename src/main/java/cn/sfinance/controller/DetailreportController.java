package cn.sfinance.controller;

import java.io.IOException;
import java.io.Serializable;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.ObjectMapper;

import cn.sfinance.model.Cooperationlist;
import cn.sfinance.model.Detailreport;
import cn.sfinance.service.CooperationlistService;
import cn.sfinance.service.DetailreportService;

@Controller
@RequestMapping("/detailreportController")
public class DetailreportController {
	private final static Logger log = Logger.getLogger(CooperationlistController.class);
	private ObjectMapper objectMapper = new ObjectMapper();
	
	@Autowired
	private DetailreportService detailreportService;
	
	@Autowired
	private CooperationlistService cooperationlistService;
	/**
	 * 商户数据界面
	 * 
	 */
	@RequestMapping(value = "/dataView")
	public @ResponseBody Object dataView(HttpServletRequest request) throws IOException {
		
		ModelAndView mav = new ModelAndView();
		
		Cooperationlist cooperation = cooperationlistService.getCooperationlist(Integer.parseInt(request.getParameter("cooperationId")));
		
		mav.addObject("name",cooperation.getCooperationName());
		mav.addObject("cooperationId",cooperation.getCooperationId());
		mav.addObject("cooperationName",cooperation.getCooperationName());
		
		mav.setViewName("detailreport");
		return mav;
	}
	
	/**
	 * 商户报表数据
	 * 
	 */
	@RequestMapping(value = "/list",produces="application/json;charset=UTF-8")
	public @ResponseBody Object list(HttpServletRequest request) throws IOException {
		
		Map<String, Object> resultMap = new HashMap<String, Object>();
		int pageSize = Integer.parseInt(request.getParameter("pageSize"));  
        int pageNumber = Integer.parseInt(request.getParameter("pageNumber")); 
        String RPType = request.getParameter("RPType"); 
        String cooperationId = request.getParameter("cooperationId"); 
        resultMap = detailreportService.getList(pageNumber, pageSize,RPType,cooperationId.trim());
        
        String jsonString = objectMapper.writeValueAsString(resultMap.get("rows"));
        String json = "{\"total\":" + resultMap.get("total") + ",\"rows\":" + jsonString + "}";
        
        log.info("json:"+json);
        return json;
	}
	
	/**
	 * 商户报表数据新增
	 * 
	 */
	@RequestMapping(value = "/addConfirm", method = RequestMethod.POST)
	public @ResponseBody Object addConfirm(HttpServletRequest request,HttpSession session) throws IOException {
		
		Map<String, Object> resultMap = new HashMap<String, Object>();
		
		Detailreport detailreport = new Detailreport();
		detailreport.setCooperationId(request.getParameter("cooperationId"));
		detailreport.setCooperationName(request.getParameter("cooperationName"));
		detailreport.setRPType(request.getParameter("RPType"));
		detailreport.setRPSeq(Integer.parseInt(request.getParameter("RPSeq")));
		detailreport.setRPName(request.getParameter("RPName"));
		detailreport.setRpdata(request.getParameter("RPDATA"));

		Serializable result = detailreportService.insertDetailreport(detailreport);
		
		if (result.equals(0)) {
			resultMap.put("isSuc", false);
			resultMap.put("errMsg", "新增失败");
		} else {
			resultMap.put("isSuc", true);
			resultMap.put("errMsg", "新增成功");
		}
		return resultMap;
	}
	
	/**
	 * 商户报表数据修改
	 * 
	 */
	@RequestMapping(value = "/editTable")
	public @ResponseBody Object editTable(HttpServletRequest request) throws IOException {
		
		Map<String, Object> resultMap = new HashMap<String, Object>();
		
		Detailreport detailreport = detailreportService.getDetailreport(Integer.parseInt(request.getParameter("detailId")));
		
		detailreport.setCooperationName(request.getParameter("cooperationName"));
		detailreport.setRPType(request.getParameter("RPType"));
		detailreport.setRPSeq(Integer.parseInt(request.getParameter("RPSeq")));
		detailreport.setRPName(request.getParameter("RPName"));
		detailreport.setRpdata(request.getParameter("RPDATA"));
		
		boolean result = detailreportService.updateDetailreport(detailreport);
		
		if (result) {
			resultMap.put("isSuc", true);
			resultMap.put("errMsg", "修改成功");
		} else {
			resultMap.put("isSuc", false);
			resultMap.put("errMsg", "修改失败");
		}
		return resultMap;
	}
	
	@RequestMapping(value = "/reportData")
	public @ResponseBody Object reportData(HttpServletRequest request,HttpServletResponse response) throws IOException {
		
		LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();  
        
		map = detailreportService.getReportData(request.getParameter("RPtype"),request.getParameter("cooperationId"));
        JSONArray data = new JSONArray();

        for(String name : map.keySet()){
            JSONObject jo = new JSONObject(true);
            jo.put("name", name); //name 应与shp转geojson时的name字段对应
            jo.put("value", map.get(name)); //value表示各个镇的值
            data.add(jo);
        }
        
        JSONObject res = new JSONObject(); //定义一个json对象
        res.put("data", data); //data属性
        
		response.addHeader("Access-Control-Allow-Origin", "*");
		return res.toString();
	}
	
}