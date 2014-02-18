<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>

<html>
<head>
	<title>企业环境信息管理</title>
	<meta name="decorator" content="default"/>
</head>
<body>

	<div class="container-fluid breadcrumb">
		
		<div class="row-fluid span12">
			<span class="span2">
				<form id="getEnterBasicInfoForm" action="" method="post" class="hide"></form>
				<a id="selectButton" class="btn btn-primary">选择企业</a>
				<script type="text/javascript">
					$("#selectButton").click(function(){
						top.$.jBox.open("iframe:${ctx}/rs/industryType/listData", "选择企业",810,$(top.document).height()-240,{
							buttons:{"确定":"ok","关闭":true}, bottomText:"选择添加信息的企业。",submit:function(v, h, f){
								var id = h.find("iframe")[0].contentWindow.id;
								if (v=="ok"){
									$("#testLabel").html(id);
							    	$('#getEnterBasicInfoForm').attr('action','${ctx}/rs/enterAirInfo/?enterCode='+id).submit();
							    	return true;
								} 
							}, loaded:function(h){
								$(".jbox-content", top.document).css("overflow-y","hidden");
							}
						});
					});
				</script>
			</span>
			<span class="span3">企业代码: <b id="enterCode">${enterBasicInfo.enterCode}</b></span>
			<span class="span3">企业名称: ${enterBasicInfo.enterName}</span>
			<span class="span4">
				日期:
				<input id="selectDate" type="text" readonly="readonly" maxlength="20" class="input-medium Wdate"
						value="<fmt:formatDate value="${article.createDate}" pattern="yyyy-MM-dd"/>"
						onclick="WdatePicker({dateFmt:'yyyy-MM-dd',isShowClear:false});"/>
			</span>
		</div>
	</div>
	<ul class="nav nav-tabs">
		<li class="active"><a href="">大气环境</a></li>
		<li><a href="">固体废弃物环境</a></li>
		<li><a href="">声环境</a></li>
		<li><a href="">水环境</a></li>
		<li><a href="">节能生产</a></li>
		<li><a href="">节能减排</a></li>
		<li><a href="">生态环境</a></li>
	</ul>
	<form id="listForm" method="post"> 
		<table id="contentTable" class="table table-bordered table-condensed">
			<thead><tr><th>污染物项目</th><th>平均时间</th><th>浓度</th><th>单位</th></tr></thead>
			<tbody>
				<c:forEach items="${airStandardItems}" var="airStandardItem"> 
					<tr>
						<td>${airStandardItem.itemName }</td>
						<td>${airStandardItem.avarageTime }</td>
						<td>
							<input type="hidden" name="enterCodes" value="${enterBasicInfo.enterCode}"/>
							<input type="hidden" name="itemIds" value="${airStandardItem.id}"/>
							<input id="date" type="hidden" name="date"/>
							<input type="text" name="values" value="0.0" style="width:50px;margin:0;padding:0;text-align:center;">
						</td>
						<td>${airStandardItem.itemUnit }</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>	
	</form>
	<div class="form-actions">
		<input id="btnSubmit" class="btn" type="button" value="保存" onclick="save();"/>
		<script type="text/javascript">
			function save(){
				if(($("#selectDate").val() == null || $("#selectDate").val() == "") ||
						($("#enterCode").html() == null || $("#enterCode").html()=="")){
					alert("企业与日期都不能为空！");
				}else{
					$("#date").val($("#selectDate").val());
					$("#listForm").attr("action","${ctx}/rs/enterAirInfo/save").submit();
				}
			}
		</script>
		<input id="btnCancel" class="btn" type="button" value="返回" onclick="history.go(-1)"/>
	</div>

</body>
</html>
