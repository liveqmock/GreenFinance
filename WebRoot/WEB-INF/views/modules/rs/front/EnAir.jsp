<%@ page contentType="text/html;charset=UTF-8"%>
<%@ include file="/WEB-INF/views/modules/rs/front/include/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
	<title>空气环境</title>
	<meta name="decorator" content="rs_default" />
	<meta name="description" content="lsjr ${site.description}" />
	<meta name="keywords" content="lsjr ${site.keywords}" />
	
	<meta name = "viewport" content = "initial-scale = 1, user-scalable = no">
</head>

<body>
	<h1>
		这是空气绘图页面！！
	</h1>
		
			<div class="row">
				<div class="span4">
					<dl>
						<dt style="text-align:center">
							图表
						</dt>
						<dd>
						<canvas id="canvas" height="300" width="300"></canvas>
						</dd>
					</dl>
				</div>
				<div class="span4">
					<dl>
						<dt>
							图表
						</dt>
						<dd>
						<canvas id="canvas2" height="300" width="300"></canvas>
						</dd>
					</dl>
				</div>
				<div class="span4">
					<dl>
						<dt>
							图表
						</dt>
						<dd>
						<canvas id="canvas3" height="100" width="300"></canvas>
						</dd>
					</dl>
				</div>
			</div>
		
			<script  type="text/javascript">
				var lineChartData = {scaleOverride : false,labels : ["2014-01-01","2014-01-01","2014-01-02",],datasets : [{					fillColor : "rgba(220,220,220,0.5)",					strokeColor : "rgba(220,220,220,1)",					pointColor : "rgba(220,220,220,1)",					pointStrokeColor : "#fff",					data : [1.0,1.0,2.0,]				},]};
				//alert(lineChartData);
				new Chart(document.getElementById("canvas").getContext("2d")).Line(lineChartData);
				new Chart(document.getElementById("canvas2").getContext("2d")).Line(lineChartData);
				new Chart(document.getElementById("canvas3").getContext("2d")).Line(lineChartData);
			</script>
</body>
</html>