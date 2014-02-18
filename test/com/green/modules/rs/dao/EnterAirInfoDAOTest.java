package com.green.modules.rs.dao;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.transaction.annotation.Transactional;

import com.green.modules.rs.AbstractIocTest;
import com.green.modules.rs.dao.AirStandardItemDAO;
import com.green.modules.rs.dao.EnterAirInfoDAO;
import com.green.modules.rs.dao.EnterBasicInfoDAO;
import com.green.modules.rs.entity.AirStandardItem;
import com.green.modules.rs.entity.EnterAirInfo;
import com.green.modules.rs.entity.EnterBasicInfo;
import com.green.modules.rs.entity.IndustryType;

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
