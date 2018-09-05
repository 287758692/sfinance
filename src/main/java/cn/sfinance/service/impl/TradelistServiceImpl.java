package cn.sfinance.service.impl;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.sfinance.model.Tradelist;
import cn.sfinance.dao.TradelistDao;
import cn.sfinance.service.TradelistService;

@Service
public class TradelistServiceImpl implements TradelistService {

	@Autowired
	private TradelistDao<Tradelist> tradelistDao;


	public Serializable insertTradelist(Tradelist data){
		return tradelistDao.save(data);
	}
	
	public boolean updateTradelist(Tradelist data){
		return tradelistDao.saveOrUpdate(data);
	}
	
	public Tradelist getTradelist(Integer Id){
		Tradelist data = tradelistDao.get(Tradelist.class, Id);
		return data;
	}
	
	public List<Map<String, Object>> getComboList() {
		List<Map<String, Object>> result = tradelistDao.getComboList();
		return result;
	}
}
