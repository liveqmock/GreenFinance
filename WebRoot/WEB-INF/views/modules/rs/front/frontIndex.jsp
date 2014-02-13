<%@ page contentType="text/html;charset=UTF-8"%>
<%@ include file="/WEB-INF/views/modules/cms/front/include/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<title>首页</title>

<meta name="decorator" content="rs_default" />
<meta name="description" content="lsjr ${site.description}" />
<meta name="keywords" content="lsjr ${site.keywords}" />
<style type="text/css">
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
	<h1>
		这里是主页！！
	</h1>

	<div class="row">
		<div class="span4 aside">
			<div class="picF">
				<div class="PocN">
					<a id="zoom1" rel="" href="/368/367892/pic.shtml"
						zoom="http://2c.zol-img.com.cn/product/127/84/ceUIsG6vodlVw.jpg">
						<img
						src="http://2c.zol-img.com.cn/product/127_280x210/84/ceUIsG6vodlVw.jpg"
						itemprop="photo">
					</a>
				</div>
			
			</div>
		</div>
		<div class="span8">
		<div class="xinxi">
				<h1>
					<span>分析信息</span>
				</h1>
				<div class="clear"></div>
                <div class="list">
                  <ul>
                     <li class="li1">
                        <h2><a href="" title="">ING套现撤离亚洲 友邦保险扩大版图</a></h2>
                        <p>ING（荷兰国际集团）为了履行即将到期的偿债协议，近期频频抛售亚洲业务，引来众多...<a href="" title="">[详细]</a></p>
                     </li>
                     <li><img src="images/dian.png" width="5px" height="5px" alt="" /><a href="" title="">ING套现撤离亚洲 友邦保险扩大版图</a></li>
                     <li><img src="images/dian.png" width="5px" height="5px" alt="" /><a href="" title="">标准普尔调降西班牙多家银行信用评级</a></li>
                     <li><img src="images/dian.png" width="5px" height="5px" alt="" /><a href="" title="">花旗集团高层地震 CEO潘伟迪与COO同时宣布辞</a></li>
                     <li><img src="images/dian.png" width="5px" height="5px" alt="" /><a href="" title="">德银亚太区CEO：欧美银行去杠杆化对亚洲有利</a></li>
                     <li><img src="images/dian.png" width="5px" height="5px" alt="" /><a href="" title="">德瑞强调欧盟不应匆忙推银行单一监管机制</a></li>
                   </ul>
                </div>
		</div>
		</div>
	</div>
	<div class="row">
		<div class="span12">
			<h4>
							<small><a href="${ctx}/list-ec5d2b4eb14747e6b472167a9df4623b${urlSuffix}"
								class="pull-right">更多&gt;&gt;</a></small>企业展示
						</h4>
					<div class="picStatic">
					<div class="bd">
						<ul class="picList">
							<c:forEach items="${fnc:getArticleList(site.id, 'ec5d2b4eb14747e6b472167a9df4623b', 7, '')}"
								var="article">
								<!-- 
								<li><span class="pull-right"><fmt:formatDate
											value="${article.updateDate}" pattern="yyyy.MM.dd" /></span><a
									href="${article.url}" style="color:${article.color}">${fns:abbr(article.title,28)}</a></li>
							 -->
							<li style="float:left;">
								<div class="pic"><a href="${article.url}" target="_blank"><img src="${article.image}" /></a></div>
								<div class="title"><a href="${article.url}" target="_blank">${fns:abbr(article.title,16)}</a></div>
							</li>
							</c:forEach>
						</ul>
					</div>
					</div>
		</div>
	</div>
	<div class="row">
		<div class="span6">
		<h4>
								<small><a href="${ctx}/list-6${urlSuffix}"
									class="pull-right">更多&gt;&gt;</a></small>行业动态
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
		<div class="span6">
		<h4>
								<small><a href="${ctx}/list-6${urlSuffix}"
									class="pull-right">更多&gt;&gt;</a></small>信贷信息
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
	<div class="row">
		<div class="span6">
		<h4>
								<small><a href="${ctx}/list-6${urlSuffix}"
									class="pull-right">更多&gt;&gt;</a></small>讨论区
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
		<div class="span6">
		<h4>
								<small><a href="${ctx}/list-6${urlSuffix}"
									class="pull-right">更多&gt;&gt;</a></small>讨论区
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
	<script type="text/javascript">
		jQuery(".picStatic").slide({mainCell:".bd ul",autoPlay:true,effect:"",vis:6,interTime:50});
		</script>
</body>
</html>