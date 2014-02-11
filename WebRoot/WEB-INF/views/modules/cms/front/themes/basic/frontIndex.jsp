<%@ page contentType="text/html;charset=UTF-8"%>
<%@ include file="/WEB-INF/views/modules/cms/front/include/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
	<title>首页</title>
	<meta name="decorator" content="cms_default_${site.theme}"/>
	<meta name="description" content="JeeSite ${site.description}" />
	<meta name="keywords" content="JeeSite ${site.keywords}" />
<script type="text/javascript" src="${ctxStatic}/SuperSlide/jquery1.42.min.js"></script><script type="text/javascript" src="${ctxStatic}/SuperSlide/jquery.SuperSlide.2.1.js"></script>
<style type="text/css">
	/* css 重置 */
	*{margin:0; padding:0; list-style:none; }
	body{ background:#fff;   }
	img{ border:0;  }
	a{ text-decoration:none; color:#333;  }
	a:hover{ color:#1974A1;  }
	.js{width:90%; margin:10px auto 0 auto; }
	.js p{ padding:5px 0; font-weight:bold; overflow:hidden;  }
	.js p span{ float:right; }
	.js p span a{ color:#f00; text-decoration:underline;   }
	.js textarea{ height:100px;  width:98%; padding:5px; border:1px solid #ccc; border-top:2px solid #aaa;  border-left:2px solid #aaa;  }

	h1{ font:normal 20px/200% "Microsoft YaHei"; _font-weight:bold; padding-bottom:10px;  }
	h2{ font:normal 14px/200% "Microsoft YaHei"; _font-weight:bold; padding-bottom:10px; color:#c00;  }

	/* 本例子css */

	/* 焦点图效果 */
	.picBtnTop{  height:314px; border:1px solid #ccc; padding:5px;  position:relative;  overflow:hidden;  zoom:1;   }
	.picBtnTop .hd{  height:314px; position:absolute; right:5px; overflow:hidden; }
	.picBtnTop .hd ul li{ width:93px; text-align:center; padding:0 0 5px 5px;  }
	.picBtnTop .hd ul li img{ width:85px; height:90px; border:4px solid #ddd; cursor:pointer; vertical-align:bottom; }
	.picBtnTop .hd ul li.on{ background:url("images/icoleft.gif") no-repeat 0 28px; }
	.picBtnTop .hd ul li.on img{ border-color:#f60;  }
	.picBtnTop .bd{ width:800px;  height:314px; position:relative;  }
	.picBtnTop .bd li{ position:relative; zoom:1; vertical-align:middle;}
	.picBtnTop .bd li .pic{ position:relative; z-index:0;  }
	.picBtnTop .bd li .pic img{ width:900px; height:314px; vertical-align:bottom; }
	.picBtnTop .bd li .bg{ width:400px; height:30px; position:absolute; left:0; bottom:0; z-index:1;  background:#000; filter:alpha(opacity=60);opacity:0.6;    }
	.picBtnTop .bd li .title{ width:400px; height:30px; line-height:30px; left:0; bottom:0;   position:absolute; z-index:2;  }
	.picBtnTop .bd li .title a{ color:#fff; padding-left:15px;  }
	#demo1{ margin-bottom:20px;  }
	
	/* 2css */
	.picScroll-left{  overflow:hidden; position:relative;    }
	.picScroll-left .bd{ padding:10px;   }
	.picScroll-left .bd ul{ overflow:hidden; zoom:1; }
	.picScroll-left .bd ul li{ margin:0 8px; float:left; _display:inline; overflow:hidden; text-align:center;  }
	.picScroll-left .bd ul li .pic{ text-align:center; }
	.picScroll-left .bd ul li .pic img{ width:180px; height:90px; display:block;  padding:2px; border:1px solid #ccc; }
	.picScroll-left .bd ul li .pic a:hover img{ border-color:#999;  }
	.picScroll-left .bd ul li .title{ line-height:24px;   }

</style>

</head>

<body>
	<!--动态图片部分 -->
	
	<div id="demo1" class="picBtnTop">
	<div class="hd">
		<ul>
			<li><img src="${ctxStatic}/SuperSlide/demo/images/pic1.jpg" /></li>
			<li><img src="${ctxStatic}/SuperSlide/demo/images/pic2.jpg" /></li>
			<li><img src="${ctxStatic}/SuperSlide/demo/images/pic3.jpg" /></li>
		</ul>
	</div>
	<div class="bd">
		<ul>
			<li>
				<div class="bg"></div>
				<div class="pic"><a href=""><img src="${ctxStatic}/SuperSlide/demo/images/pic1.jpg" /></a></div>
				<div class="title"><a href="">效果图1</a></div>
			</li>
			<li>
				<div class="bg"></div>
				<div class="pic"><a href=""><img src="${ctxStatic}/SuperSlide/demo/images/pic2.jpg" /></a></div>
				<div class="title"><a href="">效果图2</a></div>
			</li>
			<li>
				<div class="bg"></div>
				<div class="pic"><a href=""><img src="${ctxStatic}/SuperSlide/demo/images/pic3.jpg" /></a></div>
				<div class="title"><a href="">效果图3</a></div>
			</li>
			
		</ul>
	</div>
</div>
<script type="text/javascript">
//唯一不同：jQuery("#demo1")
jQuery("#demo1").slide({ mainCell:".bd ul",effect:"top",autoPlay:true,triggerTime:0 });</script>

    
    <div class="container-fluid">
    <div class="row-fluid">
     <div class="span8">
    <div class="row">
      <div class="span6">
        <h4><small><a href="${ctx}/list-6${urlSuffix}" class="pull-right">更多&gt;&gt;</a></small>绿色信贷</h4>
		<ul><c:forEach items="${fnc:getArticleList(site.id, 2, 8, '')}" var="article">
			<li><span class="pull-right"><fmt:formatDate value="${article.updateDate}" pattern="yyyy.MM.dd"/></span><a href="${article.url}" style="color:${article.color}">${fns:abbr(article.title,28)}</a></li>
		</c:forEach></ul>
      </div>
      <div class="span6">
        <h4> <small><a href="${ctx}/list-2${urlSuffix}" class="pull-right">更多&gt;&gt;</a></small>环保信息</h4>
		<ul><c:forEach items="${fnc:getArticleList(site.id, 6, 8, '')}" var="article">
			<li><span class="pull-right"><fmt:formatDate value="${article.updateDate}" pattern="yyyy.MM.dd"/></span><a href="${article.url}" style="color:${article.color}">${fns:abbr(article.title,28)}</a></li>
		</c:forEach></ul>
      </div>
     
    </div>
        <div class="row">
    	 <div class="span6">
        <h4><small><a href="${ctx}/list-18${urlSuffix}" class="pull-right">更多&gt;&gt;</a></small>优秀企业</h4>
		<ul><c:forEach items="${fnc:getArticleList(site.id, 2, 8, '')}" var="article">
			<li><span class="pull-right"><fmt:formatDate value="${article.updateDate}" pattern="yyyy.MM.dd"/></span><a href="${article.url}" style="color:${article.color}">${fns:abbr(article.title,28)}</a></li>
		</c:forEach></ul>
      </div>
      <div class="span6">
        <h4> <small><a href="${ctx}/list-24${urlSuffix}" class="pull-right">更多&gt;&gt;</a></small>差评企业</h4>
		<ul><c:forEach items="${fnc:getArticleList(site.id, 6, 8, '')}" var="article">
			<li><span class="pull-right"><fmt:formatDate value="${article.updateDate}" pattern="yyyy.MM.dd"/></span><a href="${article.url}" style="color:${article.color}">${fns:abbr(article.title,28)}</a></li>
		</c:forEach></ul>
      </div>
    	</div>
    </div>
    <div class="span4">
    <div class="span12">
        <h4><small><a href="${ctx}/list-10${urlSuffix}" class="pull-right">更多&gt;&gt;</a></small>政策法规</h4>
		<ul><c:forEach items="${fnc:getArticleList(site.id, 10, 8, '')}" var="article">
			<li><span class="pull-right"><fmt:formatDate value="${article.updateDate}" pattern="yyyy.MM.dd"/></span><a href="${article.url}" style="color:${article.color}">${fns:abbr(article.title,28)}</a></li>
		</c:forEach></ul>
      </div>

    </div>
    </div>
    </div>
    <div class="row">
    	<div class="span12">
    	<div class="picScroll-left">
			<h4><small><a href="${ctx}/list-11${urlSuffix}" class="pull-right">更多&gt;&gt;</a></small>政策法规</h4>
		<ul><c:forEach items="${fnc:getArticleList(site.id, 11, 8, '')}" var="article">
			<li><span class="pull-right"><fmt:formatDate value="${article.updateDate}" pattern="yyyy.MM.dd"/></span><img src="${article.image}" />${fns:abbr(article.title,28)}</li>
		</c:forEach></ul>
				<ul class="picList">
				
					<li>
						<div class="pic"><a href="http://www.SuperSlide2.com" target="_blank"><img src="${ctxStatic}/SuperSlide/demo/images/pic1.jpg" /></a></div>
						<div class="title"><a href="http://www.SuperSlide2.com" target="_blank">效果图1</a></div>
					</li>
					<li>
						<div class="pic"><a href="http://www.SuperSlide2.com" target="_blank"><img src="${ctxStatic}/SuperSlide/demo/images/pic2.jpg" /></a></div>
						<div class="title"><a href="http://www.SuperSlide2.com" target="_blank">效果图2</a></div>
					</li>
					<li>
						<div class="pic"><a href="http://www.SuperSlide2.com" target="_blank"><img src="${ctxStatic}/SuperSlide/demo/images/pic3.jpg" /></a></div>
						<div class="title"><a href="http://www.SuperSlide2.com" target="_blank">效果图3</a></div>
					</li>
					<li>
						<div class="pic"><a href="http://www.SuperSlide2.com" target="_blank"><img src="${ctxStatic}/SuperSlide/demo/images/pic4.jpg" /></a></div>
						<div class="title"><a href="http://www.SuperSlide2.com" target="_blank">效果图4</a></div>
					</li>
					<li>
						<div class="pic"><a href="http://www.SuperSlide2.com" target="_blank"><img src="${ctxStatic}/SuperSlide/demo/images/pic5.jpg" /></a></div>
						<div class="title"><a href="http://www.SuperSlide2.com" target="_blank">效果图5</a></div>
					</li>
					<li>
						<div class="pic"><a href="http://www.SuperSlide2.com" target="_blank"><img src="${ctxStatic}/SuperSlide/demo/images/pic6.jpg" /></a></div>
						<div class="title"><a href="http://www.SuperSlide2.com" target="_blank">效果图6</a></div>
					</li>
					<li>
						<div class="pic"><a href="http://www.SuperSlide2.com" target="_blank"><img src="${ctxStatic}/SuperSlide/demo/images/pic6.jpg" /></a></div>
						<div class="title"><a href="http://www.SuperSlide2.com" target="_blank">效果图6</a></div>
					</li>
				</ul>
			</div>
		</div>

		</div>
    	</div>
    
    		
    
</body>
</html>