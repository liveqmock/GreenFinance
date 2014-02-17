<%@ page contentType="text/html;charset=UTF-8"%>
<%@ include file="/WEB-INF/views/modules/rs/front/include/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<title>${industryType.industryName}</title>

<meta name="decorator" content="rs_default" />
<meta name="description" content="lsjr ${site.description}" />
<meta name="keywords" content="lsjr ${site.keywords}" />
<script type="text/javascript">
	alert("");
</script>
</head>
<body>

<div class="row">
	   <div class="span2">
		 <h4>推荐企业</h4>
		 <ol>
		 	<li>1</li>
		 	<li>1</li>
		 	<li>1</li>
		 	<li>1</li>
		 	<li>1</li>
		 </ol>
	   </div>
	   <div class="span10">
		 <ul class="breadcrumb">
		 <!-- 不愿意用jstl标签了，暂时这么写 -->
			<li><strong>当前位置：</strong><a href="${rtx}/index">首页</a></li>
<li><span class="divider">/</span> <a href="${rtx}/list-${industryType.industryCode}${urlSuffix}">${industryType.industryName}</a></li>
		 </ul>
	   </div>
       <div class="span10">
		  <h4>${industryType.industryName}</h4>
			<ul><c:forEach items="${page.list}" var="enterBasicInfo">
				<li><span class="pull-right"></span><a href="view-${enterBasicInfo.enterCode}-1${urlSuffix}" >${fns:abbr(enterBasicInfo.enterName,96)}</a></li>
			</c:forEach></ul>
			<div class="pagination">${page}</div>
			<script type="text/javascript">
				function page(n,s){
					location="${rtx}/list-${industryType.industryCode}${urlSuffix}?pageNo="+n+"&pageSize="+s;
				}
			</script>
  	  </div>
   </div>
</body>
</html>