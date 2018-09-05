package cn.sfinance.service;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import cn.sfinance.model.Cooperationlist;

public interface CooperationlistService {
    
    public Serializable insertCooperationlist(Cooperationlist data);
    
    public boolean updateCooperationlist(Cooperationlist data);
    
    public Cooperationlist getCooperationlist(Integer Id);
    
    public Map<String, Object> getList(Integer pageNumber,Integer pageSize,String cooperationName) ;
    
    public Map<String, Object> getSUM();
    
    public List<Map<String, Object>>  getlistNOpage(String tradeCode) ;
    
    public Map<String, Object> getCount(String cooperationId);
    
}