<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
	<title>行业分类管理</title>
	<meta name="decorator" content="default"/>
	<%@include file="/WEB-INF/views/include/treetable.jsp" %>
	<script type="text/javascript">
		$(document).ready(function() {
			$("#treeTable").treeTable({expandLevel : 5});
		});
		function page(n,s){
			$("#pageNo").val(n);
			$("#pageSize").val(s);
			$("#searchForm").submit();
	    	return false;
	    }
	</script>
</head>
<body>
	<ul class="nav nav-tabs">
		<li class="active"><a href="${ctx}/rs/industryType/">行业列表</a></li>
		<li><a href="${ctx}/rs/industryType/form">行业添加</a></li>
	</ul>
	<tags:message content="${message}"/>
	<table id="treeTable" class="table table-striped table-bordered table-condensed">
		<tr><th>行业代码</th><th>行业名称</th><th>行业说明</th><th>操作</th></tr>
		<c:forEach items="${industryTypies}" var="industryType">
			<tr id="${industryType.industryCode}" pId="${industryType.parent.industryCode ne requestScope.industryType.industryCode?industryType.parent.industryCode:'0'}">
				<td><a href="${ctx}/rs/industryType/form?code=${industryType.industryCode}">${industryType.industryCode}</a></td>
				<td>${industryType.industryName}</td>
				<td>${industryType.industryNote}</td>
				<td>
					<a href="${ctx}/rs/industryType/form?code=${industryType.industryCode}">修改</a>
					<a href="${ctx}/rs/industryType/delete?code=${industryType.industryCode}" onclick="return confirmx('要删除该机构及所有子机构项吗？', this.href)">删除</a>
					<a href="${ctx}/rs/industryType/form?parentCode=${industryType.industryCode}">添加下级机构</a> 
				</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>
