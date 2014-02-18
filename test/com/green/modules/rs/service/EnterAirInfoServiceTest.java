package com.green.modules.rs.service;

import static org.junit.Assert.assertTrue;
import org.junit.Test;
import java.sql.Date;
import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.transaction.annotation.Transactional;

import com.green.modules.rs.AbstractIocTest;
import com.green.modules.rs.service.EnterAirInfoService;

@Transactional
@ActiveProfiles("production")
public class EnterAirInfoServiceTest extends AbstractIocTest{
	@Autowired
	private EnterAirInfoService enterAirInfoService;
	
	@Test	
	@Transactional(readOnly = false)
	public void saveTest(){
		java.util.Date date = Calendar.getInstance().getTime();
		Date sqlDate = new java.sql.Date(date.getTime());
		boolean result = enterAirInfoService.save("09", "8b07fb2b273b4803833122043204ed81", 23.4, sqlDate);
		assertTrue(result);
	}
	
}
