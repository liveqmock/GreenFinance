<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp" %>
<html>
  <head>
  	<meta name="decorator" content="default"/>
	<title>空气质量指标信息管理</title>
	<script type="text/javascript">
		$(document).ready(function(){
			$("#inputForm").validate({
			});
		});
	</script>
	
  </head>
  
  <body>
  	<ul class="nav nav-tabs">
		<li><a href="${ctx}/rs/airStandardItem">空气质量指标列表</a></li>
		<li class="active"><a href="${ctx}/rs/airStandardItem/form">添加指标</a></li>
	</ul>
	<form:form id="inputForm" modelAttribute="airStandardItem" action="${ctx}/rs/airStandardItem/save" method="post">
		<tags:message content="${message }"></tags:message>
		<form:hidden path="id"/>
		<div class="control-group">
			<label class="control-label">指标项名称</label>
			<div class="controls">
				<form:input path="itemName" class="required"/>
				
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">平均时间</label>
			<div class="controls">
				<form:input path="avarageTime" class="required"/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">单位</label>
			<div class="controls">
				<form:input path="itemUnit" class="required"/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">国家标准</label>
			<div class="controls">
				<form:input path="gbValue" />
			</div>
		</div>
		<div class="form-actions">
			<input id="btnSubmit" class="btn btn-primary" type="submit" value="保存"/>
			<input id="btnCancel" class="btn" type="button" value="返回" onclick="history.go(-1)"/>
		</div>
	</form:form>
  </body>
</html>
