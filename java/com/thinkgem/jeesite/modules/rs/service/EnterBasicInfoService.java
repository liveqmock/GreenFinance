package com.thinkgem.jeesite.modules.rs.service;


import org.hibernate.criterion.DetachedCriteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.thinkgem.jeesite.common.persistence.Page;
import com.thinkgem.jeesite.modules.rs.dao.EnterBasicInfoDAO;
import com.thinkgem.jeesite.modules.rs.entity.EnterBasicInfo;


@Service
@Transactional
public class EnterBasicInfoService {
	
	@Autowired	
	private EnterBasicInfoDAO enterBasicInfoDAO;
	
	public Page<EnterBasicInfo> find(Page<EnterBasicInfo> page,EnterBasicInfo enterBasicInfo){
		DetachedCriteria dc = enterBasicInfoDAO.createDetachedCriteria();
		return enterBasicInfoDAO.find(page,dc);
	}
	
	
}
