package com.green.modules.rs.web;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.green.common.config.Global;
import com.green.common.web.BaseController;
import com.green.modules.rs.entity.IndustryType;
import com.green.modules.rs.service.IndustryTypeService;

@Controller
@RequestMapping(value = "${adminPath}/rs/industryType")
public class industryTypeController extends BaseController{
	
	@Autowired
	private IndustryTypeService industryTypeService;
	
	@RequestMapping(value = {"list",""})
	public String list(Model model){
		List<IndustryType> industryTypies = industryTypeService.findAll();
		List<IndustryType> list = Lists.newArrayList();
		IndustryType.sortList(list, industryTypies, "0");
		model.addAttribute("industryTypies",list);
		return "modules/rs/industryTypeList";
	}
	
	
	@RequestMapping(value = "listData")
	public String listData(Model model){
		List<IndustryType> industryTypies = industryTypeService.findAll();
		List<IndustryType> list = Lists.newArrayList();
		IndustryType.sortList(list, industryTypies, "0");
		model.addAttribute("industryTypies",list);
		return "modules/rs/selectEnter";
	}

	
	@RequestMapping(value = "form")
	public String form(@RequestParam(required = false) String code,@RequestParam(required = false) String parentCode,
			IndustryType industryType,Model model){
		if(code != null){
			industryType = industryTypeService.findByCode(code);
		}
		if(parentCode != null){
			IndustryType parent = industryTypeService.get(parentCode);
			industryType.setParent(parent);
		}
		if(industryType.getParent() == null){
			IndustryType parent = industryTypeService.get("0");
			industryType.setParent(parent);
		}
		model.addAttribute("industryType", industryType);
		return "modules/rs/industryTypeForm";
	}
	
	@RequestMapping(value = "delete")
	public String delete(@RequestParam String code,RedirectAttributes redirectAttributes){
		industryTypeService.delete(code);
		addMessage(redirectAttributes, "删除成功");
		return "redirect:" + Global.getAdminPath() + "/rs/industryType/list";
	}
	
	@RequestMapping(value = "save")
	public String save(IndustryType industryType,RedirectAttributes redirectAttributes){
		industryTypeService.save(industryType);
		addMessage(redirectAttributes, "保存成功");
		return "redirect:" + Global.getAdminPath() + "/rs/industryType/list";
	}
	
	@ResponseBody	
	@RequestMapping(value = "treeData")
	public List<Map<String,Object>> treeData(@RequestParam(required = false) String extId, HttpServletResponse response){
		response.setContentType("application/json;charset=UTF-8");
		List<Map<String,Object>> mapList = Lists.newArrayList();
		List<IndustryType> list = industryTypeService.findAll();
		for(IndustryType industryType : list){
//			if((extId == null || extId.isEmpty()) || (extId != null && !extId.equals(industryType.getIndustryCode()) && 
//					!industryType.getParent().getIndustryCode().equals(extId))){
				Map<String,Object> map = Maps.newHashMap();
				map.put("id", industryType.getIndustryCode());
				map.put("pId",industryType.getParent()!=null?industryType.getParent().getIndustryCode():'0');
				map.put("name",industryType.getIndustryName());
				mapList.add(map);
//			}
		}
		return mapList;
	}
	
	
}
