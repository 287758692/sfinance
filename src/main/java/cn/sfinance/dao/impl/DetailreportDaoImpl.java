package cn.sfinance.dao.impl;

import java.util.List;
import java.util.Map;

import org.hibernate.Query;
import org.hibernate.transform.Transformers;
import org.springframework.stereotype.Repository;

import cn.sfinance.dao.DetailreportDao;

@Repository("detailreportDao")
public class DetailreportDaoImpl<Detailreport> extends BaseDaoImpl<Detailreport> implements DetailreportDao<Detailreport>{
	
	@Override
	public List<Map<String, Object>> getList(Integer pageNumber,Integer pageSize,String RPType,String cooperationId,boolean isPage) {
		String sql =" select * from (select "
					+ "detailId,"
					+ "cooperationId,"
					+ "cooperationName,"
					+ "RPType, "
					+ "RPSeq,"
					+ "RPName, "
					+ "RPDATA, "
					+ "crtOptr, "
					+ "crtTime "
				+ "from detailreport where 1=1 ";
		if (RPType!=null && RPType!="") {
			sql += " and RPType = '" + RPType + "'";
		}
		if (cooperationId!=null && cooperationId!="") {
			sql += " and cooperationId = '" + cooperationId + "'";
		}
		sql += "order by RPType,RPSeq ) A ";
		if (isPage) {
			sql += " where detailId limit " + (pageNumber - 1) * pageSize + "," + pageSize;
		}
		
		Query query = getCurrentSession().createSQLQuery(sql);
		query.setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);
		return query.list();
	}
	@Override
	public List<Map<String, Object>> getReportData(String RPtype,String cooperationId) {
		String sql = "SELECT * "
				+"FROM "
					+"detailreport  "
				+"WHERE "
					+" 1=1 ";
		if (RPtype!=null && RPtype!="") {
			sql += " and RPtype = '" + RPtype + "'";
		}
		if (cooperationId!=null && cooperationId!="") {
			sql += " and cooperationId = '" + cooperationId + "'";
		}
		sql += " order by RPType,RPSeq";
		Query query = getCurrentSession().createSQLQuery(sql).setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);
		return query.list();
	}
}