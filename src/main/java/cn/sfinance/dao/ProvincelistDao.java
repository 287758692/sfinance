package cn.sfinance.dao;

import java.util.List;
import java.util.Map;

public interface ProvincelistDao<T> extends BaseDao<T>{

	public List<Map<String, Object>> getComboList();
}
