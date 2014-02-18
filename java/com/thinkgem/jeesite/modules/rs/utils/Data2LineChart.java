package com.thinkgem.jeesite.modules.rs.utils;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Data2LineChart {
	
	public static String LINEOPTIONS = "{" + 
			"	datasetFill : false,}";
	
	public static String data2Chart(Map<String, List> m) {
		String lineChartData = new String();
		String scaleOverride = "{scaleOverride : false,";
		StringBuffer labels = new StringBuffer("labels : [");
		StringBuffer datasets = new StringBuffer("datasets : [");
		List label = m.get("label");
		for (int i = 0; i < label.size(); i++) {
			labels.append("\"");
			labels.append(label.get(i) + "\",");
		}
		labels.append("],");
		m.remove("label");
		Iterator<Entry<String, List>> it = m.entrySet().iterator();
		int j = 0;
		while (it.hasNext()) {
			Entry<String, List> entry = it.next();
			System.out.println();
			List data = entry.getValue();
			StringBuffer dataset = new StringBuffer();
			if (entry.getKey().equals("standard")) {
				dataset.append("{"
						+ "					strokeColor : \"rgba(255,0,0,1)\","
						+ "					pointColor : \"rgba(255,0,0,1)\","
						+ "					data : [");
			}else if(entry.getKey().equals("fact1")){
				dataset.append("{"
						+ "					strokeColor : \"rgba(0,255,0,1)\","
						+ "					pointColor : \"rgba(0,255,0,1)\","
						+ "					data : [");
			}
	
			for (int i = 0; i < data.size(); i++) {
				dataset.append(data.get(i) + ",");
//				System.out.println(dataset);
			}
			dataset.append("]" + "				},");
			datasets.append(dataset);
			j++;
		}
		datasets.append("]");
		lineChartData = scaleOverride + labels + datasets;
		lineChartData += "}";
//		System.out.println(lineChartData);
		return lineChartData;
	}
}
