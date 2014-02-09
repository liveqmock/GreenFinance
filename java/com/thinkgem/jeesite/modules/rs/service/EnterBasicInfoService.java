package com.thinkgem.jeesite.modules.rs.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.thinkgem.jeesite.modules.rs.dao.EnterBasicInfoDAO;


@Service
@Transactional
public class EnterBasicInfoService {
	
	@Autowired	
	private EnterBasicInfoDAO enterBasicInfoDAO;
	
	
}
