package com.green.modules.rs.web;

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
import com.green.common.web.BaseController;
import com.green.modules.rs.entity.AirStandardItem;
import com.green.modules.rs.entity.EnterBasicInfo;
import com.green.modules.rs.entity.SolidStandardItem;
import com.green.modules.rs.service.AirStandardItemService;
import com.green.modules.rs.service.EnterAirInfoService;
import com.green.modules.rs.service.EnterBasicInfoService;
import com.green.modules.rs.service.EnterSolidInfoService;
import com.green.modules.rs.service.SolidStandardItemService;

@Controller
@RequestMapping(value = "${adminPath}/rs/enterSolidInfo")
public class EnterSolidInfoController extends BaseController{
	
	@Autowired
	private SolidStandardItemService solidStandardItemService;
	
	@Autowired
	private EnterBasicInfoService enterBasicInfoService;
	
	@Autowired
	private EnterSolidInfoService enterSolidInfoService;
	
	
	@RequestMapping(value ="")
	public String index(@RequestParam(required = false) String enterCode,Model model,EnterBasicInfo enterBasicInfo){
		
		if(enterCode != null){
			enterBasicInfo = enterBasicInfoService.findByEnterCode(enterCode);
			model.addAttribute("enterBasicInfo", enterBasicInfo);
			List<SolidStandardItem> solidStandardItems = Lists.newArrayList();
			solidStandardItems = solidStandardItemService.findAll();
			if(solidStandardItems != null && !solidStandardItems.isEmpty()){
				System.out.println(solidStandardItems.get(0).getItemName());
			}
			model.addAttribute("solidStandardItems", solidStandardItems);
		}
		return "modules/rs/enterSolidInfo";
	}
	
	
	@RequestMapping(value="save")
	public String save(String[] enterCodes,String[] itemIds,String date,String[] values,RedirectAttributes redirecteAttributes,Model model){
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
			boolean result = enterSolidInfoService.save(enterCodes[i], itemIds[i], Double.parseDouble(values[i]), sqlDate);
			if(!result){
				// todo!
			}

		}
		return "modules/rs/enterSolidInfo";
	}

}