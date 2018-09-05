package cn.sfinance.dao;

import java.util.List;
import java.util.Map;

public interface DetailreportDao<T> extends BaseDao<T>{
	
	public List<Map<String, Object>> getList(Integer pageNumber,Integer pageSize,String RPType,String cooperationId,boolean isPage);
	public List<Map<String, Object>> getReportData(String RPtype,String cooperationId);
}
