package com.thinkgem.jeesite.modules.rs.service;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.thinkgem.jeesite.common.service.BaseService;
import com.thinkgem.jeesite.modules.rs.dao.EnterBasicInfoDAO;
import com.thinkgem.jeesite.modules.rs.dao.EnterSolidInfoDAO;
import com.thinkgem.jeesite.modules.rs.dao.SolidStandardItemDAO;
import com.thinkgem.jeesite.modules.rs.entity.EnterBasicInfo;
import com.thinkgem.jeesite.modules.rs.entity.EnterSolidInfo;
import com.thinkgem.jeesite.modules.rs.entity.SolidStandardItem;


@Service
@Transactional(readOnly = true)
public class EnterSolidInfoService extends BaseService{
	
	@Autowired
	private EnterSolidInfoDAO enterSolidInfoDAO;
	
	@Autowired	
	private EnterBasicInfoDAO enterBasicInfoDAO;
	
	@Autowired
	private SolidStandardItemDAO solidStandardItemDAO;
	
	/**
	 * 
	 * @param enterCode
	 * @param itemId
	 * @param value true success false failed
	 * @return
	 */
	@Transactional(readOnly = false)
	public boolean save(String enterCode, String itemId,double value,Date date){
		EnterSolidInfo enterSolidInfo = new EnterSolidInfo();
		EnterBasicInfo enter = enterBasicInfoDAO.get(enterCode);
		SolidStandardItem item = solidStandardItemDAO.get(itemId);
		if(enter == null || item == null){
			return false;
		}
		enterSolidInfo.setSolidStandardItem(item);
		enterSolidInfo.setEnterBasicInfo(enter);
		enterSolidInfo.setValue(value);
		enterSolidInfo.setDate(date);
		if(enterSolidInfo.getSolidStandardItem() != null)
			System.out.println(enterSolidInfo.getSolidStandardItem().getItemName());
		else
			System.out.println("solidStandardItem is null");
		enterSolidInfoDAO.save(enterSolidInfo);
		return true;
	}
	
	
	public List<EnterSolidInfo> findBySolidItemId(String itemId){
		return enterSolidInfoDAO.findBySolidItem(itemId);
	}
	
	
}
