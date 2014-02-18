package com.green.modules.rs.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.green.common.web.BaseController;
import com.green.modules.rs.entity.IndustryType;
import com.green.modules.rs.service.IndustryTypeService;

@Controller
@RequestMapping(value = "${adminPath}/rs")
public class RsController extends BaseController{
	
	@Autowired
	private IndustryTypeService industryTypeService;
	
	@RequestMapping(value = "")
	public String index(Model model){
		return "modules/rs/rsIndex?detail=true";
	}
	
	@RequestMapping(value = "tree")
	public String tree(Model model){
		List<IndustryType> industryTypies = industryTypeService.findAll();
//		if(industryTypies != null){
//			for(IndustryType industryType : industryTypies){
//				System.out.println(industryType.getIndustryCode());
//				if(industryTypies.get(0).getParent() != null){
//					System.out.println(industryType.getParent().getIndustryCode());
//				}
//			}
//		}
		model.addAttribute("industryTypies",industryTypies);
		model.addAttribute("detail", true);
		return "modules/rs/rsTree";
	}
	@RequestMapping(value = "none")
	public String none() {
		return "modules/rs/rsNone";
	}
}
