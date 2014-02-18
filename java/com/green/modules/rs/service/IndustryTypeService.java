package com.green.modules.rs.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.green.common.persistence.Page;
import com.green.common.service.BaseService;
import com.green.modules.rs.dao.IndustryTypeDAO;
import com.green.modules.rs.entity.IndustryType;


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
	
	public Map<String, List<IndustryType>> getInderstryMap(){
		System.out.println("正在获取InderstryMap！！！！！！！！！！");
		return industryTypeDAO.getInderstryMap();
	}
	
	
	@Transactional(readOnly = false)
	public void save(IndustryType industryType){
		IndustryType parent = this.get(industryType.getParent().getIndustryCode());
		if(parent.getParents() != null){
			industryType.setParents(parent.getParents() + "," + parent.getIndustryCode());
		}else{
			industryType.setParents(parent.getIndustryCode());
		}
		industryTypeDAO.save(industryType);
	}
	
	@Transactional(readOnly = false)
	public void delete(String code){
		industryTypeDAO.deleteByCode(code);
	}
	
	
	
}
