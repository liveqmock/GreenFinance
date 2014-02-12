package com.thinkgem.jeesite.modules.rs.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.thinkgem.jeesite.common.config.Global;
import com.thinkgem.jeesite.common.persistence.Page;
import com.thinkgem.jeesite.common.web.BaseController;
import com.thinkgem.jeesite.modules.rs.entity.AirStandardItem;
import com.thinkgem.jeesite.modules.rs.service.AirStandardItemService;


@Controller
@RequestMapping(value = "${adminPath}/rs/airStandardItem")
public class AirStandardItemController extends BaseController{
	
	@Autowired
	private AirStandardItemService airStandardItemService;
	
	@RequestMapping(value = {"list",""})
	public String list(Model model){
		Page<AirStandardItem> page = airStandardItemService.findAll(new Page<AirStandardItem>(10));
		model.addAttribute("page", page);
		return "modules/rs/airStandardItemList";
	}
	
	@RequestMapping(value = "form")
	public String form(@RequestParam(required = false) String id,AirStandardItem airStandardItem,Model model){
		if(id != null){
			airStandardItem = airStandardItemService.findById(id);
			model.addAttribute("airStandardItem",airStandardItem);
		}
		return "/modules/rs/airStandardItemForm";
	}
	
	@RequestMapping(value = "save")
	public String save(AirStandardItem airStandardItem,RedirectAttributes redirectAttributes){
		airStandardItemService.save(airStandardItem);
		addMessage(redirectAttributes,"保存成功");
		return "redirect:" + Global.getAdminPath() + "/rs/airStandardItem/list";
	}
	
	@RequestMapping(value = "delete")
	public String delete(@RequestParam int id,RedirectAttributes redirectAttributes){
		airStandardItemService.delete(id);
		addMessage(redirectAttributes,"删除成功");
		return "redirect:" + Global.getAdminPath() + "/rs/airStandardItem/list";
	}
	
	
}
