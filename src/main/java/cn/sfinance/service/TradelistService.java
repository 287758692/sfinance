package cn.sfinance.service;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import cn.sfinance.model.Tradelist;

public interface TradelistService {
    
    public Serializable insertTradelist(Tradelist data);
    
    public boolean updateTradelist(Tradelist data);
    
    public Tradelist getTradelist(Integer Id);
    
    public List<Map<String, Object>> getComboList();

}