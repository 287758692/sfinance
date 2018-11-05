package cn.sfinance.service;

import cn.sfinance.model.SysUserOrg;

import java.io.Serializable;

public interface SysUserOrgService {
    
    public Serializable insertSysUserOrg(SysUserOrg data);
    
    public boolean updateSysUserOrg(SysUserOrg data);
    
    public SysUserOrg getSysUserOrg(Integer Id);
    
    public Integer getSysUserOrgByUserId(Integer userId);

}