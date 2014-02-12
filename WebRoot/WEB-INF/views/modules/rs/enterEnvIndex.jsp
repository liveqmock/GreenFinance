<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>

<html>
<head>
	<title>企业环境信息管理</title>
	<meta name="decorator" content="default"/>
</head>
<body>
	<div class="row-fluid">
		<div id = "left" class="span4" style="width: 160px;">
			<iframe id="enterEnvMenuFrame" name="enterEnvMenuFrame" src="${ctx}/rs/enterEnvInfo/industryTree" style="overflow:visible"
				scrolling="yes" frameborder="no" width="100%"></iframe>
		</div>
		<div id = "mid" class="span4" style="width:160px;">
			<iframe id="enterEnvMidFrame" name="enterEnvMidFrame" src="" style="overflow:visible"
				scrolling="yes" frameborder="no" width="100%"></iframe>
		</div>
		<div id = "right" class="span4" style="width:400px;">
			<iframe id="enterEnvMainFrame" name="enterEnvMainFrame" src="" style="overflow:visible;"
				scrolling="yes" frameborder="no" width="100%"></iframe>
		</div>
	</div>
	<script type="text/javascript"> 
		var leftWidth = "160"; // 左侧窗口大小
		function wSize(){
			var strs=getWindowSize().toString().split(",");
			$("#enterEnvMenuFrame, #enterEnvMidFrame, #enterEnvMainFrame, #openClose").height(strs[0]-5);
			$("#right").width($("body").width()-$("#left").width()-$("#mid").width() -70);
		}
	</script>
	<script src="${ctxStatic}/common/wsize.min.js" type="text/javascript"></script>
</body>
</html>
