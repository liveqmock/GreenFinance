package com.green.modules.rs.dao;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.green.common.persistence.BaseDao;
import com.green.common.persistence.BaseEntity;
import com.green.common.persistence.Page;
import com.green.common.persistence.Parameter;
import com.green.modules.rs.entity.EnterBasicInfo;

@Repository
public class EnterBasicInfoDAO extends BaseDao<EnterBasicInfo>{
	
	public int deleteByEnterCode(String enterCode){
		return update("update EnterBasicInfo set delFlag = '" + BaseEntity.DEL_FLAG_DELETE + "' where enterCode = :p1",
				new Parameter(enterCode));
	}
	
}
