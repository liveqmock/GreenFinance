<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp" %>
<html>
  <head>
  	<meta name="decorator" content="default"/>
	<title>rs test</title>
	
  </head>
  
  <body>
  	<ul class="nav nav-tabs">
		<li class="active"><a href="${ctx}/rs/enterBasicInfo">企业列表</a></li>
	</ul>
	<table id="contentTable" class="table table-bordered table-condensed">
		<thead>
			<tr>
				<th>
					企业代码
				</th>
			</tr>	
		</thead>
		<tbody>
			<c:forEach items="${page.list}" var="enterBasicInfo">
				<tr>
					<td>${enterBasicInfo.enterCode}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<div class="pagination">${page }</div>
  </body>
</html>
