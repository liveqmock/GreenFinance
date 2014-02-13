package com.thinkgem.jeesite.modules.rs.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.thinkgem.jeesite.common.web.BaseController;

@Controller
@RequestMapping(value = "${adminPath}/rs/enterAirInfo")
public class EnterAirInfoController extends BaseController{
	
	@RequestMapping(value ="")
	public String index(){
		return "modules/rs/enterAirInfoForm";
	}

}
