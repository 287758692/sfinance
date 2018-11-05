package cn.sfinance.service.impl;

import cn.sfinance.dao.SysUserOrgDao;
import cn.sfinance.model.SysUserOrg;
import cn.sfinance.service.SysUserOrgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@Service
public class SysUserOrgServiceImpl implements SysUserOrgService {

	@Autowired
	private SysUserOrgDao<SysUserOrg> sysUserOrgDao;

	@Override
	public Serializable insertSysUserOrg(SysUserOrg data){
		return sysUserOrgDao.save(data);
	}
	@Override
	public boolean updateSysUserOrg(SysUserOrg data){
		return sysUserOrgDao.saveOrUpdate(data);
	}
	@Override
	public SysUserOrg getSysUserOrg(Integer Id){
		SysUserOrg data = sysUserOrgDao.get(SysUserOrg.class, Id);
		return data;
	}
	
	@Override
	public Integer getSysUserOrgByUserId(Integer userId){
		Map<String, Object> params = new HashMap<String, Object>();
		String hql = "from SysUserOrg where status > 0 and userId = :userId ";
		params.put("userId", userId);
		SysUserOrg data = sysUserOrgDao.get(hql, params);
		 return data.getOrgId();
	}
}
