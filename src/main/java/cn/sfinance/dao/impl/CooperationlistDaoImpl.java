package cn.sfinance.dao.impl;

import java.util.List;
import java.util.Map;

import org.hibernate.Query;
import org.hibernate.transform.Transformers;
import org.springframework.stereotype.Repository;

import cn.sfinance.dao.CooperationlistDao;

@Repository("cooperationlistDao")
public class CooperationlistDaoImpl<Cooperationlist> extends BaseDaoImpl<Cooperationlist> implements CooperationlistDao<Cooperationlist>{

	@Override
	public List<Map<String, Object>> getList(Integer pageNumber,Integer pageSize,String cooperationName,boolean isPage) {
		String sql ="select "
					+ "cooperationId,"
					+ "cooperationName,"
					+ "(select tradeName from tradelist where tradeCode = cooperationlist.tradeCode) as tradeCode,"
					+ "(select provinceName from provincelist where provinceCode = cooperationlist.provinceCode) as provinceCode, "
					+ "SROBOT, "
					+ "WECHAT, "
					+ "crtOptr, "
					+ "crtTime "
				+ "from cooperationlist where STATUS='Y' ";
		if (cooperationName!=null && cooperationName!="") {
			sql += " and cooperationName like '%" + cooperationName + "%'";
		}
		if (isPage) {
			sql += " and cooperationId limit " + (pageNumber - 1) * pageSize + "," + pageSize;
		}
		Query query = getCurrentSession().createSQLQuery(sql);
		query.setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);
		return query.list();
	}
	
	@Override
	public List<Map<String, Object>> getSUM() {
		String sql = "SELECT "
					+"sum(BEIJING) BEIJING,sum(TIANJIN) TIANJIN,sum(SHANGHAI) SHANGHAI,sum(CHONGQING) CHONGQING, "
					+"sum(HEBEI) HEBEI,sum(HENAN) HENAN,sum(YUNNAN) YUNNAN,sum(LIAONING) LIAONING, "
					+"sum(HEILONGJIANG) HEILONGJIANG,sum(HUNAN) HUNAN,sum(ANHUI) ANHUI,sum(SHANDONG) SHANDONG, "
					+"sum(XINJIANG) XINJIANG,sum(JIANGSU) JIANGSU,sum(ZHEJIANG) ZHEJIANG,sum(JIANGXI) JIANGXI, "
					+"sum(HUBEI) HUBEI,sum(GUANGXI) GUANGXI,sum(GANSU) GANSU,sum(SHANXI1) SHANXI1, "
					+"sum(NEIMENGGU) NEIMENGGU,sum(SHANXI2) SHANXI2,sum(JILIN) JILIN,sum(FUJIAN) FUJIAN, "
					+"sum(GUIZHOU) GUIZHOU,sum(GUANGDONG) GUANGDONG,sum(QINGHAI) QINGHAI,sum(XIZANG) XIZANG, "
					+"sum(SICHUANG) SICHUANG,sum(NINGXIA) NINGXIA,sum(HAINAN) HAINAN,sum(TAIWAN) TAIWAN, "
					+"sum(XIANGGANG) XIANGGANG,sum(AOMEN) AOMEN "
				+"FROM "
					+"cooperationlist  "
				+"WHERE "
					+"`STATUS` = 'Y'";
		Query query = getCurrentSession().createSQLQuery(sql).setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);
		return query.list();
	}
	
	@Override
	public List<Map<String, Object>> getlistNOpage(String tradeCode) {
		String sql ="select "
					+ "cooperationId,"
					+ "cooperationName,"
					+ "SROBOT, "
					+ "WECHAT, "
					+ "picpath "
				+ "from cooperationlist where STATUS='Y' ";
		if (tradeCode!=null && tradeCode!="") {
			sql += " and tradeCode = '" + tradeCode + "'";
		}
		Query query = getCurrentSession().createSQLQuery(sql);
		query.setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);
		return query.list();
	}
	
	@Override
	public List<Map<String, Object>> getCount(String cooperationId) {
		String sql = "SELECT * "
				+"FROM "
					+"cooperationlist  "
				+"WHERE "
					+"`STATUS` = 'Y'";
		if (cooperationId!=null && cooperationId!="") {
			sql += " and cooperationId = '" + Integer.parseInt(cooperationId) + "'";
		}
		Query query = getCurrentSession().createSQLQuery(sql).setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);
		return query.list();
	}
}