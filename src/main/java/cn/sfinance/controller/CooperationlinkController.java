package cn.sfinance.controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import cn.sfinance.service.SysMenuService;
import cn.sfinance.service.SysUserService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.io.File;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import javax.servlet.http.HttpServletRequest;
import cn.sfinance.model.Cooperationlink;
import cn.sfinance.utils.UsersConfigUtils;
import cn.sfinance.utils.ZXingCode;
import cn.sfinance.service.CooperationlinkService;

@Controller
@RequestMapping("/cooperationlinkController")
public class CooperationlinkController {
	private final static Logger log = Logger.getLogger(CooperationlinkController.class);
	private ObjectMapper objectMapper = new ObjectMapper();
	final Lock lock = new ReentrantLock();

	@Autowired
	private CooperationlinkService cooperationlinkService;

	@Autowired
	private SysUserService sysUserService;

	@Autowired
	private SysMenuService sysMenuService;

	/**
	 * 推广机构界面
	 *
	 */
	@RequestMapping(value = "/index")
	public @ResponseBody Object linkIndex(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("cooperationLink1");
		return mav;
	}

	@RequestMapping(value = "/org")
	public @ResponseBody Object org(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("Parent",request.getParameter("Parent"));
		mav.setViewName("cooperationLink2");
		return mav;
	}

	@RequestMapping(value = "/group")
	public @ResponseBody Object group(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("Parent",request.getParameter("Parent"));
		mav.setViewName("cooperationLink3");
		return mav;
	}
	/**
	 * 推广链接列表
	 *
	 */
	@RequestMapping(value = "/list" ,produces="application/json;charset=UTF-8")
	public @ResponseBody Object list(HttpServletRequest request) throws IOException {
		Map<String, Object> resultMap = new HashMap<String, Object>();

		int pageSize = Integer.parseInt(request.getParameter("pageSize"));
		int pageNumber = Integer.parseInt(request.getParameter("pageNumber"));
		String parent = request.getParameter("Parent");

		resultMap = cooperationlinkService.getList(pageNumber, pageSize,parent);

		String jsonString = objectMapper.writeValueAsString(resultMap.get("rows"));
		String json = "{\"total\":" + resultMap.get("total") + ",\"rows\":" + jsonString + "}";

		log.info("json:"+json);
		return json;
	}

	/**
	 * 推广链接新增
	 *
	 */
	@RequestMapping(value = "/addConfirm", method = RequestMethod.POST,produces="application/json;charset=UTF-8")
	@ResponseBody
	public Object addConfirm(HttpServletRequest request) {
		lock.lock(); //获取锁
		try{
			Map<String, Object> resultMap = new HashMap<String, Object>();
			Cooperationlink cooperationlink1 = cooperationlinkService.getCooperationlink(Integer.parseInt(request.getParameter("Parent")));
			Integer seq = cooperationlink1.getSeq();
			String link = cooperationlink1.getLink()+"_"+seq.toString();

			Cooperationlink cooperationlink2 = new Cooperationlink();

			cooperationlink2.setName(request.getParameter("name"));
			cooperationlink2.setProvinceCode("");
			cooperationlink2.setLevel(cooperationlink1.getLevel()+1);
			cooperationlink2.setSeq(1);
			cooperationlink2.setParent(cooperationlink1.getId());
			cooperationlink2.setLink(link);
			//图片路径
			UsersConfigUtils config = new UsersConfigUtils();
			//LOGO
			String dir = request.getServletContext().getRealPath("");
			String logo = config.GetUsersConfig("LOGO");
			//二维码
			String path = config.GetUsersConfig("USER-IMG-PATH");
			String name = (new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss-SSS").format(new Date())) + ".png";

			cooperationlink2.setQRcode(name);
			cooperationlink2.setStatus("Y");

			log.info("dir:"+dir);
			File logoFile = new File(dir+logo);
			File QrCodeFile = new File(path+name);
			String url = link;
			String note = request.getParameter("name");

			ZXingCode.drawLogoQRCode(logoFile, QrCodeFile, url, note);

			boolean isAdd = cooperationlinkService.updateCooperationlink(cooperationlink2);

			if (isAdd) {
				resultMap.put("isSuc", true);
				resultMap.put("errMsg", "新增成功");
				cooperationlink1.setSeq(seq+1);
				cooperationlinkService.updateCooperationlink(cooperationlink1);
			} else {
				resultMap.put("isSuc", false);
				resultMap.put("errMsg", "新增失败");
			}
			return resultMap;
		}finally {
			lock.unlock(); //释放锁
		}
	}
}