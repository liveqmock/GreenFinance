package com.thinkgem.jeesite.modules.rs.web.front;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.thinkgem.jeesite.common.web.BaseController;
import com.thinkgem.jeesite.modules.rs.entity.EnterBasicInfo;
import com.thinkgem.jeesite.modules.rs.service.EnterBasicInfoService;
import com.thinkgem.jeesite.modules.rs.service.IndustryTypeService;
import com.thinkgem.jeesite.modules.sys.entity.User;
import com.thinkgem.jeesite.modules.sys.service.SystemService;

@Controller
public class RsLoginController extends BaseController {

	@Autowired
	EnterBasicInfoService enterBasicInfoService;
	@Autowired
	IndustryTypeService industryTypeService;
	
	@Autowired
	private SystemService systemService;
	
	/**
	 * 管理登录
	 */
	@RequestMapping(value = "${frontPath}/rs-login", method = RequestMethod.POST)
	public String login(@RequestParam String username,@RequestParam String password,@RequestParam String type, Model model) {
		System.out.println(username+password+type+"----");
		System.out.println("测试ing");
		User user =  systemService.getUserByLoginName(username);
		if(SystemService.validatePassword(password, user.getPassword())){
			EnterBasicInfo enterBasicInfo = enterBasicInfoService.findByEnterCode(user.getRemarks());
			model.addAttribute("enterBasicInfo", enterBasicInfo);
			model.addAttribute("warpMap", industryTypeService.getInderstryMap());
			return "modules/rs/front/frontIndex";
		}
		return "modules/cms/cmsIndex";
	}
}
