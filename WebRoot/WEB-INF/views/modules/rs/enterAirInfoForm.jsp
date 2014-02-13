<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp" %>
<html>
  <head>
  	<meta name="decorator" content="default"/>
	<title>大气环境</title>
	
  </head>
  
  <body>
  	<ul class="nav nav-tabs">
		<li class="active"><a href="">大气环境</a></li>
		<li><a href="">水环境</a></li>
		<li><a href="">声环境</a></li>
		<li><a href="">固体废弃物环境</a></li>
		<li><a href="">节能生产</a></li>
		<li><a href="">节能减排</a></li>
		<li><a href="">生态环境</a></li>
	</ul>
	<form:form id="inputForm" action="${ctx}/rs/enterAirInfo/save" method="post">
		<tags:message content="${message }"></tags:message>
		<div class="control-group">
			<label class="control-label">S02浓度限值</label>
			<div class="controls">
			</div>
			<label class="control-label">ug/m3</label>
		</div>
		<div class="control-group">
			<label class="control-label">平均时间</label>
			<div class="controls">
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">单位</label>
			<div class="controls">
			</div>
		</div>
		<div class="form-actions">
			<input id="btnSubmit" class="btn btn-primary" type="submit" value="保存"/>
			<input id="btnCancel" class="btn" type="button" value="返回" onclick="history.go(-1)"/>
		</div>
	</form:form>
  </body>
</html>
