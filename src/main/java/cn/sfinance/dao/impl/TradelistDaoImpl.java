package cn.sfinance.dao.impl;

import java.util.List;
import java.util.Map;

import org.hibernate.Query;
import org.hibernate.transform.Transformers;
import org.springframework.stereotype.Repository;

import cn.sfinance.dao.TradelistDao;

@Repository("tradelistDao")
public class TradelistDaoImpl<Tradelist> extends BaseDaoImpl<Tradelist> implements TradelistDao<Tradelist>{

	@Override
	public List<Map<String, Object>> getComboList() {
		String sql = "select * from tradelist where 1=1 ";
		Query query = getCurrentSession().createSQLQuery(sql).setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);
		return query.list();
	}
}