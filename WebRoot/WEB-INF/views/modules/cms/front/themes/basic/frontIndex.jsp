<%@ page contentType="text/html;charset=UTF-8"%>
<%@ include file="/WEB-INF/views/modules/cms/front/include/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<title>首页</title>
<meta name="decorator" content="cms_default_${site.theme}" />
<meta name="description" content="JeeSite ${site.description}" />
<meta name="keywords" content="JeeSite ${site.keywords}" />
<script type="text/javascript"
	src="${ctxStatic}/SuperSlide/jquery1.42.min.js"></script>
<script type="text/javascript"
	src="${ctxStatic}/SuperSlide/jquery.SuperSlide.2.1.js"></script>
<style type="text/css">
/* css 重置 */
* {
	margin: 0;
	padding: 0;
	list-style: none;
}

body {
	background: #fff;
}

img {
	border: 0;
}

a {
	text-decoration: none;
	color: #333;
}

a:hover {
	color: #1974A1;
}

.js {
	width: 90%;
	margin: 10px auto 0 auto;
}

.js p {
	padding: 5px 0;
	font-weight: bold;
	overflow: hidden;
}

.js p span {
	float: right;
}

.js p span a {
	color: #f00;
	text-decoration: underline;
}

.js textarea {
	height: 100px;
	width: 98%;
	padding: 5px;
	border: 1px solid #ccc;
	border-top: 2px solid #aaa;
	border-left: 2px solid #aaa;
}

h1 {
	font: normal 20px/200% "Microsoft YaHei";
	_font-weight: bold;
	padding-bottom: 10px;
}

h2 {
	font: normal 14px/200% "Microsoft YaHei";
	_font-weight: bold;
	padding-bottom: 10px;
	color: #c00;
}

/* 本例子css */
.slideBox {
	height: 230px;
	overflow: hidden;
	position: relative;
	border: 1px solid #ddd;
}

.slideBox .hd {
	height: 15px;
	overflow: hidden;
	position: absolute;
	right: 5px;
	bottom: 5px;
	z-index: 1;
}

.slideBox .hd ul {
	overflow: hidden;
	zoom: 1;
	float: left;
}

.slideBox .hd ul li {
	float: left;
	margin-right: 2px;
	width: 15px;
	height: 15px;
	line-height: 14px;
	text-align: center;
	background: #fff;
	cursor: pointer;
}

.slideBox .hd ul li.on {
	background: #f00;
	color: #fff;
}

.slideBox .bd {
	position: relative;
	height: 100%;
	z-index: 0;
}

.slideBox .bd li {
	zoom: 1;
	vertical-align: middle;
}

.slideBox .bd img {
	height: 230px;
	display: block;
}

/* 下面是前/后按钮代码，如果不需要删除即可 */
.slideBox .prev,.slideBox .next {
	position: absolute;
	left: 3%;
	top: 50%;
	margin-top: -25px;
	display: block;
	width: 32px;
	height: 40px;
	background: url(images/slider-arrow-fluid.png) -110px 5px no-repeat;
	filter: alpha(opacity =   50);
	opacity: 0.5;
}

.slideBox .next {
	left: auto;
	right: 3%;
	background-position: 8px 5px;
}

.slideBox .prev:hover,.slideBox .next:hover {
	filter: alpha(opacity =   100);
	opacity: 1;
}

.slideBox .prevStop {
	display: none;
}

.slideBox .nextStop {
	display: none;
}

/* 本例子css */
		.picMarquee-left ,.picStatic{   overflow:hidden; position:relative;  border:1px solid #ccc;   }
		.picMarquee-left  .hd,.picStatic .hd{ overflow:hidden;  height:30px; background:#f4f4f4; padding:0 10px;  }
		.picMarquee-left .hd .prev,.picMarquee-left .hd .next{ display:block;  width:5px; height:9px; float:right; margin-right:5px; margin-top:10px;  overflow:hidden;
			 cursor:pointer; background:url("../images/arrow.png") no-repeat;}
		.picMarquee-left .hd .next{ background-position:0 -50px;  }
		.picMarquee-left .hd .prevStop{ background-position:-60px 0; }
		.picMarquee-left .hd .nextStop{ background-position:-60px -50px; }
		.picMarquee-left .bd{ padding:10px;   }
		.picMarquee-left .bd ul,.picStatic .bd ul{ overflow:hidden; zoom:1; }
		.picMarquee-left .bd ul li,.picStatic .bd ul li{ margin:0 8px; float:left; _display:inline; overflow:hidden; text-align:center;  }
		.picMarquee-left .bd ul li .pic,.picStatic .bd ul li pic{ text-align:center; }
		.picMarquee-left .bd ul li .pic img{ width:120px; height:90px; display:block; padding:2px; border:1px solid #ccc; }
		.picStatic .bd ul li .pic img{ width:110px; height:70px; display:block; padding:2px; border:1px solid #ccc; }
		.picMarquee-left .bd ul li .pic a:hover img,.picStatic .bd ul li .pic a:hover img{ border-color:#999;  }
		.picMarquee-left .bd ul li .title,.picStatic .bd ul li .title{ line-height:24px;   }
</style>

</head>

<body>
	<div class="container-fluid">
		<div class="row-fluid">
			<div class="span8">

				<!-- 动态图片部分 -->
				<div class="span6">
					<div class="row-fluid">
						<div id="slideBox" class="slideBox">
							<div class="hd">
								<ul style=margin:0;>
									<li>1</li>
									<li>2</li>
									<li>3</li>
								</ul>
							</div>
							<div class="bd">
								<ul style=margin:0;>
									<!-- 以后的标准代码 
									<c:forEach items="${fnc:getArticleList(site.id, '463dfb061fa847dca04cd86b55a0a373', 8, '')}"
									var="article">
									<li><a href="${article.url}" target="_blank"><img src="${article.image}" /></a></li>
									</c:forEach>
									 -->
									<li><a href="http://www.SuperSlide2.com" target="_blank"><img
											src="${ctxStatic}/SuperSlide/demo/images/pic1.jpg" /></a></li>
									<li><a href="http://www.SuperSlide2.com" target="_blank"><img
											src="${ctxStatic}/SuperSlide/demo/images/pic2.jpg" /></a></li>
									<li><a href="http://www.SuperSlide2.com" target="_blank"><img
											src="${ctxStatic}/SuperSlide/demo/images/pic3.jpg" /></a></li>
								</ul>
							</div>

							<!-- 下面是前/后按钮代码，如果不需要删除即可 -->
							<a class="prev" href="javascript:void(0)"></a> <a class="next"
								href="javascript:void(0)"></a>

						</div>
					</div>

					<script type="text/javascript">
						jQuery(".slideBox").slide({
							mainCell : ".bd ul",
							autoPlay : true
						});
					</script>
				</div>
				<div class="span6">
					<!-- 新闻动态部分 -->
					<div class="row-fluid">
						<div class="span12">
							<h4>
								<small><a href="${ctx}/list-6${urlSuffix}"
									class="pull-right">更多&gt;&gt;</a></small>新闻动态
							</h4>
							<ul>
								<c:forEach items="${fnc:getArticleList(site.id, 6, 4, '')}"
									var="article">
									<li><span class="pull-right"><fmt:formatDate
												value="${article.updateDate}" pattern="yyyy.MM.dd" /></span><a
										href="${article.url}" style="color:${article.color}">${fns:abbr(article.title,28)}</a></li>
								</c:forEach>
							</ul>
						</div>
					</div>
					<!-- 通知公告部分 -->
					<div class="row-fluid">
						<div class="span12">
							<h4>
								<small><a href="${ctx}/list-463dfb061fa847dca04cd86b55a0a373${urlSuffix}"
									class="pull-right">更多&gt;&gt;</a></small>通知公告
							</h4>
							<ul>
								<c:forEach items="${fnc:getArticleList(site.id, '463dfb061fa847dca04cd86b55a0a373', 4, '')}"
									var="article">
									<li><span class="pull-right"><fmt:formatDate
												value="${article.updateDate}" pattern="yyyy.MM.dd" /></span><a
										href="${article.url}" style="color:${article.color}">${fns:abbr(article.title,28)}</a></li>
								</c:forEach>
							</ul>
						</div>
					</div>
				</div>
			</div>



			<!-- 用户登录部分 -->
			<div class="span4">
				<div class="span12">
					<h4>
						用户登录
					</h4>
					<form action="${ctx}/rs-login" method="post">
					<div style="margin-top: 20px; margin-left: 15px">
						账&nbsp;&nbsp;&nbsp;&nbsp;户： <input type="text" name="username" tabindex="1"
							class="ipt-t no-ime" style="width: 122px; height: 18px">
					</div>
					<div style="margin-top: 4px; margin-bottom: 8px; margin-left: 15px">
						密&nbsp;&nbsp;&nbsp;&nbsp;码： <input type="password" name="password"
							tabindex="1" class="ipt-t no-ime"
							style="width: 122px; height: 18px">
					</div>
					<div style="margin-top: 4px; margin-bottom: 8px; margin-left: 15px">
						<input type="radio" name="type" value="enter" checked="checked"/> 企业 <input
							type="radio" name="type" value="bank" /> 银行 
						<input type="radio" name="type" value="person" /> 个人 
					</div>

					<div
						style="margin-top: -2px; margin-bottom: 0px; margin-left: 40px">
						<input type="submit" value="登录" name="log_in"
							style="border-bottom: 0px; border-left: 0px; width: 48px; height: 24px; border-top: 0px; border-right: 0px">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input
							type="reset" value="重置" name="reset"
							style="border-bottom: 0px; border-left: 0px; width: 48px; height: 24px; border-top: 0px; border-right: 0px">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					</div>
					</form>
				</div>
			</div>
		</div>
	</div>



	<div class="container-fluid">
		<div class="row-fluid">
			<div class="span8">
				<div class="row-fluid">
					<!-- 政策法规部分 -->
					<div class="span6">
						<h4>
							<small><a href="${ctx}/list-10${urlSuffix}"
								class="pull-right">更多&gt;&gt;</a></small>政策法规
						</h4>
						<ul>
							<c:forEach items="${fnc:getArticleList(site.id, 10, 8, '')}"
								var="article">
								<li><span class="pull-right"><fmt:formatDate
											value="${article.updateDate}" pattern="yyyy.MM.dd" /></span><a
									href="${article.url}" style="color:${article.color}">${fns:abbr(article.title,28)}</a></li>
							</c:forEach>
						</ul>
					</div>
					<!-- 银行动态部分 -->
					<div class="span6">
						<h4>
							<small><a href="${ctx}/list-2${urlSuffix}"
								class="pull-right">更多&gt;&gt;</a></small>银行动态
						</h4>
						<ul>
							<c:forEach items="${fnc:getArticleList(site.id, 2, 8, '')}"
								var="article">
								<li><span class="pull-right"><fmt:formatDate
											value="${article.updateDate}" pattern="yyyy.MM.dd" /></span><a
									href="${article.url}" style="color:${article.color}">${fns:abbr(article.title,28)}</a></li>
							</c:forEach>
						</ul>
					</div>

				</div>

				<!-- 企业展示部分 -->
				<div class="row-fluid">
					<div class="span12">
						<h4>
							<small><a href="${ctx}/list-ec5d2b4eb14747e6b472167a9df4623b${urlSuffix}"
								class="pull-right">更多&gt;&gt;</a></small>企业展示
						</h4>
					<div class="picStatic">
					<div class="bd">
						<ul class="picList">
							<c:forEach items="${fnc:getArticleList(site.id, 'ec5d2b4eb14747e6b472167a9df4623b', 4, '')}"
								var="article">
								<!-- 
								<li><span class="pull-right"><fmt:formatDate
											value="${article.updateDate}" pattern="yyyy.MM.dd" /></span><a
									href="${article.url}" style="color:${article.color}">${fns:abbr(article.title,28)}</a></li>
							 -->
							<li style="float:left;">
								<div class="pic"><a href="${article.url}" target="_blank"><img src="/jeetest/${article.image}" /></a></div>
								<div class="title"><a href="${article.url}" target="_blank">${fns:abbr(article.title,16)}</a></div>
							</li>
							</c:forEach>
						</ul>
					</div>
					</div>
					</div>
				</div>
				<div class="row-fluid">
					<!-- 个人服务部分 -->
					<div class="span6">
					
						<h4>
							<small><a href="${ctx}/list-fb6c1e79bf57441b984531bf49514294${urlSuffix}"
								class="pull-right">更多&gt;&gt;</a></small>个人服务
						</h4>
						<ul>
							<c:forEach items="${fnc:getArticleList(site.id, 'fb6c1e79bf57441b984531bf49514294', 8, '')}"
								var="article">
								<li><span class="pull-right"><fmt:formatDate
											value="${article.updateDate}" pattern="yyyy.MM.dd" /></span><a
									href="${article.url}" style="color:${article.color}">${fns:abbr(article.title,28)}</a></li>
							</c:forEach>
						</ul>
					</div>
					<!-- 评价体系部分 -->
					<div class="span6">
						<h4>
							<small><a href="${ctx}/list-3cb860c6d5234d0280d17647d3dd0f61${urlSuffix}"
								class="pull-right">更多&gt;&gt;</a></small>评价体系
						</h4>
						<ul>
							<c:forEach items="${fnc:getArticleList(site.id, '3cb860c6d5234d0280d17647d3dd0f61', 8, '')}"
								var="article">
								<li><span class="pull-right"><fmt:formatDate
											value="${article.updateDate}" pattern="yyyy.MM.dd" /></span><a
									href="${article.url}" style="color:${article.color}">${fns:abbr(article.title,28)}</a></li>
							</c:forEach>
						</ul>
					</div>
				</div>
			</div>
			<div class="span4">
				<!-- 专题部分 -->
				<div class="row-fluid">
					<div class="span12">
						<h4>
							<small><a href="${ctx}/list-391dc08aa55d492f86e042f772998b30${urlSuffix}"
								class="pull-right">更多&gt;&gt;</a></small>专题
						</h4>
						<ul>
							<c:forEach items="${fnc:getArticleList(site.id, '391dc08aa55d492f86e042f772998b30', 12, '')}"
								var="article">
								<li><span class="pull-right"><fmt:formatDate
											value="${article.updateDate}" pattern="yyyy.MM.dd" /></span><a
									href="${article.url}" style="color:${article.color}">${fns:abbr(article.title,28)}</a></li>
							</c:forEach>
						</ul>
					</div>
				</div>
				<!-- 知识普及部分 -->
				<div class="row-fluid">
					<div class="span12">
						<h4>
							<small><a href="${ctx}/list-8269e2a703cb4a1f9bde1b31b25ab9a0${urlSuffix}"
								class="pull-right">更多&gt;&gt;</a></small>知识普及
						</h4>
						<ul>
							<c:forEach items="${fnc:getArticleList(site.id, '8269e2a703cb4a1f9bde1b31b25ab9a0', 12, '')}"
								var="article">
								<li><span class="pull-right"><fmt:formatDate
											value="${article.updateDate}" pattern="yyyy.MM.dd" /></span><a
									href="${article.url}" style="color:${article.color}">${fns:abbr(article.title,28)}</a></li>
							</c:forEach>
						</ul>
					</div>
				</div>



			</div>
		</div>
	</div>
	<div class="container-fluid">
		<!-- 合作单位部分 -->
		<div class="row-fluid">
			<div class="span12">
				<h4>
					<small><a href="${ctx}/list-18${urlSuffix}"
						class="pull-right">更多&gt;&gt;</a></small>合作机构
				</h4>
			<div class="picMarquee-left">
			
			<div class="bd">
				<ul class="picList">
					<!-- 以后的标准代码 //还不知道怎么获取linklist -->
									<c:forEach items="${fnc:getLinkList(site.id, '18', 6, '')}"
									var="link">
									<li><div class="pic"><a href="${link.href}" target="_blank"><img src="${link.image}" /></a></div>
										<div class="title">
										</div>
									</li>
									</c:forEach>
				</ul>
			</div>
		</div>

		<script type="text/javascript">
		jQuery(".picMarquee-left").slide({mainCell:".bd ul",autoPlay:true,effect:"leftMarquee",vis:6,interTime:50});
		jQuery(".picStatic").slide({mainCell:".bd ul",autoPlay:true,effect:"",vis:4,interTime:50});
		</script>

			</div>

		</div>
	</div>





</body>
</html>