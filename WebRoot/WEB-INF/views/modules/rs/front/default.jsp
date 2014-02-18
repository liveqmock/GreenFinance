<%@ page contentType="text/html;charset=UTF-8"%>
<!-- 下面引用总标签库文件  包括了jstl、shiro、自定义标签、全局变量等 -->
<%@ include file="/WEB-INF/views/modules/rs/front/include/taglib.jsp"%>
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
				src="${ctxStaticFront}/ad1.jpg" width="1004" height="40" /></a>
			<div class="search_box">
				<a href="#" title="" target="_blank"><img
					src="${ctxStaticFront}/logo.jpg" width="389" height="53" alt=""
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
			<c:forEach items="${warpMap['first']}" var="firstIndurstry">
			  
			  <div class="navlist icon01" style="z-index: 0;">
					<h3 class="">
						<a name="navh01" href="${rtx}/list-${firstIndurstry.industryCode}${urlSuffix}" target="_blank">${firstIndurstry.industryName }</a>

						<b></b>
					</h3>
				<div class="navmore" style="display: none;">
				<c:forEach items="${warpMap[firstIndurstry.industryCode]}" var="secondIndurstry">
					<dl>

								<dt>
									<a 
										href="${rtx}/list-${secondIndurstry.industryCode}${urlSuffix}"
										title="${secondIndurstry.industryName }" target="_blank">${secondIndurstry.industryName }</a>
								</dt>
								
								<c:forEach items="${warpMap[secondIndurstry.industryCode]}" var="thirdIndurstry">
								
								
								<dd>
									<a 
										href="${rtx}/list-${thirdIndurstry.industryCode}${urlSuffix}"
										title="${thirdIndurstry.industryName }" target="_blank">${thirdIndurstry.industryName }</a>
								</dd>
								</c:forEach>
					</dl>
					
				</c:forEach>	
				</div>	
			</div>
			</c:forEach>
			<!-- 以下的就可以删除了 -->
					<!-- 一级行业 -->
				</div>
			</div>
		</div>

<!-- 主题导航条部分 -->
		<div class="nav">
			<div class="wrap">
				<ul class="nav_left">
				<!-- 这个地方需要有企业的id才能够写url -->
					<li><a href="${rtx}" title="" target="_blank">首 页</a></li>
					<li><a href="${rtx}/view-${enterBasicInfo.enterCode}-2${urlSuffix}" title="" target="_blank">大气环境</a></li>
					<li><a href="${rtx}/view-${enterBasicInfo.enterCode}-3${urlSuffix}" title="" target="_blank">水环境</a></li>
					<li><a href="${rtx}/view-${enterBasicInfo.enterCode}-4${urlSuffix}" title="" target="_blank">噪声环境</a></li>
					<li><a href="${rtx}/view-${enterBasicInfo.enterCode}-5${urlSuffix}" title="" target="_blank">固体废气</a></li>
					<li><a href="${rtx}/view-${enterBasicInfo.enterCode}-6${urlSuffix}" title="" target="_blank">清洁生产</a></li>
					<li><a href="${rtx}/view-${enterBasicInfo.enterCode}-7${urlSuffix}" title="" target="_blank">节能减排</a></li>
					<li><a href="${rtx}/view-${enterBasicInfo.enterCode}-8${urlSuffix}" title="" target="_blank">生态影响</a></li>
					<li><a href="${rtx}/view-${enterBasicInfo.enterCode}-9${urlSuffix}" title="" target="_blank">社会影响</a></li>
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
