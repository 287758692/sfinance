package cn.sfinance.service;

import cn.sfinance.model.SysUser;

import java.io.Serializable;
import java.util.Map;

public interface SysUserService {
    
    public Serializable insertSysUser(SysUser data);
    
    public boolean updateSysUser(SysUser data);
    
    public SysUser getSysUser(Integer Id);
    
    public SysUser getUsers(String loginName, String passWord);
    
    public Map<String, Object> getList(Integer pageNumber, Integer pageSize, String userName);

}