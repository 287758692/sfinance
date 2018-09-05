package cn.sfinance.service;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import cn.sfinance.model.Detailreport;

public interface DetailreportService {
    
    public Serializable insertDetailreport(Detailreport data);
    
    public boolean updateDetailreport(Detailreport data);
    
    public Detailreport getDetailreport(Integer Id);
    
    public Map<String, Object> getList(Integer pageNumber,Integer pageSize,String RPtype,String cooperationId) ;
    
    public LinkedHashMap<String, Object> getReportData(String RPtype,String cooperationId);

}