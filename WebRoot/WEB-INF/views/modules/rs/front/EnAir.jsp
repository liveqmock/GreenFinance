<%@ page contentType="text/html;charset=UTF-8"%>
<%@ include file="/WEB-INF/views/modules/rs/front/include/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<title>空气环境</title>

<meta name="decorator" content="rs_default" />
<meta name="description" content="lsjr ${site.description}" />
<meta name="keywords" content="lsjr ${site.keywords}" />

<script src="../Chart.js"></script>
<meta name = "viewport" content = "initial-scale = 1, user-scalable = no">
<style>
	canvas{
	}
</style>
</head>

<body>
	<h1>
		这里是图表显示页面！！
	</h1>
			<canvas id="canvas" height="450" width="600"></canvas>


	<script>

		var lineChartData = ${chart};

	var myLine = new Chart(document.getElementById("canvas").getContext("2d")).Line(lineChartData);
	
	</script>
</body>
</html>