package com.thinkgem.jeesite.modules.rs.dao;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.transaction.annotation.Transactional;

import com.thinkgem.jeesite.modules.rs.AbstractIocTest;
import com.thinkgem.jeesite.modules.rs.entity.AirStandardItem;
import com.thinkgem.jeesite.modules.rs.entity.EnterAirInfo;
import com.thinkgem.jeesite.modules.rs.entity.EnterBasicInfo;
import com.thinkgem.jeesite.modules.rs.entity.IndustryType;

@ActiveProfiles("production")
@Transactional(readOnly = false)
public class EnterAirInfoDAOTest extends AbstractIocTest{
	
	@Autowired	
	private EnterAirInfoDAO enterAirInfoDAO;
	
	@Autowired
	private AirStandardItemDAO airStandardItemDAO;
	
	@Autowired
	private EnterBasicInfoDAO enterBasicInfoDAO;
	
	@Test
	public void save(){
		EnterAirInfo enterAirInfo = new EnterAirInfo();
		EnterBasicInfo enterBasicInfo = enterBasicInfoDAO.get("1");
		AirStandardItem airStandardItem = airStandardItemDAO.get("1");
		enterAirInfo.setAirStandardItem(airStandardItem);
		enterAirInfo.setEnterBasicInfo(enterBasicInfo);
		enterAirInfoDAO.save(enterAirInfo);
		assertTrue(true);
	}
	
}
