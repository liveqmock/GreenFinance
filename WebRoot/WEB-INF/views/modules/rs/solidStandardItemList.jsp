<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp" %>
<html>
  <head>
  	<meta name="decorator" content="default"/>
	<title>固体污染指标信息管理</title>
	<script type="text/javascript">
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
		<li class="active"><a href="${ctx}/rs/solidStandardItem">空气质量指标列表</a></li>
		<li><a href="${ctx}/rs/solidStandardItem/form">添加指标</a></li>
	</ul>
	<tags:message content="${message}"></tags:message>
	<form:form id="searchForm" modelAttribute="link" action="${ctx}/rs/solidStandardItem/" method="post" class="breadcrumb form-search">
		<input id="pageNo" name="pageNo" type="hidden" value="${page.pageNo}"/>
		<input id="pageSize" name="pageSize" type="hidden" value="${page.pageSize}"/>
	</form:form>
	<table id="contentTable" class="table table-bordered table-condensed">
		<thead>
			<tr>
				<th>指标项名称</th>
				<th>适用范围</th>
				<th>单位</th>
				<th>国家标准</th>
				<th>操作</th>
			</tr>	
		</thead>
		<tbody>
			<c:forEach items="${page.list}" var="solidStandardItem">
				<tr>
					<td>${solidStandardItem.itemName}</td>
					<td>${solidStandardItem.enterScope}</td>
					<td>${solidStandardItem.itemUnit}</td>
					<td>${solidStandardItem.gbValue }</td>
					<td>
						<a href="${ctx}/rs/solidStandardItem/form?id=${solidStandardItem.id}">修改</a>
						<a href="${ctx}/rs/solidStandardItem/delete?id=${solidStandardItem.id}">删除</a>
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<div class="pagination">${page }</div>
  </body>
</html>

