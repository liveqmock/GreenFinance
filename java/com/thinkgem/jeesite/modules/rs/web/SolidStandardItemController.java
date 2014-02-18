package com.thinkgem.jeesite.modules.rs.web;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.thinkgem.jeesite.common.config.Global;
import com.thinkgem.jeesite.common.persistence.Page;
import com.thinkgem.jeesite.common.web.BaseController;
import com.thinkgem.jeesite.modules.rs.entity.SolidStandardItem;

@Controller
@RequestMapping(value = "${adminPath}/rs/solidStandardItem")
public class SolidStandardItemController extends BaseController{
	
	@Autowired
	private com.thinkgem.jeesite.modules.rs.service.SolidStandardItemService solidStandardItemService;
	
	
	@RequestMapping(value = {"list",""})
	public String list(Model model,HttpServletRequest request, HttpServletResponse response){
		Page<SolidStandardItem> page = solidStandardItemService.findAll(new Page<SolidStandardItem>(request,response));
		model.addAttribute("page", page);
		return "modules/rs/solidStandardItemList";
	}
	
	@RequestMapping(value = "form")
	public String form(@RequestParam(required = false) String id,SolidStandardItem solidStandardItem,Model model){
		if(id != null){
			solidStandardItem = solidStandardItemService.findById(id);
			model.addAttribute("solidStandardItem",solidStandardItem);
		}
		return "/modules/rs/solidStandardItemForm";
	}
	
	@RequestMapping(value = "save")
	public String save(SolidStandardItem solidStandardItem,RedirectAttributes redirectAttributes){
		if(solidStandardItem.getEnterScope() == null || solidStandardItem.getEnterScope().isEmpty() ){
			solidStandardItem.setEnterScope("无");
		}
		System.out.println("------------------------------------------" + solidStandardItem.getEnterScope());
		solidStandardItemService.save(solidStandardItem);
		addMessage(redirectAttributes,"保存成功");
		return "redirect:" + Global.getAdminPath() + "/rs/solidStandardItem/list";
	}
	
	@RequestMapping(value = "delete")
	public String delete(@RequestParam String id,RedirectAttributes redirectAttributes){
		solidStandardItemService.delete(id);
		addMessage(redirectAttributes,"删除成功");
		return "redirect:" + Global.getAdminPath() + "/rs/solidStandardItem/list";
	}
	
}