package cn.sfinance.dao.impl;

import java.util.List;
import java.util.Map;

import org.hibernate.Query;
import org.hibernate.transform.Transformers;
import org.springframework.stereotype.Repository;

import cn.sfinance.dao.ProvincelistDao;

@Repository("provincelistDao")
public class ProvincelistDaoImpl<Provincelist> extends BaseDaoImpl<Provincelist> implements ProvincelistDao<Provincelist>{

	@Override
	public List<Map<String, Object>> getComboList() {
		String sql = "select * from provincelist where 1=1 ";
		Query query = getCurrentSession().createSQLQuery(sql).setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);
		return query.list();
	}
}