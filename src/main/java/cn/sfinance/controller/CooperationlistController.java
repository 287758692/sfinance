package cn.sfinance.controller;

import java.io.IOException;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
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
import cn.sfinance.service.CooperationlistService;

@Controller
@RequestMapping("/Cooperation")
public class CooperationlistController {
	private final static Logger log = Logger.getLogger(CooperationlistController.class);
	private ObjectMapper objectMapper = new ObjectMapper();
	
	@Autowired
	private CooperationlistService cooperationlistService;
	

	/**
	 * 合作商户列表
	 * 
	 */
	@RequestMapping(value = "/list" ,produces="application/json;charset=UTF-8")
	public @ResponseBody Object list(HttpServletRequest request) throws IOException {
		
		Map<String, Object> resultMap = new HashMap<String, Object>();
		int pageSize = Integer.parseInt(request.getParameter("pageSize"));  
        int pageNumber = Integer.parseInt(request.getParameter("pageNumber")); 
        String cooperationName = request.getParameter("cooperationName"); 
        
        resultMap = cooperationlistService.getList(pageNumber, pageSize,cooperationName);
        
        String jsonString = objectMapper.writeValueAsString(resultMap.get("rows"));
        String json = "{\"total\":" + resultMap.get("total") + ",\"rows\":" + jsonString + "}";
        
        log.info("json:"+json);
        return json;
	}
	
	/**
	 * 商户新增界面
	 * 
	 */
	@RequestMapping(value = "/addView")
	public @ResponseBody Object cooperationAdd(HttpServletRequest request) throws IOException {
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("cooperationAdd");
		return mav;
	}
	/**
	 * 商户新增提交
	 * 
	 */
	@RequestMapping(value = "/addConfirm", method = RequestMethod.POST)
	public @ResponseBody Object cooperationAddConfirm(HttpServletRequest request,HttpSession session) throws IOException {
		
		Map<String, Object> resultMap = new HashMap<String, Object>();
		
		Cooperationlist cooperation = new Cooperationlist();
		
		cooperation.setCooperationName(request.getParameter("cooperationName"));
		cooperation.setTradeCode(request.getParameter("tradeCode"));
		cooperation.setProvinceCode(request.getParameter("provinceCode"));
		cooperation.setSrobot(request.getParameter("SROBOT"));
		cooperation.setWechat(request.getParameter("WECHAT"));
		cooperation.setpPicpath(request.getParameter("picpath"));
		
		cooperation.setBeijing(request.getParameter("BEIJING"));
		cooperation.setTianjin(request.getParameter("TIANJIN"));
		cooperation.setShanghai(request.getParameter("SHANGHAI"));
		cooperation.setChongqing(request.getParameter("CHONGQING"));
		cooperation.setHebei(request.getParameter("HEBEI"));
		cooperation.setHenan(request.getParameter("HENAN"));
		cooperation.setYunnan(request.getParameter("YUNNAN"));
		cooperation.setLiaoning(request.getParameter("LIAONING"));
		cooperation.setHeilongjiang(request.getParameter("HEILONGJIANG"));
		cooperation.setHunan(request.getParameter("HUNAN"));
		cooperation.setAnhui(request.getParameter("ANHUI"));
		cooperation.setShandong(request.getParameter("SHANDONG"));
		cooperation.setXinjiang(request.getParameter("XINJIANG"));
		cooperation.setJiangsu(request.getParameter("JIANGSU"));
		cooperation.setZhejiang(request.getParameter("ZHEJIANG"));
		cooperation.setJiangxi(request.getParameter("JIANGXI"));
		cooperation.setHubei(request.getParameter("HUBEI"));
		cooperation.setGuangxi(request.getParameter("GUANGXI"));
		cooperation.setGansu(request.getParameter("GANSU"));
		cooperation.setSHANXI1(request.getParameter("SHANXI1"));
		cooperation.setNeimenggu(request.getParameter("NEIMENGGU"));
		cooperation.setSHANXI2(request.getParameter("SHANXI2"));
		cooperation.setJilin(request.getParameter("JILIN"));
		cooperation.setFujian(request.getParameter("FUJIAN"));
		cooperation.setGuizhou(request.getParameter("GUIZHOU"));
		cooperation.setGuangdong(request.getParameter("GUANGDONG"));
		cooperation.setQinghai(request.getParameter("QINGHAI"));
		cooperation.setXizang(request.getParameter("XIZANG"));
		cooperation.setSichuang(request.getParameter("SICHUANG"));
		cooperation.setNingxia(request.getParameter("NINGXIA"));
		cooperation.setHainan(request.getParameter("HAINAN"));
		cooperation.setTaiwan(request.getParameter("TAIWAN"));
		cooperation.setXianggang(request.getParameter("XIANGGANG"));
		cooperation.setAomen(request.getParameter("AOMEN"));
		cooperation.setSTATUS("Y");

		Serializable result = cooperationlistService.insertCooperationlist(cooperation);
		
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
	 * 商户修改界面
	 * 
	 */
	@RequestMapping(value = "/amdView")
	public @ResponseBody Object cooperationAmd(HttpServletRequest request) throws IOException {
		
		ModelAndView mav = new ModelAndView();
		
		Cooperationlist cooperation = cooperationlistService.getCooperationlist(Integer.parseInt(request.getParameter("cooperationId")));
		
		mav.addObject("cooperationId",cooperation.getCooperationId());
		mav.addObject("cooperationName",cooperation.getCooperationName());
		mav.addObject("tradeCode",cooperation.getTradeCode());
		mav.addObject("provinceCode",cooperation.getProvinceCode());
		mav.addObject("SROBOT",cooperation.getSrobot());
		mav.addObject("WECHAT",cooperation.getWechat());
		mav.addObject("picpath",cooperation.getPicpath());
		mav.addObject("BEIJING",cooperation.getBeijing());
		mav.addObject("TIANJIN",cooperation.getTianjin());
		mav.addObject("SHANGHAI",cooperation.getShanghai());
		mav.addObject("CHONGQING",cooperation.getChongqing());
		mav.addObject("HEBEI",cooperation.getHebei());
		mav.addObject("HENAN",cooperation.getHenan());
		mav.addObject("YUNNAN",cooperation.getYunnan());
		mav.addObject("LIAONING",cooperation.getLiaoning());
		mav.addObject("HEILONGJIANG",cooperation.getHeilongjiang());
		mav.addObject("HUNAN",cooperation.getHunan());
		mav.addObject("ANHUI",cooperation.getAnhui());
		mav.addObject("SHANDONG",cooperation.getShandong());
		mav.addObject("XINJIANG",cooperation.getXinjiang());
		mav.addObject("JIANGSU",cooperation.getJiangsu());
		mav.addObject("ZHEJIANG",cooperation.getZhejiang());
		mav.addObject("JIANGXI",cooperation.getJiangxi());
		mav.addObject("HUBEI",cooperation.getHubei());
		mav.addObject("GUANGXI",cooperation.getGuangxi());
		mav.addObject("GANSU",cooperation.getGansu());
		mav.addObject("SHANXI1",cooperation.getSHANXI1());
		mav.addObject("NEIMENGGU",cooperation.getNeimenggu());
		mav.addObject("SHANXI2",cooperation.getSHANXI2());
		mav.addObject("JILIN",cooperation.getJilin());
		mav.addObject("FUJIAN",cooperation.getFujian());
		mav.addObject("GUIZHOU",cooperation.getGuizhou());
		mav.addObject("GUANGDONG",cooperation.getGuangdong());
		mav.addObject("QINGHAI",cooperation.getQinghai());
		mav.addObject("XIZANG",cooperation.getXizang());
		mav.addObject("SICHUANG",cooperation.getSichuang());
		mav.addObject("NINGXIA",cooperation.getNingxia());
		mav.addObject("HAINAN",cooperation.getHainan());
		mav.addObject("TAIWAN",cooperation.getTaiwan());
		mav.addObject("XIANGGANG",cooperation.getXianggang());
		mav.addObject("AOMEN",cooperation.getAomen());
		
		mav.setViewName("cooperationAmd");
		return mav;
	}
	/**
	 * 用户修改提交
	 * 
	 */
	@RequestMapping(value = "/amdConfirm", method = RequestMethod.POST)
	public @ResponseBody Object cooperationAmdConfirm(HttpServletRequest request,HttpSession session) throws IOException {
		
		Map<String, Object> resultMap = new HashMap<String, Object>();
		

		Cooperationlist cooperation = cooperationlistService.getCooperationlist(Integer.parseInt(request.getParameter("cooperationId")));
		
		cooperation.setCooperationName(request.getParameter("cooperationName"));
		cooperation.setTradeCode(request.getParameter("tradeCode"));
		cooperation.setProvinceCode(request.getParameter("provinceCode"));
		cooperation.setSrobot(request.getParameter("SROBOT"));
		cooperation.setWechat(request.getParameter("WECHAT"));
		cooperation.setpPicpath(request.getParameter("picpath"));
		cooperation.setBeijing(request.getParameter("BEIJING"));
		cooperation.setTianjin(request.getParameter("TIANJIN"));
		cooperation.setShanghai(request.getParameter("SHANGHAI"));
		cooperation.setChongqing(request.getParameter("CHONGQING"));
		cooperation.setHebei(request.getParameter("HEBEI"));
		cooperation.setHenan(request.getParameter("HENAN"));
		cooperation.setYunnan(request.getParameter("YUNNAN"));
		cooperation.setLiaoning(request.getParameter("LIAONING"));
		cooperation.setHeilongjiang(request.getParameter("HEILONGJIANG"));
		cooperation.setHunan(request.getParameter("HUNAN"));
		cooperation.setAnhui(request.getParameter("ANHUI"));
		cooperation.setShandong(request.getParameter("SHANDONG"));
		cooperation.setXinjiang(request.getParameter("XINJIANG"));
		cooperation.setJiangsu(request.getParameter("JIANGSU"));
		cooperation.setZhejiang(request.getParameter("ZHEJIANG"));
		cooperation.setJiangxi(request.getParameter("JIANGXI"));
		cooperation.setHubei(request.getParameter("HUBEI"));
		cooperation.setGuangxi(request.getParameter("GUANGXI"));
		cooperation.setGansu(request.getParameter("GANSU"));
		cooperation.setSHANXI1(request.getParameter("SHANXI1"));
		cooperation.setNeimenggu(request.getParameter("NEIMENGGU"));
		cooperation.setSHANXI2(request.getParameter("SHANXI2"));
		cooperation.setJilin(request.getParameter("JILIN"));
		cooperation.setFujian(request.getParameter("FUJIAN"));
		cooperation.setGuizhou(request.getParameter("GUIZHOU"));
		cooperation.setGuangdong(request.getParameter("GUANGDONG"));
		cooperation.setQinghai(request.getParameter("QINGHAI"));
		cooperation.setXizang(request.getParameter("XIZANG"));
		cooperation.setSichuang(request.getParameter("SICHUANG"));
		cooperation.setNingxia(request.getParameter("NINGXIA"));
		cooperation.setHainan(request.getParameter("HAINAN"));
		cooperation.setTaiwan(request.getParameter("TAIWAN"));
		cooperation.setXianggang(request.getParameter("XIANGGANG"));
		cooperation.setAomen(request.getParameter("AOMEN"));
		cooperation.setSTATUS("Y");
		
		boolean result = cooperationlistService.updateCooperationlist(cooperation);
		
		if (result) {
			resultMap.put("isSuc", true);
			resultMap.put("errMsg", "修改成功");
		} else {
			resultMap.put("isSuc", false);
			resultMap.put("errMsg", "修改失败");
		}
		return resultMap;
	}
	/**
	 * 商户删除
	 * 
	 */
	@RequestMapping(value = "/cooperationDel", method = RequestMethod.POST)
	public @ResponseBody Object cooperationDel(HttpServletRequest request,HttpSession session) throws IOException {
		
		Map<String, Object> resultMap = new HashMap<String, Object>();
		
		Cooperationlist cooperation = cooperationlistService.getCooperationlist(Integer.parseInt(request.getParameter("cooperationId")));
		
		cooperation.setSTATUS("N");
		cooperation.setModTime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
		
		boolean result = cooperationlistService.updateCooperationlist(cooperation);
		
		if (result) {
			resultMap.put("isSuc", true);
			resultMap.put("errMsg", "删除成功");
		} else {
			resultMap.put("isSuc", false);
			resultMap.put("errMsg", "删除失败");
		}
		return resultMap;
	}
	
	/**
	 * 前端-微信客户地区汇总
	 * 
	 */
	@RequestMapping(value = "/wechatSum",produces="text/html; charset=UTF-8")
	public @ResponseBody String wechatSum(HttpServletRequest request,HttpServletResponse response) throws IOException {
		
		Map<String, Object> map = new HashMap<String, Object>();
        
		map = cooperationlistService.getSUM();
        
        JSONArray data = new JSONArray();

        for(String name : map.keySet()){
            JSONObject jo = new JSONObject();
            jo.put("name", name); //name 应与shp转geojson时的name字段对应
            jo.put("value", map.get(name)); //value表示各个镇的值
            data.add(jo);
        }
        
        JSONObject res = new JSONObject(); //定义一个json对象
        res.put("data", data); //data属性
        
        response.addHeader("Access-Control-Allow-Origin", "*");
        return res.toString();
	}
	
	/**
	 * 前端-商家列表
	 * 
	 */
	@RequestMapping(value = "/listNOpage", method = RequestMethod.POST)
	public @ResponseBody Object listNOpage(HttpServletRequest request,HttpServletResponse response) throws IOException {
		
        String tradeCode = request.getParameter("tradeCode"); 
        response.addHeader("Access-Control-Allow-Origin", "*");
        return cooperationlistService.getlistNOpage(tradeCode);
	}
	
	/**
	 * 前端-商家微信用户地区分布
	 * 
	 */
	@RequestMapping(value = "/detaliMap",produces="text/html; charset=UTF-8")
	public @ResponseBody String detaliMap(HttpServletRequest request,HttpServletResponse response) throws IOException {
		
		Map<String, Object> map = new HashMap<String, Object>();
        
		map = cooperationlistService.getCount(request.getParameter("cooperationId"));
        
        JSONArray data = new JSONArray();

        for(String name : map.keySet()){
            JSONObject jo = new JSONObject();
            jo.put("name", name); //name 应与shp转geojson时的name字段对应
            jo.put("value", map.get(name)); //value表示各个镇的值
            data.add(jo);
        }
        
        JSONObject res = new JSONObject(); //定义一个json对象
        res.put("data", data); //data属性
        
        response.addHeader("Access-Control-Allow-Origin", "*");
        return res.toString();
	}
	
	/**
	 * 商户名称
	 * 
	 */
	@RequestMapping(value = "/getName", method = RequestMethod.POST)
	public @ResponseBody Object getName(HttpServletRequest request,HttpServletResponse response) {
		Cooperationlist cooperation = cooperationlistService.getCooperationlist(Integer.parseInt(request.getParameter("cooperationId")));
		response.addHeader("Access-Control-Allow-Origin", "*");
		return cooperation;
	}
}