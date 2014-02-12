package com.thinkgem.jeesite.modules.rs.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.thinkgem.jeesite.common.persistence.BaseDao;
import com.thinkgem.jeesite.common.persistence.Parameter;
import com.thinkgem.jeesite.modules.rs.entity.IndustryType;

@Repository
public class IndustryTypeDAO extends BaseDao<IndustryType>{
	
	public List<IndustryType> findByParentCode(String parentCode){
		return find("from IndustryType where parent.industryCode like :p1", new Parameter(parentCode));
	}
	
	
	public void deleteByCode(String code){
		IndustryType deleteItem = this.get(code);
		List<IndustryType> children = findByParentCode(code);
		if(children != null && !children.isEmpty()){
			for(IndustryType child : children){
				getSession().delete(child);
			}
		}
		getSession().delete(deleteItem);
	}
}
