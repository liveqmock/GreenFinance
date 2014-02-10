package com.thinkgem.jeesite.modules.rs.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.thinkgem.jeesite.common.persistence.Page;
import com.thinkgem.jeesite.modules.rs.entity.EnterBasicInfo;
import com.thinkgem.jeesite.modules.rs.service.EnterBasicInfoService;


@Controller
@RequestMapping(value = "${adminPath}/rs/enterBasicInfo")
public class EnterBasicInfoController {
	
	@Autowired
	private EnterBasicInfoService enterBasicInfoService;
	
	
	@RequestMapping(value = "")
	public String test(Model model){
		Page<EnterBasicInfo> page= enterBasicInfoService.find(new Page<EnterBasicInfo>(), null);
		model.addAttribute("page",page);
		return "modules/rs/enterBasicInfoList";
	}
	
}
