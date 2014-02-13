package com.thinkgem.jeesite.modules.rs.service;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.thinkgem.jeesite.common.persistence.Page;
import com.thinkgem.jeesite.common.service.BaseService;
import com.thinkgem.jeesite.modules.rs.dao.AirStandardItemDAO;
import com.thinkgem.jeesite.modules.rs.entity.AirStandardItem;

@Service
@Transactional(readOnly = true)
public class AirStandardItemService extends BaseService{
	
	@Autowired
	private AirStandardItemDAO airStandardItemDAO;

	public Page<AirStandardItem> findAll(Page<AirStandardItem> page){
		DetachedCriteria dc = airStandardItemDAO.createDetachedCriteria();
		dc.addOrder(Order.asc("id"));
		return airStandardItemDAO.find(page,dc);
	}
	
	public AirStandardItem findById(String id){
		return airStandardItemDAO.get(id);
	}
	
	@Transactional(readOnly = false)
	public void save(AirStandardItem airStandardItem){
		airStandardItemDAO.save(airStandardItem);
	}
	
	@Transactional(readOnly = false)
	public void delete(int id){
		airStandardItemDAO.deleteById(id);
	}
	
}