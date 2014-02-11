<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp" %>
<html>
  <head>
  	<meta name="decorator" content="default"/>
	<title>企业基本信息管理</title>
	
  </head>
  
  <body>
  	<ul class="nav nav-tabs">
		<li class="active"><a href="${ctx}/rs/enterBasicInfo">企业列表</a></li>
		<li><a href="${ctx}/rs/enterBasicInfo/form">添加企业</a></li>
	</ul>
	<tags:message content="${message}"></tags:message>
	<table id="contentTable" class="table table-bordered table-condensed">
		<thead>
			<tr>
				<th>企业代码</th>
				<th>行业类型</th>
				<th>行政区编号</th>
				<th>法人代码</th>
				<th>开业时间</th>
				<th>企业地址</th>
				<th>企业名称</th>
				<th>企业类型</th>
				<th>联系人</th>
				<th>传真</th>
				<th>经度</th>
				<th>纬度</th>
				<th>邮编</th>
				<th>联系电话</th>
				<th>操作</th>
			</tr>	
		</thead>
		<tbody>
			<c:forEach items="${page.list}" var="enterBasicInfo">
				<tr>
					<td>${enterBasicInfo.enterCode}</td>
					<td>${enterBasicInfo.industryType}</td>
					<td>${enterBasicInfo.codeRegion}</td>
					<td>${enterBasicInfo.corpCode}</td>
					<td>${enterBasicInfo.createTime}</td>
					<td>${enterBasicInfo.enterAddress}</td>
					<td>${enterBasicInfo.enterName}</td>
					<td>${enterBasicInfo.enterType}</td>
					<td>${enterBasicInfo.linkMan}</td>
					<td>${enterBasicInfo.fax}</td>
					<td>${enterBasicInfo.longitude}</td>
					<td>${enterBasicInfo.latitude}</td>
					<td>${enterBasicInfo.postalCode}</td>
					<td>${enterBasicInfo.telephone}</td>
					<td>
						<a href="${ctx}/rs/enterBasicInfo/form?enterCode=${enterBasicInfo.enterCode}">修改</a>
						<a href="${ctx}/rs/enterBasicInfo/delete?enterCode=${enterBasicInfo.enterCode}">删除</a>
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<div class="pagination">${page }</div>
  </body>
</html>
