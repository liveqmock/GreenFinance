package com.thinkgem.jeesite.modules.rs.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.thinkgem.jeesite.common.persistence.BaseDao;
import com.thinkgem.jeesite.common.persistence.Parameter;
import com.thinkgem.jeesite.modules.rs.entity.EnterAirInfo;

@Repository	
public class EnterAirInfoDAO extends BaseDao<EnterAirInfo>{
	
	public List<EnterAirInfo> findByAirItem(String itemId){
		String qlString = "from EnterAirInfo where airStandardItem.id like :p1";
		return find(qlString,new Parameter(itemId));
	}
	
}
