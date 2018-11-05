package cn.sfinance.service;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import cn.sfinance.model.Cooperationlink;

public interface CooperationlinkService {

    public Serializable insertCooperationlink(Cooperationlink data);

    public boolean updateCooperationlink(Cooperationlink data);

    public Cooperationlink getCooperationlink(Integer Id);

    public Map<String, Object> getList(Integer pageNumber,Integer pageSize,String parent);

}