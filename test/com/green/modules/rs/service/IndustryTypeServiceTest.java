package com.green.modules.rs.service;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.transaction.annotation.Transactional;

import com.green.modules.rs.AbstractIocTest;
import com.green.modules.rs.entity.IndustryType;
import com.green.modules.rs.service.IndustryTypeService;

@Transactional
@ActiveProfiles("production")
public class IndustryTypeServiceTest extends AbstractIocTest{
	
	@Autowired
	private IndustryTypeService industryTypeService;
	
	
	@Test
	public void saveTest(){
		IndustryType industryType = industryTypeService.get("01");
		System.out.println(industryType.getParents());
		
		
		assertTrue(true);
	}

}
