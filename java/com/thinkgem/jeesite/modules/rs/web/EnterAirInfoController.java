package com.thinkgem.jeesite.modules.rs.web;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.google.common.collect.Lists;
import com.thinkgem.jeesite.common.web.BaseController;
import com.thinkgem.jeesite.modules.rs.dao.AirStandardItemDAO;
import com.thinkgem.jeesite.modules.rs.entity.AirStandardItem;
import com.thinkgem.jeesite.modules.rs.entity.EnterBasicInfo;
import com.thinkgem.jeesite.modules.rs.service.AirStandardItemService;
import com.thinkgem.jeesite.modules.rs.service.EnterAirInfoService;
import com.thinkgem.jeesite.modules.rs.service.EnterBasicInfoService;

@Controller
@RequestMapping(value = "${adminPath}/rs/enterAirInfo")
public class EnterAirInfoController extends BaseController{
	
	@Autowired
	private AirStandardItemService airStandardItemService;
	
	@Autowired
	private EnterBasicInfoService enterBasicInfoService;
	
	@Autowired
	private EnterAirInfoService enterAirInfoService;
	
	
	@RequestMapping(value ="")
	public String index(@RequestParam(required = false) String enterCode,Model model,EnterBasicInfo enterBasicInfo){
		
		if(enterCode != null){
			enterBasicInfo = enterBasicInfoService.findByEnterCode(enterCode);
			model.addAttribute("enterBasicInfo", enterBasicInfo);
			List<AirStandardItem> airStandardItems = Lists.newArrayList();
			airStandardItems = airStandardItemService.findAll();
			if(airStandardItems != null && !airStandardItems.isEmpty()){
				System.out.println(airStandardItems.get(0).getItemName());
			}
			model.addAttribute("airStandardItems", airStandardItems);
		}
		return "modules/rs/enterEnvIndex";
	}
	
	
	@RequestMapping(value="save")
	public String save(String[] enterCodes,String[] itemIds,String date,String[] values,RedirectAttributes redirecteAttributes){
		int length = enterCodes.length;
		for(int i = 0; i< length; i++){
			System.out.println(enterCodes[i]);
			System.out.println(itemIds[i]);
			System.out.println(date);
			System.out.println(values[i]);
			SimpleDateFormat dateFormate = new SimpleDateFormat("yyyy-mm-dd");
			java.util.Date utilDate = null;
			try {
				utilDate = dateFormate.parse(date);
			} catch (ParseException e) {
				// TODO Auto-generated catch bloc
				e.printStackTrace();
			}
			Date sqlDate = new Date(utilDate.getTime());
			boolean result = enterAirInfoService.save(enterCodes[i], itemIds[i], Double.parseDouble(values[i]), sqlDate);
			if(!result){
				// todo!
			}
		}
		return "modules/rs/enterEnvIndex";
	}

}
