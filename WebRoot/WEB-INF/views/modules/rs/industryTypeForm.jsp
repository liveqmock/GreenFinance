<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp" %>
<html>
  <head>
  	<meta name="decorator" content="default"/>
	<title>行业分类管理</title>
	<script type="text/javascript">
		$(document).ready(function(){
			$("#inputForm").validate({
			});
		});
	</script>
	
  </head>
  
  <body>
  	<ul class="nav nav-tabs">
		<li><a href="${ctx}/rs/industryType/">行业列表</a></li>
		<li class="active"><a href="${ctx}/rs/industryType/form">行业添加</a></li>
	</ul>
	<form:form id="inputForm" modelAttribute="industryType" action="${ctx}/rs/industryType/save" method="post">
		<tags:message content="${message }"></tags:message>
		<div class="control-group">
			<label class="control-label">上级行业:</label>
			<div class="controls">
                <tags:treeselect id="industryType" name="parent.industryCode" value="${industryType.parent.industryCode}" labelName="parent.industryName" labelValue="${industryType.parent.industryName}"
					title="行业" url="/rs/industryType/treeData" extId="${industryType.industryCode}" cssClass="required"/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">行业代码:</label>
			<div class="controls">
				<c:choose>
					<c:when test="${industryType.industryCode ne null }">
						<form:input path="industryCode" class="required"></form:input>
					</c:when>
					<c:otherwise>
						<form:input path="industryCode" class="required"></form:input>
					</c:otherwise>
				</c:choose>
				
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">行业名称:</label>
			<div class="controls">
				<form:input path="industryName" class="required"></form:input>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">行业说明:</label>
			<div class="controls">
				<form:textarea path="industryNote" htmlEscape="false" rows="3" maxlength="400" class="input-xlarge"/>	
			</div>
		</div>
		<div class="form-actions">
			<input id="btnSubmit" class="btn btn-primary" type="submit" value="保存"/>
			<input id="btnCancel" class="btn" type="button" value="返回" onclick="history.go(-1)"/>
		</div>
	</form:form>
  </body>
</html>
