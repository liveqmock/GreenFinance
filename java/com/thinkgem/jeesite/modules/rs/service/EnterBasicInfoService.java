package com.thinkgem.jeesite.modules.rs.service;


import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.thinkgem.jeesite.common.persistence.Page;
import com.thinkgem.jeesite.modules.rs.dao.EnterBasicInfoDAO;
import com.thinkgem.jeesite.modules.rs.entity.EnterBasicInfo;


@Service
@Transactional(readOnly = true)
public class EnterBasicInfoService {
	
	@Autowired	
	private EnterBasicInfoDAO enterBasicInfoDAO;
	
	public EnterBasicInfo findByEnterCode(String enterCode){
		return enterBasicInfoDAO.get(enterCode);
	}
	
	public Page<EnterBasicInfo> find(Page<EnterBasicInfo> page){
		DetachedCriteria dc = enterBasicInfoDAO.createDetachedCriteria();
		dc.add(Restrictions.eq("delFlag",EnterBasicInfo.DEL_FLAG_NORMAL));
		dc.addOrder(Order.asc("enterCode"));
		return enterBasicInfoDAO.find(page,dc);
	}
	
	public Page<EnterBasicInfo> findByIndustryCode(Page<EnterBasicInfo> page,String industryCode){
		DetachedCriteria dc = enterBasicInfoDAO.createDetachedCriteria();
		dc.add(Restrictions.eq("delFlag",EnterBasicInfo.DEL_FLAG_NORMAL));
		dc.add(Restrictions.eq("industryType.industryCode",industryCode));
		dc.addOrder(Order.desc("enterCode"));
		return enterBasicInfoDAO.find(page,dc);
	}
	
	
	public List<EnterBasicInfo> findByIndustryCode(String industryCode){
		DetachedCriteria dc = enterBasicInfoDAO.createDetachedCriteria();
		dc.add(Restrictions.eq("delFlag",EnterBasicInfo.DEL_FLAG_NORMAL));
		dc.add(Restrictions.eq("industryType.industryCode",industryCode));
		dc.addOrder(Order.desc("enterCode"));
		return enterBasicInfoDAO.find(new Page<EnterBasicInfo>(),dc).getList();
	}
	
	@Transactional(readOnly = false)
	public void save(EnterBasicInfo enterBasicInfo){
		enterBasicInfoDAO.save(enterBasicInfo);
	}
	
	@Transactional(readOnly = false)
	public void delete(String enterCode){
		enterBasicInfoDAO.deleteByEnterCode(enterCode);
	}
	
	
}
