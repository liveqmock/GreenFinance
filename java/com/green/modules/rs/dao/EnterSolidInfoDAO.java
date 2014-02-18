package com.green.modules.rs.dao;

import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.green.common.persistence.BaseDao;
import com.green.common.persistence.Parameter;
import com.green.modules.rs.entity.EnterSolidInfo;

@Repository
public class EnterSolidInfoDAO extends BaseDao<EnterSolidInfo>{
	@SuppressWarnings("unchecked")
	public List<EnterSolidInfo> findBySolidItem(String itemId){
		
		String qlString = "from EnterSolidInfo where solidStandardItem.id like :p1";
		Query query = createQuery(qlString, new Parameter(itemId));
		query.setFirstResult(0);
		query.setMaxResults(10);
		return (List<EnterSolidInfo>)query.list();
	}
}
