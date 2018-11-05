package cn.sfinance.dao.impl;

import org.hibernate.Query;
import org.hibernate.transform.Transformers;
import org.springframework.stereotype.Repository;

import cn.sfinance.dao.CooperationlinkDao;

import java.util.List;
import java.util.Map;

@Repository("cooperationlinkDao")
public class CooperationlinkDaoImpl<Cooperationlink> extends BaseDaoImpl<Cooperationlink> implements CooperationlinkDao<Cooperationlink>{

    @Override
    public List<Map<String, Object>> getList(Integer pageNumber,Integer pageSize,String parent,boolean isPage) {
        String sql ="select * from cooperationlink where STATUS='Y' ";
        if (parent!=null && parent!="") {
            sql += " and parent = " + parent;
        }
        if (isPage) {
            sql += " and id limit " + (pageNumber - 1) * pageSize + "," + pageSize;
        }
        Query query = getCurrentSession().createSQLQuery(sql);
        query.setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);
        return query.list();
    }

}