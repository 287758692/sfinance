package cn.sfinance.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.sfinance.service.TradelistService;

@Controller
@RequestMapping("/Trade")
public class TradeController {
	
	@Autowired
	private TradelistService tradelistService;
	
	/**
	 * 选择行业
	 * 
	 */
	@RequestMapping(value = "/select", method = RequestMethod.POST)
	public @ResponseBody Object select(HttpServletRequest request,HttpServletResponse response) {
		response.addHeader("Access-Control-Allow-Origin", "*");
		return tradelistService.getComboList();
	}
	
}