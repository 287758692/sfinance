package cn.sfinance.service.impl;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.sfinance.model.Provincelist;
import cn.sfinance.dao.ProvincelistDao;
import cn.sfinance.service.ProvincelistService;

@Service
public class ProvincelistServiceImpl implements ProvincelistService {

	@Autowired
	private ProvincelistDao<Provincelist> provincelistDao;

	@Override
	public Serializable insertProvincelist(Provincelist data){
		return provincelistDao.save(data);
	}
	@Override
	public boolean updateProvincelist(Provincelist data){
		return provincelistDao.saveOrUpdate(data);
	}
	@Override
	public Provincelist getProvincelist(Integer Id){
		Provincelist data = provincelistDao.get(Provincelist.class, Id);
		return data;
	}
	@Override
	public List<Map<String, Object>> getComboList() {
		List<Map<String, Object>> result = provincelistDao.getComboList();
		return result;
	}
}
