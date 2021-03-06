package com.green.modules.rs.web.front;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.common.collect.Lists;
import com.green.common.config.Global;
import com.green.common.mapper.JsonMapper;
import com.green.common.persistence.Page;
import com.green.common.servlet.ValidateCodeServlet;
import com.green.common.utils.StringUtils;
import com.green.common.web.BaseController;
import com.green.modules.cms.entity.Article;
import com.green.modules.cms.entity.Category;
import com.green.modules.cms.entity.Comment;
import com.green.modules.cms.entity.Link;
import com.green.modules.cms.entity.Site;
import com.green.modules.cms.service.ArticleService;
import com.green.modules.cms.service.CategoryService;
import com.green.modules.cms.service.CommentService;
import com.green.modules.cms.service.LinkService;
import com.green.modules.cms.utils.CmsUtils;
import com.green.modules.rs.entity.AirStandardItem;
import com.green.modules.rs.entity.EnterAirInfo;
import com.green.modules.rs.entity.EnterBasicInfo;
import com.green.modules.rs.entity.EnterSolidInfo;
import com.green.modules.rs.entity.IndustryType;
import com.green.modules.rs.entity.SolidStandardItem;
import com.green.modules.rs.service.AirStandardItemService;
import com.green.modules.rs.service.EnterAirInfoService;
import com.green.modules.rs.service.EnterBasicInfoService;
import com.green.modules.rs.service.EnterSolidInfoService;
import com.green.modules.rs.service.IndustryTypeService;
import com.green.modules.rs.service.SolidStandardItemService;
import com.green.modules.rs.utils.Data2LineChart;

/**
 * 网站Controller
 * @author MySugar
 * @version 2013-1-12
 */
/*想想这个/r连接到底应该是怎么进来的*/
@Controller
@RequestMapping(value = "${rsFrontPath}")
public class RsFrontController extends BaseController{
	
	@Autowired
	private ArticleService articleService;
	@Autowired
	private LinkService linkService;
	@Autowired
	private CommentService commentService;
	@Autowired
	private CategoryService categoryService;
	/*上面的暂时只为测试用，以后可以删掉*/
	@Autowired
	private IndustryTypeService industryTypeService;
	@Autowired
	private EnterBasicInfoService enterBasicInfoService;
	@Autowired
	private EnterAirInfoService enterAirInfoService;
	@Autowired
	private AirStandardItemService airStandardItemService;
	@Autowired
	private SolidStandardItemService solidStandardItemService;
	@Autowired
	private EnterSolidInfoService enterSolidInfoService;
	
	/**
	 * 网站首页
	 * 设置主题用到的
	 */
	@RequestMapping
	public String index(Model model) {
		System.out.println("------------111111");
		Site site = CmsUtils.getSite(Site.defaultSiteId());
		model.addAttribute("site", site);
		model.addAttribute("isIndex", true);
		model.addAttribute("warpMap", industryTypeService.getInderstryMap());
		return "modules/rs/front/frontIndex";
	}
	
	/**
	 * 网站首页
	 */
	@RequestMapping(value = "index-{siteId}${urlSuffix}")
	public String index(@PathVariable String siteId, Model model) {
		if (siteId.equals("1")){
			return "redirect:"+Global.getFrontPath();
		}
		Site site = CmsUtils.getSite(siteId);
		// 子站有独立页面，则显示独立页面
		if (StringUtils.isNotBlank(site.getCustomIndexView())){
			model.addAttribute("site", site);
			model.addAttribute("isIndex", true);
			return "modules/cms/front/themes/"+site.getTheme()+"/frontIndex"+site.getCustomIndexView();
		}
		// 否则显示子站第一个栏目
		String firstCategoryId = CmsUtils.getMainNavList(siteId).get(0).getId();
		return "redirect:"+Global.getFrontPath()+"/list-"+firstCategoryId+Global.getUrlSuffix();
	}
	

	/**
	 * 内容列表
	 */
	@RequestMapping(value = "list-{industryCode}${urlSuffix}")
	public String list(@PathVariable String industryCode, @RequestParam(required=false, defaultValue="1") Integer pageNo,
			@RequestParam(required=false, defaultValue="15") Integer pageSize, Model model) {
		System.out.println("行业列表的页面");
		
		//想想获取到的是什么，然后返回什么
//		//还要不要判断是一级行业还是二级行业呢
//		
//		model.addAttribute("indurstryList", indurstryList);
//		//如果是一级栏目怎么样
//		List<IndustryType> indurstryList = industryTypeService.findByParentCode(indurstryCode);
		List<EnterBasicInfo> enterBasicInfos = enterBasicInfoService.findByIndustryCode(industryCode);
		IndustryType industryType = industryTypeService.findByCode(industryCode);
		//总不能每个页面都要重新获取一次吧
		model.addAttribute("warpMap", industryTypeService.getInderstryMap());
		//这个获取请求的目的是显示该行业下所有的企业
//		if (enterBasicInfos.size()==0){
//			//如果这里面不含有企业返回一个页面
//			return "error/404";
//		}
		//还要返回这个industry的信息
		model.addAttribute("industryType", industryType);
		model.addAttribute("enterBasicInfos", enterBasicInfos);
		Page<EnterBasicInfo> page = new Page<EnterBasicInfo>(1,1,-1);
		EnterBasicInfo enterBasicInfo = new EnterBasicInfo();
//		Article article = new Article(category);
		page = enterBasicInfoService.findByIndustryCode(page, industryCode);
//		page = articleService.find(page, article, false);
		if (page.getList().size()>0) {
			enterBasicInfo = page.getList().get(0);
		
		}
		model.addAttribute("page", page);
		model.addAttribute("enterBasicInfo", enterBasicInfo);
		//还要获取他们企业 enterbasicInfo  是通过企业的id进入他的主页
		// 2：简介类栏目，栏目第一条内容
		return "modules/rs/front/frontList";

	}

	/**
	 * 显示内容
	 */
	@RequestMapping(value = "view-{enterCode}-{contentId}${urlSuffix}")
	public String view(@PathVariable String enterCode,@PathVariable String contentId, Model model) {
		model.addAttribute("warpMap", industryTypeService.getInderstryMap());
		System.out.println(enterCode+"!!!!!!!!!!!已经到达view页面了"+contentId);
		if (enterCode==null){
			return "error/404";
		}
		//首先要获取企业的基本信息
		EnterBasicInfo enterBasicInfo = enterBasicInfoService.findByEnterCode(enterCode);
		model.addAttribute("enterBasicInfo", enterBasicInfo);
		if (contentId.equals("1")){
			
			model.addAttribute("warpMap", industryTypeService.getInderstryMap());
		//还有主页上的一部分信息
			List<String> imagePtah = new ArrayList<String>();
			List<EnterBasicInfo> enterBasicInfos = enterBasicInfoService.findByIndustryCode(enterBasicInfo.getIndustryType().getIndustryCode());
			for (int i = 0; i < enterBasicInfos.size(); i++) {
				//把写入ImagePath
//				imagePtah.add(enterBasicInfos.get(i).)
			}
			System.out.println("返回"+"modules/rs/front/frontIndex");
			return "modules/rs/front/frontIndex";
		}
		if (contentId.equals("2")){
				List<AirStandardItem> airItems = airStandardItemService.findAll();
				List<List<EnterAirInfo>> airInfoss = Lists.newArrayList();
				List<String> charts = Lists.newArrayList();
				for(AirStandardItem item : airItems){
					List<EnterAirInfo> airInfos = enterAirInfoService.findByAirItemId(item.getId());
					Map<String,List> infos = new HashMap<String, List>();
					List<String> labelList = Lists.newArrayList();
					List<String> dataList = Lists.newArrayList();
					List<String> dataList2 = Lists.newArrayList();
					for(EnterAirInfo info : airInfos){
						labelList.add(info.getDate().toString());
						dataList.add(info.getValue().toString());
						dataList2.add("1");
					}
					infos.put("label", labelList);
					infos.put("standard", dataList2);
					infos.put("fact1",dataList);
					String strInfo = Data2LineChart.data2Chart(infos);
					charts.add(strInfo);
					airInfoss.add(airInfos);
				}
				
				model.addAttribute("charts", charts);
				model.addAttribute("airInfoss", airInfoss);
//				model.addAttribute("chart",strInfo);
				model.addAttribute("lineOptions",Data2LineChart.LINEOPTIONS);
				System.out.println("返回"+"modules/rs/front/EnAir.jsp");
				return "modules/rs/front/EnAir";
			}
		if (contentId.equals("5")){
			List<SolidStandardItem> solidStandardItems = solidStandardItemService.findAll();
			List<List<EnterSolidInfo>> solidInfoss = Lists.newArrayList();
			List<String> charts = Lists.newArrayList();
			for(SolidStandardItem item : solidStandardItems){
				List<EnterSolidInfo> solidInfos = enterSolidInfoService.findBySolidItemId(item.getId());
				Map<String,List> infos = new HashMap<String, List>();
				List<String> labelList = Lists.newArrayList();
				List<String> dataList = Lists.newArrayList();
				List<String> dataList2 = Lists.newArrayList();
				for(EnterSolidInfo info : solidInfos){
					labelList.add(info.getDate().toString());
					dataList.add(info.getValue().toString());
					dataList2.add("1");
				}
				infos.put("label", labelList);
				infos.put("standard", dataList2);
				infos.put("fact1",dataList);
				String strInfo = Data2LineChart.data2Chart(infos);
				charts.add(strInfo);
				solidInfoss.add(solidInfos);
			}
			
			model.addAttribute("charts", charts);
			model.addAttribute("solidInfoss", solidInfoss);
//			model.addAttribute("chart",strInfo);
			model.addAttribute("lineOptions",Data2LineChart.LINEOPTIONS);
			System.out.println(enterCode+enterBasicInfo.getEnterName());
			System.out.println("返回"+"modules/rs/front/EnSolid.jsp");
			return "modules/rs/front/EnSolid";
		}
		return "error/404";
	}
	

    
	
}
