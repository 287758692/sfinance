package cn.sfinance.service.impl;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.sfinance.model.Cooperationlist;
import cn.sfinance.dao.CooperationlistDao;
import cn.sfinance.service.CooperationlistService;

@Service
public class CooperationlistServiceImpl implements CooperationlistService {

	@Autowired
	private CooperationlistDao<Cooperationlist> cooperationlistDao;


	public Serializable insertCooperationlist(Cooperationlist data){
		return cooperationlistDao.save(data);
	}
	
	public boolean updateCooperationlist(Cooperationlist data){
		return cooperationlistDao.saveOrUpdate(data);
	}
	
	public Cooperationlist getCooperationlist(Integer Id){
		Cooperationlist data = cooperationlistDao.get(Cooperationlist.class, Id);
		return data;
	}
	
	@Override
	public Map<String, Object> getList(Integer pageNumber,Integer pageSize,String cooperationName) {
		Map<String, Object> result = new HashMap<String, Object>();
		result.put("total", cooperationlistDao.getList(pageNumber,pageSize,cooperationName,false).size());
		result.put("rows", cooperationlistDao.getList(pageNumber,pageSize,cooperationName,true));
		return result;
	}
	
	@Override
	public Map<String, Object> getSUM() {
		Map<String, Object> result = new HashMap<String, Object>();
		for (Map<String, Object> data : cooperationlistDao.getSUM()) {
			result.put("北京", data.get("BEIJING"));
			result.put("天津", data.get("TIANJIN"));
			result.put("上海", data.get("SHANGHAI"));
			result.put("重庆", data.get("CHONGQING"));
			result.put("河北", data.get("HEBEI"));
			result.put("河南", data.get("HENAN"));
			result.put("云南", data.get("YUNNAN"));
			result.put("辽宁", data.get("LIAONING"));
			result.put("黑龙江", data.get("HEILONGJIANG"));
			result.put("湖南", data.get("HUNAN"));
			result.put("安徽", data.get("ANHUI"));
			result.put("山东", data.get("SHANDONG"));
			result.put("新疆", data.get("XINJIANG"));
			result.put("江苏", data.get("JIANGSU"));
			result.put("浙江", data.get("ZHEJIANG"));
			result.put("江西", data.get("JIANGXI"));
			result.put("湖北", data.get("HUBEI"));
			result.put("广西", data.get("GUANGXI"));
			result.put("甘肃", data.get("GANSU"));
			result.put("山西", data.get("SHANXI1"));
			result.put("内蒙古", data.get("NEIMENGGU"));
			result.put("陕西", data.get("SHANXI2"));
			result.put("吉林", data.get("JILIN"));
			result.put("福建", data.get("FUJIAN"));
			result.put("贵州", data.get("GUIZHOU"));
			result.put("广东", data.get("GUANGDONG"));
			result.put("青海", data.get("QINGHAI"));
			result.put("西藏", data.get("XIZANG"));
			result.put("四川", data.get("SICHUANG"));
			result.put("宁夏", data.get("NINGXIA"));
			result.put("海南", data.get("HAINAN"));
			result.put("台湾", data.get("TAIWAN"));
			result.put("香港", data.get("XIANGGANG"));
			result.put("澳门", data.get("AOMEN"));
		}
		return result;
	}
	
	public List<Map<String, Object>> getlistNOpage(String tradeCode) {
		List<Map<String, Object>> result = cooperationlistDao.getlistNOpage(tradeCode);
		return result;
	}
	
	@Override
	public Map<String, Object> getCount(String cooperationId) {
		Map<String, Object> result = new HashMap<String, Object>();
		for (Map<String, Object> data : cooperationlistDao.getCount(cooperationId)) {
			result.put("北京", data.get("BEIJING"));
			result.put("天津", data.get("TIANJIN"));
			result.put("上海", data.get("SHANGHAI"));
			result.put("重庆", data.get("CHONGQING"));
			result.put("河北", data.get("HEBEI"));
			result.put("河南", data.get("HENAN"));
			result.put("云南", data.get("YUNNAN"));
			result.put("辽宁", data.get("LIAONING"));
			result.put("黑龙江", data.get("HEILONGJIANG"));
			result.put("湖南", data.get("HUNAN"));
			result.put("安徽", data.get("ANHUI"));
			result.put("山东", data.get("SHANDONG"));
			result.put("新疆", data.get("XINJIANG"));
			result.put("江苏", data.get("JIANGSU"));
			result.put("浙江", data.get("ZHEJIANG"));
			result.put("江西", data.get("JIANGXI"));
			result.put("湖北", data.get("HUBEI"));
			result.put("广西", data.get("GUANGXI"));
			result.put("甘肃", data.get("GANSU"));
			result.put("山西", data.get("SHANXI1"));
			result.put("内蒙古", data.get("NEIMENGGU"));
			result.put("陕西", data.get("SHANXI2"));
			result.put("吉林", data.get("JILIN"));
			result.put("福建", data.get("FUJIAN"));
			result.put("贵州", data.get("GUIZHOU"));
			result.put("广东", data.get("GUANGDONG"));
			result.put("青海", data.get("QINGHAI"));
			result.put("西藏", data.get("XIZANG"));
			result.put("四川", data.get("SICHUANG"));
			result.put("宁夏", data.get("NINGXIA"));
			result.put("海南", data.get("HAINAN"));
			result.put("台湾", data.get("TAIWAN"));
			result.put("香港", data.get("XIANGGANG"));
			result.put("澳门", data.get("AOMEN"));
		}
		return result;
	}
	
}
