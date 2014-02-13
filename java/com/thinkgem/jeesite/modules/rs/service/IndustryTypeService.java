package com.thinkgem.jeesite.modules.rs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.thinkgem.jeesite.common.persistence.Page;
import com.thinkgem.jeesite.common.service.BaseService;
import com.thinkgem.jeesite.modules.rs.dao.IndustryTypeDAO;
import com.thinkgem.jeesite.modules.rs.entity.IndustryType;


@Service
@Transactional(readOnly = true)
public class IndustryTypeService extends BaseService{
	
	@Autowired
	private IndustryTypeDAO industryTypeDAO;
	
	
	public IndustryType get(String code){
		return industryTypeDAO.get(code);
	}
	
	public List<IndustryType> findAll(){
		return industryTypeDAO.find(new Page<IndustryType>()).getList();
	}
	
	public List<IndustryType> findByParentCode(String code){
		return industryTypeDAO.findByParentCode(code);
	}
	
	public IndustryType findByCode(String code){
		return industryTypeDAO.get(code);
	}
	
	@Transactional(readOnly = false)
	public void save(IndustryType industryType){
		IndustryType parent = industryType.getParent();
		industryType.setParents(parent.getParents() + "," + parent.getIndustryCode());
		industryTypeDAO.save(industryType);
	}
	
	@Transactional(readOnly = false)
	public void delete(String code){
		industryTypeDAO.deleteByCode(code);
	}
	
	
	
}
