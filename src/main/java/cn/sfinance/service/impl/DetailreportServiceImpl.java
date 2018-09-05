package cn.sfinance.service.impl;

import java.io.Serializable;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.sfinance.model.Detailreport;
import cn.sfinance.dao.DetailreportDao;
import cn.sfinance.service.DetailreportService;

@Service
public class DetailreportServiceImpl implements DetailreportService {

	@Autowired
	private DetailreportDao<Detailreport> detailreportDao;


	public Serializable insertDetailreport(Detailreport data){
		return detailreportDao.save(data);
	}
	
	public boolean updateDetailreport(Detailreport data){
		return detailreportDao.saveOrUpdate(data);
	}
	
	public Detailreport getDetailreport(Integer Id){
		Detailreport data = detailreportDao.get(Detailreport.class, Id);
		return data;
	}
	
	@Override
	public Map<String, Object> getList(Integer pageNumber,Integer pageSize,String RPtype,String cooperationId) {
		Map<String, Object> result = new HashMap<String, Object>();
		result.put("total", detailreportDao.getList(pageNumber,pageSize,RPtype,cooperationId,false).size());
		result.put("rows", detailreportDao.getList(pageNumber,pageSize,RPtype,cooperationId,true));
		return result;
	}
	
	@Override
	public LinkedHashMap<String, Object> getReportData(String RPtype,String cooperationId) {
		LinkedHashMap<String, Object> result = new LinkedHashMap<String, Object>();
		List<Map<String, Object>> RPData = detailreportDao.getReportData(RPtype,cooperationId);
		for (Map<String, Object> data : RPData) {
			result.put(data.get("RPName").toString(), data.get("RPDATA"));
		}
		return result;
	}
}
