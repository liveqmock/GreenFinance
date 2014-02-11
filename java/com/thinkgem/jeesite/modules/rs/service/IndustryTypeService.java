package com.thinkgem.jeesite.modules.rs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.thinkgem.jeesite.common.persistence.Page;
import com.thinkgem.jeesite.modules.rs.dao.IndustryTypeDAO;
import com.thinkgem.jeesite.modules.rs.entity.IndustryType;


@Service
@Transactional(readOnly = true)
public class IndustryTypeService{
	
	@Autowired
	private IndustryTypeDAO industryTypeDAO;
	
	public Page<IndustryType> findAll(Page<IndustryType> page){
		return industryTypeDAO.find(page);
	}
}
