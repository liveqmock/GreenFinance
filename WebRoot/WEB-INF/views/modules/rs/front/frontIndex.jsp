<%@ page contentType="text/html;charset=UTF-8"%>
<%@ include file="/WEB-INF/views/modules/rs/front/include/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<title>${enterBasicInfo.enterName}</title>

<meta name="decorator" content="rs_default" />
<meta name="description" content="lsjr ${site.description}" />
<meta name="keywords" content="lsjr ${site.keywords}" />
<style type="text/css">

/* 本例子css */
		.picMarquee-left ,.picStatic{   overflow:hidden; position:relative;  border:1px solid #ccc;   }
		.picMarquee-left  .hd,.picStatic .hd{ overflow:hidden;  height:30px; background:#f4f4f4; padding:0 10px;  }
		.picMarquee-left .hd .prev,.picMarquee-left .hd .next{ display:block;  width:5px; height:9px; float:right; margin-right:5px; margin-top:10px;  overflow:hidden;
			 cursor:pointer; }
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
					<a id="zoom1" rel="" href="/368/367892/pic.shtml">
						<img
						src="http://2c.zol-img.com.cn/product/127_280x210/84/ceUIsG6vodlVw.jpg">
					</a>
				</div>
			
			</div>
		</div>
		<div class="span8">
		<div class="xinxi">
		<div class="row">
		<div class="span4">
		<dl>
			<dt>
				企业基本信息
			</dt>
			<dd>
				企业唯一标示符：${enterBasicInfo.enterCode}
			</dd>
			<dd>
				行政区域编码：${enterBasicInfo.codeRegion}
			</dd>
			<dd>
				法人代码：${enterBasicInfo.corpCode}
			</dd>
			<dd>
				创建时间：${enterBasicInfo.createTime}
			</dd>
			<dd>
				企业地址：${enterBasicInfo.enterAddress}
			</dd>
			<dd>
				企业名称：${enterBasicInfo.enterName}
			</dd>
			<dd>
				企业类别：${enterBasicInfo.enterType}
			</dd>
			
			
		</dl>
			
		</div>
		<div class="span4">
		<dl>
			<dt>
				&aacute;
			</dt>
			<dd>
				传真：${enterBasicInfo.fax}
			</dd>
			<dd>
				经度：${enterBasicInfo.longitude}
			</dd>
			<dd>
				维度：${enterBasicInfo.latitude}
			</dd>
			<dd>
				联系人：${enterBasicInfo.linkMan}
			</dd>
			<dd>
				邮政编码：${enterBasicInfo.postalCode}
			</dd>
			<dd>
				联系电话:${enterBasicInfo.telephone}
			</dd>
			<dd>
				行业类型：${enterBasicInfo.industryType}
			</dd>
		</dl>
			
		</div>
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