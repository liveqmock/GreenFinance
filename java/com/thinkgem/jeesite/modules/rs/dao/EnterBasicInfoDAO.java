package com.thinkgem.jeesite.modules.rs.dao;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.thinkgem.jeesite.common.persistence.BaseDao;
import com.thinkgem.jeesite.common.persistence.BaseEntity;
import com.thinkgem.jeesite.common.persistence.Page;
import com.thinkgem.jeesite.common.persistence.Parameter;
import com.thinkgem.jeesite.modules.rs.entity.EnterBasicInfo;

@Repository
public class EnterBasicInfoDAO extends BaseDao<EnterBasicInfo>{
	
	public int deleteByEnterCode(String enterCode){
		return update("update EnterBasicInfo set delFlag = '" + BaseEntity.DEL_FLAG_DELETE + "' where enterCode = :p1",
				new Parameter(enterCode));
	}
	
}
