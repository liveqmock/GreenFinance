package com.thinkgem.jeesite.modules.rs.service;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.thinkgem.jeesite.modules.rs.dao.AirStandardItemDAO;
import com.thinkgem.jeesite.modules.rs.dao.EnterAirInfoDAO;
import com.thinkgem.jeesite.modules.rs.dao.EnterBasicInfoDAO;
import com.thinkgem.jeesite.modules.rs.entity.AirStandardItem;
import com.thinkgem.jeesite.modules.rs.entity.EnterAirInfo;
import com.thinkgem.jeesite.modules.rs.entity.EnterBasicInfo;


@Service
@Transactional(readOnly = true)
public class EnterAirInfoService {
	@Autowired
	private EnterAirInfoDAO enterAirInfoDAO;
	
	@Autowired	
	private EnterBasicInfoDAO enterBasicInfoDAO;
	
	@Autowired
	private AirStandardItemDAO airStandardItemDAO;
	
	/**
	 * 
	 * @param enterCode
	 * @param itemId
	 * @param value true success false failed
	 * @return
	 */
	@Transactional(readOnly = false)
	public boolean save(String enterCode, String itemId,double value,Date date){
		EnterAirInfo enterAirInfo = new EnterAirInfo();
		EnterBasicInfo enter = enterBasicInfoDAO.get(enterCode);
		AirStandardItem item = airStandardItemDAO.get(itemId);
		if(enter == null || item == null){
			return false;
		}
		enterAirInfo.setAirStandardItem(item);
		enterAirInfo.setEnterBasicInfo(enter);
		enterAirInfo.setValue(value);
		enterAirInfo.setDate(date);
		if(enterAirInfo.getAirStandardItem() != null)
			System.out.println(enterAirInfo.getAirStandardItem().getItemName());
		else
			System.out.println("airStandardItem is null");
		enterAirInfoDAO.save(enterAirInfo);
		return true;
	}
	
	
	public List<EnterAirInfo> findByAirItemId(String itemId){
		return enterAirInfoDAO.findByAirItem(itemId);
	}
	
	
}
