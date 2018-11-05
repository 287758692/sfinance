package cn.sfinance.dao;

import java.util.List;
import java.util.Map;

public interface CooperationlinkDao<T> extends BaseDao<T>{

    public List<Map<String, Object>> getList(Integer pageNumber,Integer pageSize,String parent,boolean isPage);

}
