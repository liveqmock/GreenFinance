<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
	<title>选择企业</title>
	<%@include file="/WEB-INF/views/include/treeview.jsp" %>
	<meta name="decorator" content="default"/>
	<script type="text/javascript">
	
		var industryTree;
		var selectedTree;//zTree已选择对象
		
		// 初始化
		$(document).ready(function(){
			industryTree = $.fn.zTree.init($("#industryTree"), setting, industryNodes);
			selectedTree = $.fn.zTree.init($("#selectedTree"), setting, selectedNodes);
		});

		var setting = {view: {selectedMulti:false,nameIsHTML:true,showTitle:false},
				data: {simpleData: {enable: true}},
				callback: {onClick: treeOnClick}};
		
		var industryNodes=[
	            <c:forEach items="${industryTypies}" var="industryType">
	            {id:"${industryType.industryCode}",
	             pId:"${not empty industryType.parent?industryType.parent.industryCode:0}", 
	             name:"${industryType.industryName}"},
	            </c:forEach>];
	
		
		var pre_ids = "${selectIds}".split(",");
		var ids = "${selectIds}".split(",");
		
		//点击选择项回调
		function treeOnClick(event, treeId, treeNode, clickFlag){
			if("industryTree"==treeId){
				$.get("${ctx}/rs/enterBasicInfo/enters?industryCode=" + treeNode.id, function(enterNodes){
					$.fn.zTree.init($("#enterTree"), setting, enterNodes);
				});
			}
			if("enterTree"==treeId){
				if($.inArray(String(treeNode.id), ids)<0){
					id = String(treeNode.id);
				}
			}
		}
	</script>
</head>
<body>
	<div id="assignRole" class="row-fluid span12">
		<div class="span6" style="border-right: 1px solid #A8A8A8;">
			<p>行业分类：</p>
			<div id="industryTree" class="ztree"></div>
		</div>
		<div class="span6">
			<p>行业企业：</p>
			<div id="enterTree" class="ztree"></div>
		</div>
	</div>
</body>
</html>
