package com.green.modules.rs.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.green.common.config.Global;
import com.green.common.persistence.Page;
import com.green.common.web.BaseController;
import com.green.modules.rs.entity.AirStandardItem;
import com.green.modules.rs.service.AirStandardItemService;


@Controller
@RequestMapping(value = "${adminPath}/rs/airStandardItem")
public class AirStandardItemController extends BaseController{
	
	@Autowired
	private AirStandardItemService airStandardItemService;
	
	
	@RequestMapping(value = {"list",""})
	public String list(Model model,HttpServletRequest request, HttpServletResponse response){
		Page<AirStandardItem> page = airStandardItemService.findAll(new Page<AirStandardItem>(request,response));
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
	public String delete(@RequestParam String id,RedirectAttributes redirectAttributes){
		airStandardItemService.delete(id);
		addMessage(redirectAttributes,"删除成功");
		return "redirect:" + Global.getAdminPath() + "/rs/airStandardItem/list";
	}
	
	@RequestMapping(value = "gbList")
	public String gbList(Model model){
		List<AirStandardItem> airStandardItems =  airStandardItemService.findAll();
		model.addAttribute("airStandardItems", airStandardItems);
		return "modules/rs/gbAirStandardList";
	}
	
	
	@RequestMapping(value = "gbSave")
	public String gbSave(){
		return "";
	}
	
	
	
}
