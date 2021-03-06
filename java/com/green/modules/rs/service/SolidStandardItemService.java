package com.green.modules.rs.service;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.green.common.persistence.Page;
import com.green.common.service.BaseService;
import com.green.modules.rs.dao.SolidStandardItemDAO;
import com.green.modules.rs.entity.AirStandardItem;
import com.green.modules.rs.entity.EnterBasicInfo;
import com.green.modules.rs.entity.SolidStandardItem;

@Service
@Transactional(readOnly = true)
public class SolidStandardItemService extends BaseService{
	
	@Autowired
	private SolidStandardItemDAO solidStandardItemDAO;
	
	public Page<SolidStandardItem> findAll(Page<SolidStandardItem> page){
		DetachedCriteria dc = solidStandardItemDAO.createDetachedCriteria();
		dc.add(Restrictions.eq("delFlag",SolidStandardItem.DEL_FLAG_NORMAL));
		dc.addOrder(Order.asc("id"));
		return solidStandardItemDAO.find(page,dc);
	}
	
	public List<SolidStandardItem> findAll(){
		DetachedCriteria dc = solidStandardItemDAO.createDetachedCriteria();
		dc.add(Restrictions.eq("delFlag",SolidStandardItem.DEL_FLAG_NORMAL));
		dc.addOrder(Order.asc("id"));
		return solidStandardItemDAO.find(new Page<SolidStandardItem>(),dc).getList();
	}
	
	@Transactional(readOnly = false)
	public void save(SolidStandardItem solidStandardItem){
		solidStandardItemDAO.save(solidStandardItem);
	}
	
	@Transactional(readOnly = false)
	public void delete(String id){
		solidStandardItemDAO.deleteById(id);
	}
	
	
	public SolidStandardItem findById(String id){
		return solidStandardItemDAO.get(id);
	}
	
	
}
