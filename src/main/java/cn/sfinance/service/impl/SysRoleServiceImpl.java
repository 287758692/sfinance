package cn.sfinance.service.impl;

import cn.sfinance.dao.SysRoleDao;
import cn.sfinance.model.SysRole;
import cn.sfinance.service.SysRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class SysRoleServiceImpl implements SysRoleService {

	@Autowired
	private SysRoleDao<SysRole> sysRoleDao;

	@Override
	public Serializable insertSysRole(SysRole data){
		return sysRoleDao.save(data);
	}
	@Override
	public boolean updateSysRole(SysRole data){
		return sysRoleDao.saveOrUpdate(data);
	}
	@Override
	public SysRole getSysRole(Integer Id){
		SysRole data = sysRoleDao.get(SysRole.class, Id);
		return data;
	}
	@Override
	public List<Map<String, Object>> getComboList() {
		List<Map<String, Object>> result = sysRoleDao.getComboList();
		return result;
	}
	
	@Override
	public Map<String, Object> getList(Integer pageNumber,Integer pageSize,String roleName) {
		Map<String, Object> result = new HashMap<String, Object>();
		result.put("total", sysRoleDao.getList(pageNumber,pageSize,roleName,false).size());
		result.put("rows", sysRoleDao.getList(pageNumber,pageSize,roleName,true));
		return result;
	}
}
