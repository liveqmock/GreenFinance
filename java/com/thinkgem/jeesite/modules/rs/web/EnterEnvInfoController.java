package com.thinkgem.jeesite.modules.rs.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.thinkgem.jeesite.common.web.BaseController;
import com.thinkgem.jeesite.modules.rs.entity.EnterBasicInfo;
import com.thinkgem.jeesite.modules.rs.entity.IndustryType;
import com.thinkgem.jeesite.modules.rs.service.EnterBasicInfoService;
import com.thinkgem.jeesite.modules.rs.service.IndustryTypeService;

@Controller
@RequestMapping(value = "${adminPath}/rs/enterEnvInfo")
public class EnterEnvInfoController extends BaseController{
	
	@Autowired	
	private EnterBasicInfoService enterBasicInfoService;
	
	@Autowired
	private IndustryTypeService	industryTypeService;
	
	@RequestMapping(value = "")
	public String index(@RequestParam(required = false) String enterCode,Model model,EnterBasicInfo enterBasicInfo){
		if(enterCode != null){
			enterBasicInfo = enterBasicInfoService.findByEnterCode(enterCode);
			model.addAttribute("enterBasicInfo", enterBasicInfo);
		}
		return "modules/rs/enterEnvIndex";
	}
	
	
	@RequestMapping(value = "enterTree")
	public String enterTree(@RequestParam String industryCode,Model model){
		List<EnterBasicInfo> enterBasicInfos = enterBasicInfoService.findByIndustryCode(industryCode);
		model.addAttribute("enterBasicInfos", enterBasicInfos);
		return "modules/rs/enterTree";
	}
	
	
	@RequestMapping(value = "industryTree")
	public String industryTree(Model model){
		List<IndustryType> industryTypies = industryTypeService.findAll();
		model.addAttribute("industryTypies",industryTypies);
		model.addAttribute("detail", false);
		return "modules/rs/rsTree";
	}
	

}
