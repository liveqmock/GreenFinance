<%@ page contentType="text/html;charset=UTF-8"%>
<!-- 下面引用总标签库文件  包括了jstl、shiro、自定义标签、全局变量等 -->
<%@ include file="/WEB-INF/views/modules/cms/front/include/taglib.jsp"%>
<!-- sitemesh 标签库文件 -->
<%@ taglib prefix="sitemesh"
	uri="http://www.opensymphony.com/sitemesh/decorator"%>
<!DOCTYPE html>
<html>
<head>

<%@include file="/WEB-INF/views/modules/rs/front/include/head.jsp"%>
<title><sitemesh:title default="欢迎光临" /> - ${site.title} -
	Powered By Absurd-Sugar</title>


<sitemesh:head />
</head>

<body>
	<!--top begin-->
	<div class="top">
		<div class="wrap">
			<span class="fl">欢迎来到<a href="#" title="" target="_blank">绿色金融网</a></span>
			<span class="fr"><a href="#" title="" target="_blank">请登录</a>&nbsp;&nbsp;<a
				href="#" title="" target="_blank">立即注册</a></span>
		</div>
	</div>
	<!--top end-->
	<!--header begin-->
	<div class="header">
		<div class="wrap">
			<a href="#" title="" target="_blank"><img
				src="${ctxStatic}/rs/ad1.jpg" width="1004" height="40" /></a>
			<div class="search_box">
				<a href="#" title="" target="_blank"><img
					src="${ctxStatic}/rs/logo.jpg" width="389" height="53" alt=""
					class="fl" /></a>
				<div class="search">
					<div id="lenu1">
						<ul>
							<li class="hover" onmousemove="setTab(1,0)">行业<span>|</span></li>
							<li onmousemove="setTab(1,1)">企业<span>|</span></li>
						</ul>
					</div>
					<div class="lain1_box" id="lain1">
						<ul class="block">
							<li><input type="text"
								style=" border: 1px solid #A64B54; height: 30px; padding:0 0 0 5px; width: 410px; margin:0;"
								value="请输入行业名称"
								onFocus="if(this.value=='请输入产品名称'){this.value='';}"
								onBlur="if(this.value==''){this.value='请输入产品名称';}"
								class="sertxt" /><input type="button" value="搜 索" name=""
								class="serbtn" /></li>
						</ul>
						<ul>
							<li><input type="text" value="请输入企业名称"
								style=" border: 1px solid #A64B54; height: 30px; padding:0 0 0 5px; width: 410px; margin:0;"
								onFocus="if(this.value=='请输入企业名称'){this.value='';}"
								onBlur="if(this.value==''){this.value='请输入企业名称';}"
								class="sertxt" /><input type="button" value="搜 索" name=""
								class="serbtn" /></li>
						</ul>
					</div>
				</div>
				<div class="cb"></div>
			</div>
		</div>
		<!-- 左侧导航条部分 -->
		<div id="warp1000">
			<!--  -->
			<div id="allsort">
				<h2 style={text-align:center;}>
					<a name="navh00" href="" target="_blank" >所有行业分类</a>
				</h2>
			<!-- 一级行业列表 -->
				<div id="allsortlist">
					<!-- 一级行业 -->
					<div class="navlist icon01" style="z-index: 0;">

						<h3 class="">
							<a name="navh01" href="http://www.ablanxue.com" target="_blank">图书</a>

							<b></b>
						</h3>
						<div class="navmore" style="display: none;">
						<!-- 每个dl是一个二级行业 -->
							<dl>

								<dt>
									<a name="navh0101"
										href="http://www.kaiwo123.com/webapp/wcs/stores/servlet/cd_10052_22001_-7_Y_226503_226504_.html"
										title="" target="_blank">教育</a>
								</dt>
						<!-- 每个dd行业 -->
								<dd>

									<a name="navh010101"
										href="http://www.kaiwo123.com/webapp/wcs/stores/servlet/trd_10052_22001_1_226017_.html"
										title="工具书" target="_blank">工具书</a>


								</dd>
							</dl>


							<dl>

								<dt>
									<a name="navh0102"
										href="http://www.kaiwo123.com/webapp/wcs/stores/servlet/cd_10052_22001_-7_Y_226503_226505_.html"
										title="" target="_blank">经济与管理</a>
								</dt>
								<dd>

									<a name="navh010201"
										href="http://www.kaiwo123.com/webapp/wcs/stores/servlet/trd_10052_22001_1_226519_.html"
										title="财务会计" target="_blank">财务会计</a>

								</dd>
							</dl>


							<dl>

								<dt>
									<a name="navh0103"
										href="http://www.kaiwo123.com/webapp/wcs/stores/servlet/cd_10052_22001_-7_Y_226503_226506_.html"
										title="" target="_blank">科技</a>
								</dt>
								<dd>

									<a name="navh010301"
										href="http://www.kaiwo123.com/webapp/wcs/stores/servlet/trd_10052_22001_1_226629_.html"
										title="大农业" target="_blank">大农业</a>

								</dd>
							</dl>


							<dl>

								<dt>
									<a name="navh0104"
										href="http://www.kaiwo123.com/webapp/wcs/stores/servlet/cd_10052_22001_-7_Y_226503_226507_.html"
										title="" target="_blank">励志与成功</a>
								</dt>
								<dd>

									<a name="navh010401"
										href="http://www.kaiwo123.com/webapp/wcs/stores/servlet/trd_10052_22001_1_226315_.html"
										title="财富/智慧" target="_blank">财富/智慧</a>

								</dd>
							</dl>


							<dl>

								<dt>
									<a name="navh0105"
										href="http://www.kaiwo123.com/webapp/wcs/stores/servlet/cd_10052_22001_-7_Y_226503_226508_.html"
										title="" target="_blank">少儿</a>
								</dt>
								<dd>

									<a name="navh010501"
										href="http://www.kaiwo123.com/webapp/wcs/stores/servlet/trd_10052_22001_1_226008_.html"
										title="幼儿读物（6岁以下）" target="_blank">幼儿读物（6岁以下）</a>

								</dd>
							</dl>


							<dl>

								<dt>
									<a name="navh0106"
										href="http://www.kaiwo123.com/webapp/wcs/stores/servlet/cd_10052_22001_-7_Y_226503_226509_.html"
										title="" target="_blank">社科</a>
								</dt>
								<dd>

									<a name="navh010601"
										href="http://www.kaiwo123.com/webapp/wcs/stores/servlet/trd_10052_22001_1_226195_.html"
										title="法律" target="_blank">法律</a>

								</dd>
							</dl>


							<dl>

								<dt>
									<a name="navh0107"
										href="http://www.kaiwo123.com/webapp/wcs/stores/servlet/cd_10052_22001_-7_Y_226503_226510_.html"
										title="" target="_blank">生活休闲</a>
								</dt>
								<dd>

									<a name="navh010701"
										href="http://www.kaiwo123.com/webapp/wcs/stores/servlet/trd_10052_22001_1_226332_.html"
										title="宠物园艺" target="_blank">宠物园艺</a>

								</dd>
							</dl>


							<dl>

								<dt>
									<a name="navh0108"
										href="http://www.kaiwo123.com/webapp/wcs/stores/servlet/cd_10052_22001_-7_Y_226503_226511_.html"
										title="" target="_blank">文艺</a>
								</dt>
								<dd>

									<a name="navh010801"
										href="http://www.kaiwo123.com/webapp/wcs/stores/servlet/trd_10052_22001_1_226770_.html"
										title="传记" target="_blank">传记</a>

								</dd>
							</dl>


							<dl>

								<dt>
									<a name="navh0109"
										href="http://www.suning.com/webapp/wcs/stores/servlet/trd_10052_22001_1_226163_.html"
										title="" target="_blank">综合图书</a>
								</dt>
								<dd>

									<a name="navh010901"
										href="http://www.kaiwo123.com/webapp/wcs/stores/servlet/trd_10052_22001_1_226160_.html"
										title="音像制品" target="_blank">音像制品</a>

								</dd>
							</dl>


						</div>

					</div>


					<div class="navlist icon02" style="z-index: 0;">

						<h3 class="">
							<a name="navh02"
								href="http://life.suning.com/epp-ppp/mo/mobile!input.action"
								target="_blank">充值、缴费</a> <b></b>
						</h3>
						<div class="navmore" style="display: none;">

							<dl>
								<dt>
									<a name="navh0201"
										href="http://life.suning.com/epp-ppp/mo/mobile!input.action"
										title="" target="_blank">话费充值</a>
								</dt>
								<dd>

									<a name="navh020101"
										href="http://life.suning.com/epp-ppp/mo/mobile!input.action"
										title="移动" target="_blank">移动</a>
								</dd>
							</dl>


							<dl>
								<dt>
									<a name="navh0202"
										href="http://life.suning.com/epp-ppp/ch/charge/charge!input.action"
										title="" target="_blank">生活缴费</a>
								</dt>
								<dd>

									<a name="navh020201"
										href="http://life.suning.com/epp-ppp/ch/charge/charge!input.action"
										title="水费" target="_blank">水费</a>
								</dd>
							</dl>

						</div>


					</div>

					<div class="navlist icon03">

						<h3>
							<a name="navh03"
								href="http://www.kaiwo123.com/webapp/wcs/stores/servlet/cd_10052_10051_-7_Y_20001_20001_.html"
								target="_blank">手机、配件</a>

						</h3>
						<div class="navmore">



							<dl>
								<dt>
									<a name="navh0301"
										href="http://www.kaiwo123.com/webapp/wcs/stores/servlet/pcd_10052_10051_-7_N_20001_20002_.html"
										title="" target="_blank">手机</a>
								</dt>
								<dd>

									<a name="navh030101"
										href="http://www.kaiwo123.com/webapp/wcs/stores/servlet/trd_10052_10051_1_20003_.html"
										title="GSM" target="_blank">GSM</a>
								</dd>
							</dl>


							<dl>
								<dt>
									<a name="navh0302"
										href="http://www.kaiwo123.com/webapp/wcs/stores/servlet/pcd_10052_10051_-7_N_20001_20016_.html"
										title="" target="_blank">充电配件</a>
								</dt>
								<dd>

									<a name="navh030201"
										href="http://www.kaiwo123.com/webapp/wcs/stores/servlet/trd_10052_10051_1_20017_.html"
										title="手机电池" target="_blank">手机电池</a>
								</dd>
							</dl>

							<dl>
								<dt>
									<a name="navh0303"
										href="http://www.kaiwo123.com/webapp/wcs/stores/servlet/pcd_10052_10051_-7_N_20001_20009_.html"
										title="" target="_blank">音频配件</a>
								</dt>

								<dd>

									<a name="navh030301"
										href="http://www.kaiwo123.com/webapp/wcs/stores/servlet/trd_10052_10051_1_20011_.html"
										title="蓝牙耳机" target="_blank">蓝牙耳机</a>
								</dd>
							</dl>

							<dl>
								<dt>
									<a name="navh0304"
										href="http://www.kaiwo123.com/webapp/wcs/stores/servlet/pcd_10052_10051_-7_N_20001_20041_.html"
										title="" target="_blank">手机饰品</a>
								</dt>
								<dd>
									<a name="navh030401"
										href="http://www.kaiwo123.com/webapp/wcs/stores/servlet/trd_10052_10051_1_20044_.html"
										title="手机套" target="_blank">手机套</a>
								</dd>
							</dl>

							<dl>
								<dt>
									<a name="navh0305"
										href="http://www.kaiwo123.com/webapp/wcs/stores/servlet/pcd_10052_10051_-7_N_20001_20024_.html"
										title="" target="_blank">数据配件</a>
								</dt>

								<dd>

									<a name="navh030501"
										href="http://www.kaiwo123.com/webapp/wcs/stores/servlet/trd_10052_10051_1_20025_.html"
										title="存储卡" target="_blank">存储卡</a>
								</dd>
							</dl>

							<dl>
								<dt>
									<a name="navh0306"
										href="http://www.kaiwo123.com/webapp/wcs/stores/servlet/pcd_10052_10051_-7_N_20001_20036_.html"
										title="" target="_blank">车载配件</a>
								</dt>

								<dd>

									<a name="navh030601"
										href="http://www.kaiwo123.com/webapp/wcs/stores/servlet/trd_10052_10051_1_20037_.html"
										title="车载支架" target="_blank">车载支架</a>
								</dd>
							</dl>

							<dl>
								<dt>
									<a name="navh0307"
										href="http://www.kaiwo123.com/webapp/wcs/stores/servlet/pcd_10052_10051_-7_N_20001_186506_.html"
										title="" target="_blank">苹果专区</a>
								</dt>
								<dd>

									<a name="navh030701"
										href="http://www.kaiwo123.com/webapp/wcs/stores/servlet/trd_10052_10051_1_186507_.html"
										title="苹果系列保护膜" target="_blank">苹果系列保护膜</a>
								</dd>
							</dl>


						</div>

					</div>

					<div class="navlist icon04" style="z-index: 0;">

						<h3 class="">
							<a name="navh04"
								href="http://www.kaiwo123.com/webapp/wcs/stores/servlet/cd_10052_10051_-7_Y_20089_20089_.html"
								target="_blank">数码、电子</a>

						</h3>
						<div class="navmore" style="display: none;">

							<dl>
								<dt>
									<a name="navh0401"
										href="http://www.kaiwo123.com/webapp/wcs/stores/servlet/pcd_10052_10051_-7_N_20089_20062_.html"
										title="" target="_blank">摄影摄像</a>
								</dt>

								<dd>

									<a name="navh040101"
										href="http://www.kaiwo123.com/webapp/wcs/stores/servlet/trd_10052_10051_1_20063_.html"
										title="数码相机" target="_blank">数码相机</a>
								</dd>
							</dl>

							<dl>
								<dt>
									<a name="navh0402"
										href="http://www.kaiwo123.com/webapp/wcs/stores/servlet/pcd_10052_10051_-7_N_20089_20090_.html"
										title="" target="_blank">时尚影音</a>
								</dt>
								<dd>


									<a name="navh040201"
										href="http://www.kaiwo123.com/webapp/wcs/stores/servlet/trd_10052_10051_1_20092_.html"
										title="MP3/MP4" target="_blank">MP3/MP4</a>
								</dd>
							</dl>

							<dl>
								<dt>
									<a name="navh0403"
										href="http://www.kaiwo123.com/webapp/wcs/stores/servlet/pcd_10052_10051_-7_N_20089_20084_.html"
										title="" target="_blank">照摄配件</a>
								</dt>

								<dd>

									<a name="navh040301"
										href="http://www.kaiwo123.com/webapp/wcs/stores/servlet/trd_10052_10051_1_199004_.html"
										title="摄影包" target="_blank">摄影包</a>
								</dd>
							</dl>


							<dl>
								<dt>
									<a name="navh0404"
										href="http://www.kaiwo123.com/webapp/wcs/stores/servlet/pcd_10052_10051_-7_N_20089_20067_.html"
										title="" target="_blank">单反配件</a>
								</dt>
								<dd>

									<a name="navh040401"
										href="http://www.kaiwo123.com/webapp/wcs/stores/servlet/trd_10052_10051_1_20068_.html"
										title="单反镜头" target="_blank">单反镜头</a>
								</dd>
							</dl>


							<dl>
								<dt>
									<a name="navh0405"
										href="http://www.kaiwo123.com/webapp/wcs/stores/servlet/pcd_10052_10051_-7_N_20089_20109_.html"
										title="" target="_blank">耳机/耳麦</a>
								</dt>
								<dd>

									<a name="navh040501"
										href="http://www.kaiwo123.com/webapp/wcs/stores/servlet/trd_10052_10051_1_20110_.html"
										title="耳机" target="_blank">耳机</a>

								</dd>
							</dl>

							<dl>
								<dt>
									<a name="navh0406"
										href="http://www.kaiwo123.com/webapp/wcs/stores/servlet/pcd_10052_10051_-7_N_20089_20103_.html"
										title="" target="_blank">电子教育</a>
								</dt>

								<dd>

									<a name="navh040601"
										href="http://www.kaiwo123.com/webapp/wcs/stores/servlet/trd_10052_10051_1_20107_.html"
										title="电纸书" target="_blank">电纸书</a>

								</dd>
							</dl>


							<dl>
								<dt>
									<a name="navh0407"
										href="http://www.kaiwo123.com/webapp/wcs/stores/servlet/pcd_10052_10051_-7_N_20089_20099_.html"
										title="" target="_blank">电玩游戏</a>
								</dt>
								<dd>

									<a name="navh040701"
										href="http://www.kaiwo123.com/webapp/wcs/stores/servlet/trd_10052_10051_1_111502_.html"
										title="跳舞毯" target="_blank">跳舞毯</a>

								</dd>
							</dl>

						</div>


					</div>

					<div class="navlist icon05" style="z-index: 0;">

						<h3 class="">
							<a name="navh05"
								href="http://www.kaiwo123.com/webapp/wcs/stores/servlet/cd_10052_10051_-7_Y_157122_157122_.html"
								target="_blank">电脑、配件、办公</a>

						</h3>
						<div class="navmore" style="display: none;">
							<div class="navmoreRight">
								<h4>推荐品牌</h4>


								<span> <a name="brand0501"
									href="http://www.kaiwo123.com/webapp/wcs/stores/servlet/pbfl_-7_10052_10051_157122_1_%E8%81%94%E6%83%B3_.html"
									title="联想" target="_blank">联想</a>

								</span>

								<div class="clear"></div>


								<h4>促销专题</h4>

								<p>
									▪ <a name="promotion0501"
										href="http://sale.suning.com/images/advertise/hg/jianshu1015/jianshu20111012.html"
										target="_blank" title="雷柏键鼠6.5折起"> 雷柏键鼠6.5折起 </a>

								</p>



							</div>

							<dl>
								<dt>
									<a name="navh0501"
										href="http://www.kaiwo123.com/webapp/wcs/stores/servlet/pcd_10052_10051_-7_N_157122_20527_.html"
										title="" target="_blank">笔记本电脑</a>
								</dt>
								<dd>

									<a name="navh050101"
										href="http://www.kaiwo123.com/webapp/wcs/stores/servlet/trd_10052_10051_1_20528_.html"
										title="笔记本" target="_blank">笔记本</a>

								</dd>
							</dl>


							<dl>
								<dt>
									<a name="navh0502"
										href="http://www.kaiwo123.com/webapp/wcs/stores/servlet/pcd_10052_10051_-7_N_157122_157123_.html"
										title="" target="_blank">办公设备</a>
								</dt>
								<dd>

									<a name="navh050201"
										href="http://www.kaiwo123.com/webapp/wcs/stores/servlet/trd_10052_10051_1_157126_.html"
										title="多功能一体机" target="_blank">多功能一体机</a>

								</dd>
							</dl>


							<dl>
								<dt>
									<a name="navh0503"
										href="http://www.kaiwo123.com/webapp/wcs/stores/servlet/pcd_10052_10051_-7_N_157122_157237_.html"
										title="" target="_blank">电脑外设配件</a>
								</dt>
								<dd>

									<a name="navh050301"
										href="http://www.kaiwo123.com/webapp/wcs/stores/servlet/trd_10052_10051_1_157252_.html"
										title="移动硬盘" target="_blank">移动硬盘</a>

								</dd>
							</dl>


							<dl>
								<dt>
									<a name="navh0504"
										href="http://www.kaiwo123.com/webapp/wcs/stores/servlet/pcd_10052_10051_-7_N_157122_20540_.html"
										title="" target="_blank">台式电脑</a>
								</dt>
								<dd>

									<a name="navh050401"
										href="http://www.kaiwo123.com/webapp/wcs/stores/servlet/trd_10052_10051_1_20566_.html"
										title="显示器" target="_blank">显示器</a>

								</dd>
							</dl>


							<dl>
								<dt>
									<a name="navh0505"
										href="http://www.kaiwo123.com/webapp/wcs/stores/servlet/pcd_10052_10051_-7_N_157122_178505_.html"
										title="" target="_blank">办公耗材</a>
								</dt>
								<dd>

									<a name="navh050501"
										href="http://www.kaiwo123.com/webapp/wcs/stores/servlet/trd_10052_10051_1_173503_.html"
										title="硒鼓" target="_blank">硒鼓</a>

								</dd>
							</dl>


							<dl>
								<dt>
									<a name="navh0506"
										href="http://www.kaiwo123.com/webapp/wcs/stores/servlet/pcd_10052_10051_-7_N_157122_20529_.html"
										title="" target="_blank">DIY硬件</a>
								</dt>
								<dd>

									<a name="navh050601"
										href="http://www.kaiwo123.com/webapp/wcs/stores/servlet/trd_10052_10051_1_168501_.html"
										title="笔记本随机配件" target="_blank">笔记本随机配件</a>

								</dd>
							</dl>


							<dl>
								<dt>
									<a name="navh0507"
										href="http://www.kaiwo123.com/webapp/wcs/stores/servlet/pcd_10052_10051_-7_N_157122_157159_.html"
										title="" target="_blank">网络设备</a>
								</dt>
								<dd>

									<a name="navh050701"
										href="http://www.kaiwo123.com/webapp/wcs/stores/servlet/trd_10052_10051_1_157162_.html"
										title="路由器" target="_blank">路由器</a>
								</dd>
							</dl>


							<dl>
								<dt>
									<a name="navh0508"
										href="http://www.kaiwo123.com/webapp/wcs/stores/servlet/pcd_10052_10051_-7_N_157122_157137_.html"
										title="" target="_blank">电脑软件</a>
								</dt>
								<dd>

									<a name="navh050801"
										href="http://www.kaiwo123.com/webapp/wcs/stores/servlet/trd_10052_10051_1_157138_.html"
										title="操作系统" target="_blank">操作系统</a>
								</dd>
							</dl>


							<dl>
								<dt>
									<a name="navh0509"
										href="http://www.kaiwo123.com/webapp/wcs/stores/servlet/pcd_10052_10051_-7_N_157122_157135_.html"
										title="" target="_blank">办公家具</a>
								</dt>
								<dd>

									<a name="navh050901"
										href="http://www.kaiwo123.com/webapp/wcs/stores/servlet/trd_10052_10051_1_195005_.html"
										title="保险柜" target="_blank">保险柜</a> <a name="navh050902"
										href="http://www.kaiwo123.com/webapp/wcs/stores/servlet/trd_10052_10051_1_157136_.html"
										title="电脑桌" target="_blank">电脑桌</a>

								</dd>
							</dl>

							<dl>
								<dt>
									<a name="navh0510"
										href="http://www.kaiwo123.com/webapp/wcs/stores/servlet/pcd_10052_10051_-7_N_157122_157133_.html"
										title="" target="_blank">办公文具</a>
								</dt>

								<dd>

									<a name="navh051001"
										href="http://www.kaiwo123.com/webapp/wcs/stores/servlet/trd_10052_10051_1_157134_.html"
										title="文具" target="_blank">文具</a> <a name="navh051002"
										href="http://www.kaiwo123.com/webapp/wcs/stores/servlet/trd_10052_10051_1_167501_.html"
										title="光盘包" target="_blank">光盘包</a>

								</dd>
							</dl>

						</div>

					</div>

				</div>
			</div>
		</div>

<!-- 主题导航条部分 -->
		<div class="nav">
			<div class="wrap">
				<ul class="nav_left">
					<li><a href="#" title="" target="_blank">首 页</a></li>
					<li><a href="#" title="" target="_blank">大气环境</a></li>
					<li><a href="#" title="" target="_blank">水环境</a></li>
					<li><a href="#" title="" target="_blank">噪声环境</a></li>
					<li><a href="#" title="" target="_blank">固体废气</a></li>
					<li><a href="#" title="" target="_blank">清洁生产</a></li>
					<li><a href="#" title="" target="_blank">节能减排</a></li>
					<li><a href="#" title="" target="_blank">生态影响</a></li>
					<li><a href="#" title="" target="_blank">社会影响</a></li>
				</ul>
			</div>
		</div>
	</div>
	<!--header end-->

	<div class="container">
		<div class="content">
			<sitemesh:body />
		</div>
		<hr style="margin:20px 0 10px;">
		<footer>
			<div class="footer_nav">
				<a href="${ctx}/guestbook" target="_blank">公共留言</a> | <a
					href="${ctx}/search" target="_blank">全站搜索</a> | <a
					href="${ctx}/map-${site.id}${fns:getUrlSuffix()}" target="_blank">站点地图</a>
				| <a href="mailto:thinkgem@163.com">技术支持</a> | <a
					href="${pageContext.request.contextPath}${fns:getAdminPath()}"
					target="_blank">后台管理</a>
			</div>
			<div class="pull-right">${fns:getDate('yyyy年MM月dd日 E')}</div>
			<div class="copyright">${site.copyright}</div>
		</footer>
	</div>
	<!-- /container -->

</body>
</html>
