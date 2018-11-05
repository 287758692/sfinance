package cn.sfinance.service.impl;

import cn.sfinance.dao.SysOrgDao;
import cn.sfinance.model.SysOrg;
import cn.sfinance.service.SysOrgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@Service
public class SysOrgServiceImpl implements SysOrgService {

	@Autowired
	private SysOrgDao<SysOrg> sysOrgDao;

	@Override
	public Serializable insertSysOrg(SysOrg data){
		return sysOrgDao.save(data);
	}
	@Override
	public boolean updateSysOrg(SysOrg data){
		return sysOrgDao.saveOrUpdate(data);
	}
	@Override
	public SysOrg getSysOrg(Integer Id){
		SysOrg data = sysOrgDao.get(SysOrg.class, Id);
		return data;
	}
	
	@Override
	public Map<String, Object> getList(Integer pageNumber,Integer pageSize,String orgName) {
		Map<String, Object> result = new HashMap<String, Object>();
		result.put("total", sysOrgDao.getList(pageNumber,pageSize,orgName,false).size());
		result.put("rows", sysOrgDao.getList(pageNumber,pageSize,orgName,true));
		return result;
	}
	
	@Override
	public Map<String, Object> getOrgUserList(Integer pageNumber,Integer pageSize,Integer orgId ) {
		Map<String, Object> result = new HashMap<String, Object>();
		result.put("total", sysOrgDao.getOrgUserList(pageNumber,pageSize,orgId,false).size());
		result.put("rows", sysOrgDao.getOrgUserList(pageNumber,pageSize,orgId,true));
		return result;
	}
	
	@Override
	public Map<String, Object> getOrgUserInList(Integer pageNumber,Integer pageSize) {
		Map<String, Object> result = new HashMap<String, Object>();
		result.put("total", sysOrgDao.getOrgUserInList(pageNumber,pageSize,false).size());
		result.put("rows", sysOrgDao.getOrgUserInList(pageNumber,pageSize,true));
		return result;
	}
}
