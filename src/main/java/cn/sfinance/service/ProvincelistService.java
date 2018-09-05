package cn.sfinance.service;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import cn.sfinance.model.Provincelist;

public interface ProvincelistService {
    
    public Serializable insertProvincelist(Provincelist data);
    
    public boolean updateProvincelist(Provincelist data);
    
    public Provincelist getProvincelist(Integer Id);
    
    public List<Map<String, Object>> getComboList();

}