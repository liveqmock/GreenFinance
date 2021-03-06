package com.green.modules.rs.dao;

import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import com.green.common.persistence.BaseDao;
import com.green.common.persistence.Parameter;
import com.green.modules.rs.entity.EnterAirInfo;

@Repository	
public class EnterAirInfoDAO extends BaseDao<EnterAirInfo>{
	
	@SuppressWarnings("unchecked")
	public List<EnterAirInfo> findByAirItem(String itemId){
		String qlString = "from EnterAirInfo where airStandardItem.id like :p1";
		Query query = this.createQuery(qlString,new Parameter(itemId));
		query.setFetchSize(0);
		query.setMaxResults(10);
		return (List<EnterAirInfo>)query.list();
	}
	
}
