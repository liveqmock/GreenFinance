<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp" %>
<html>
  <head>
  	<meta name="decorator" content="default"/>
	<title>空气质量指标信息管理</title>
	
  </head>
  
  <body>
  	<ul class="nav nav-tabs">
		<li class="active"><a href="${ctx}/rs/airStandardItem">空气质量指标列表</a></li>
		<li><a href="${ctx}/rs/airStandardItem/form">添加指标</a></li>
	</ul>
	<tags:message content="${message}"></tags:message>
	<table id="contentTable" class="table table-bordered table-condensed">
		<thead>
			<tr>
				<th>指标项名称</th>
				<th>平均时间</th>
				<th>单位</th>
				<th>操作</th>
			</tr>	
		</thead>
		<tbody>
			<c:forEach items="${page.list}" var="airStandardItem">
				<tr>
					<td>${airStandardItem.itemName}</td>
					<td>${airStandardItem.avarageTime}</td>
					<td>${airStandardItem.itemUnit}</td>
					<td>
						<a href="${ctx}/rs/airStandardItem/form?id=${airStandardItem.id}">修改</a>
						<a href="${ctx}/rs/airStandardItem/delete?id=${airStandardItem.id}">删除</a>
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<div class="pagination">${page }</div>
  </body>
</html>

