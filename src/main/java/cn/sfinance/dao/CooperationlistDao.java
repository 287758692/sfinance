package cn.sfinance.dao;

import java.util.List;
import java.util.Map;

public interface CooperationlistDao<T> extends BaseDao<T>{
	
	public List<Map<String, Object>> getList(Integer pageNumber,Integer pageSize,String cooperationName,boolean isPage);
	public List<Map<String, Object>> getSUM();
	public List<Map<String, Object>> getlistNOpage(String tradeCode);
	public List<Map<String, Object>> getCount(String cooperationId);
}
