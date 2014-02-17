package com.thinkgem.jeesite.modules.rs.utils;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Data2LineChart {
	public static String data2Chart(Map<String, List> m) {
		String lineChartData = new String();
		String scaleOverride = "scaleOverride : false,";
		StringBuffer labels = new StringBuffer("labels : [\"");
		StringBuffer datasets = new StringBuffer("datasets : [");
		List label = m.get("label");
		for (int i = 0; i < label.size(); i++) {
			labels.append(label.get(i) + "\",");
		}
		labels.append("],");
		m.remove("label");
		Iterator<Entry<String, List>> it = m.entrySet().iterator();
		while (it.hasNext()) {
			Entry<String, List> entry = it.next();
			System.out.println(entry.getKey());
			List data = entry.getValue();
			StringBuffer dataset = new StringBuffer("{"
					+ "					fillColor : \"rgba(220,220,220,0.5)\","
					+ "					strokeColor : \"rgba(220,220,220,1)\","
					+ "					pointColor : \"rgba(220,220,220,1)\","
					+ "					pointStrokeColor : \"#fff\"," + "					data : [");
			for (int i = 0; i < data.size(); i++) {
				dataset.append(data.get(i) + ",");
			}
			dataset.append("]" + "				},");
			datasets.append(dataset + "]");
		}
		lineChartData = scaleOverride + labels + datasets;
		System.out.println(lineChartData);
		return lineChartData;
	}
}
