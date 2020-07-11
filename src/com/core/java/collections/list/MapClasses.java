package com.core.java.collections.list;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapClasses {

	public static void main(String[] args) {
		Map<String, Double> hm1 = new HashMap<String, Double>();

		hm1.put("John Doe", Double.valueOf(3434.34));
		hm1.put("Tom Smith", Double.valueOf(123.34));
		hm1.put("Jane Baker", Double.valueOf(1378.34));
		hm1.put("Ralp Smith", Double.valueOf(99.34));
		System.out.println("HashMap : " + hm1);
		System.out.println("getting value from map  : " + hm1.get("Jane Baker"));

		printMap(hm1);

		Map<String, Double> hm2 = new LinkedHashMap<String, Double>();
		hm2.put("John Doe", Double.valueOf(3434.34));
		hm2.put("Tom Smith", Double.valueOf(123.34));
		hm2.put("Jane Baker", Double.valueOf(1378.34));
		hm2.put("Ralp Smith", Double.valueOf(99.34));
		System.out.println("LinkedHashMap : " + hm2);
		printMap(hm1);

		Map<String, Double> hm3 = new TreeMap<String, Double>();
		hm3.put("John Doe", Double.valueOf(3434.34));
		hm3.put("Tom Smith", Double.valueOf(123.34));
		hm3.put("Jane Baker", Double.valueOf(1378.34));
		hm3.put("Ralp Smith", Double.valueOf(99.34));
		System.out.println("TreeMap : " + hm3);
		printMap(hm1);
	}

	private static void printMap(Map<String, Double> hm1) {
		Set<String> keys = hm1.keySet();
		keys.forEach(key -> {
			System.out.println("Key : " + key + "Value : " + hm1.get(key));
		});
	}

}
