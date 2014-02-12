package com.thinkgem.jeesite.modules.rs.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.thinkgem.jeesite.common.config.Global;
import com.thinkgem.jeesite.common.persistence.Page;
import com.thinkgem.jeesite.common.service.BaseService;
import com.thinkgem.jeesite.common.utils.StringUtils;
import com.thinkgem.jeesite.common.web.BaseController;
import com.thinkgem.jeesite.modules.rs.entity.EnterBasicInfo;
import com.thinkgem.jeesite.modules.rs.entity.IndustryType;
import com.thinkgem.jeesite.modules.rs.service.EnterBasicInfoService;
import com.thinkgem.jeesite.modules.rs.service.IndustryTypeService;
import com.thinkgem.jeesite.modules.sys.entity.User;


@Controller
@RequestMapping(value = "${adminPath}/rs/enterBasicInfo")
public class EnterBasicInfoController extends BaseController{
	
	@Autowired
	private EnterBasicInfoService enterBasicInfoService;
	
	@Autowired	
	private IndustryTypeService industryTypeService;
	
	@ModelAttribute
	public EnterBasicInfo get(@RequestParam(required=false) String enterCode) {
		if (StringUtils.isNotBlank(enterCode)){
			return enterBasicInfoService.findByEnterCode(enterCode);
		}else{
			return new EnterBasicInfo();
		}
	}

	@RequestMapping(value = "")
	public String index(){
		return "modules/rs/rsIndex";
	}
	
	
	@RequestMapping(value = "list")
	public String list(@RequestParam(required = false) String industryCode,Model model){
		if(industryCode != null){
			Page<EnterBasicInfo> page= enterBasicInfoService.findByIndustryCode(new Page<EnterBasicInfo>(10),industryCode);
			model.addAttribute("page",page);
		}
		return "modules/rs/enterBasicInfoList";
	}
	
	@RequestMapping(value = "form")
	public String form(@RequestParam(required = false) String enterCode,EnterBasicInfo enterBasicInfo,Model model){
		if(enterCode != null){
			enterBasicInfo = enterBasicInfoService.findByEnterCode(enterCode);
			List<IndustryType> industryTypies = industryTypeService.findAll();
			model.addAttribute("industryTypies",industryTypies);
			model.addAttribute("enterBasicInfo",enterBasicInfo);
		}
		return "modules/rs/enterBasicInfoForm";
	}
	
	@RequestMapping(value = "save")
	public String save(EnterBasicInfo enterBasicInfo,RedirectAttributes redirectAttributes){
		enterBasicInfoService.save(enterBasicInfo);
		addMessage(redirectAttributes,"保存成功");
		return "redirect:" + Global.getAdminPath() + "/rs/enterBasicInfo/list";
	}
	
	@RequestMapping(value = "delete")
	public String delete(@RequestParam String enterCode,RedirectAttributes redirectAttributes){
		enterBasicInfoService.delete(enterCode);
		addMessage(redirectAttributes,"删除成功");
		return "redirect:" + Global.getAdminPath() + "/rs/enterBasicInfo/list";
	}
	
}
