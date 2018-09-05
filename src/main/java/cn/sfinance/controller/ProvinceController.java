package cn.sfinance.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.sfinance.service.ProvincelistService;

@Controller
@RequestMapping("/Province")
public class ProvinceController {
	
	@Autowired
	private ProvincelistService provincelistService;
	
	/**
	 * 选择省份
	 * 
	 */
	@RequestMapping(value = "/select", method = RequestMethod.POST)
	public @ResponseBody Object select(HttpServletRequest request) {
		return provincelistService.getComboList();
	}
	
}