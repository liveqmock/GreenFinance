<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  	<meta name="decorator" content="default"/>
  	<title>企业基本信息管理</title>
  </head>
  
  <body>
	<ul class="nav nav-tabs">
		<li><a href="${ctx}/rs/enterBasicInfo/list">企业列表</a></li>
		<li class="active"><a href="${ctx}/rs/enterBasicInfo/form">添加企业</a></li>
	</ul>

	<form:form id="inputForm" modelAttribute="enterBasicInfo" action="${ctx}/rs/enterBasicInfo/save" method="post" >
		<tags:message content="${message }"/>
		<div class="control-group">
			<label class="control-label">企业代码</label>
			<div class="controls">
				<form:input path="enterCode" />
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">行业类型</label>
			<div class="controls">
				<tags:treeselect id="industryType" name="industryType" value="${enterBasicInfo.industryType}" labelName="industryType.industryName" labelValue="${enterBasicInfo.industryType.industryName}"
					title="行业" url="/rs/industryType/treeData" extId="${industryType.industryCode}" cssClass="required"/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">行政区编号</label>
			<div class="controls">
				<form:input path="codeRegion" />
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">法人代码</label>
			<div class="controls">
				<form:input path="corpCode"/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">开业时间</label>
			<div class="controls">
				<form:input path="createTime"/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">企业地址</label>
			<div class="controls">
				<form:input path="enterAddress"/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">企业名称</label>
			<div class="controls">
				<form:input path="enterName"/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">企业类型</label>
			<div class="controls">
				<form:input path="enterType"/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">联系人</label>
			<div class="controls">
				<form:input path="linkMan"/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">企业名称</label>
			<div class="controls">
				<form:input path="enterName"/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">传真</label>
			<div class="controls">
				<form:input path="fax"/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">经度</label>
			<div class="controls">
				<form:input path="longitude"/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">纬度</label>
			<div class="controls">
				<form:input path="latitude"/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">邮编</label>
			<div class="controls">
				<form:input path="postalCode"/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">联系电话</label>
			<div class="controls">
				<form:input path="telephone"/>
			</div>
		</div>
		<div class="form-actions">
			<input id="btnSubmit" class="btn btn-primary" type="submit" value="保存"/>
			<input id="btnCancel" class="btn" type="button" value="返回" onclick="history.go(-1)"/>
		</div>
	</form:form>
  </body>
</html>
