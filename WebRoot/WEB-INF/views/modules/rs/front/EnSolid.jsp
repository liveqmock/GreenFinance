<%@ page contentType="text/html;charset=UTF-8"%>
<%@ include file="/WEB-INF/views/modules/rs/front/include/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
	<title>固体环境</title>
	<meta name="decorator" content="rs_default" />
	<meta name="description" content="lsjr ${site.description}" />
	<meta name="keywords" content="lsjr ${site.keywords}" />
	
	<meta name = "viewport" content = "initial-scale = 1, user-scalable = no">
</head>

<body>
	<h1>
		${enterBasicInfo.enterName}--固体环境
	</h1>
	<c:forEach  items="${charts}" var="chartj" varStatus="idx" step="2" >
		<div class="row">
			<div class="span6" style="text-align:center">
					<dl>
						<dt >
							图表${solidInfoss[idx.index][0].solidStandardItem.itemName}单位：${solidInfoss[idx.index][0].solidStandardItem.itemUnit}
						</dt>
						<dd>
						<canvas id="canvas${idx.index}" height="300" width="300" ></canvas>
						</dd>
					</dl>
				</div>
				<c:if test="${not empty charts[idx.index+1]}">
				<div class="span6" style="text-align:center">
					<dl>
						<dt>
							图表${solidInfoss[idx.index+1][0].solidStandardItem.itemName}单位：${solidInfoss[idx.index][0].solidStandardItem.itemUnit}
						</dt>
						<dd>
						<canvas id="canvas${idx.index+1}" height="300" width="300" ></canvas>
						</dd>
					</dl>
				</div>
				</c:if>
		</div>
	</c:forEach>
		
			<script  type="text/javascript">
			<c:forEach items="${charts}" var="chartj" varStatus="idx">
			
				var myLine = new Chart(document.getElementById("canvas${idx.index}").getContext("2d")).Line(${chartj},${lineOptions});
			</c:forEach>
			</script>
</body>
</html>