package com.core.java.collections.list;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MapCpllection {

	public static void main(String[] args) {
		// way 1
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("A", "Apple,Aries,Aquarium");
		map.put("B", "Ball,Bring,Bat");

		System.out.println("Java map with string as value:" + map);

		// way 2
		HashMap<String, List<String>> map1 = new HashMap<String, List<String>>();
		ArrayList<String> dicA = new ArrayList<String>();
		dicA.add("Apple");
		dicA.add("Aries");
		dicA.add("Aquarium");
		map1.put("A", dicA);

		ArrayList<String> dicB = new ArrayList<String>();
		dicB.add("Ball");
		dicB.add("Bring");
		dicB.add("Bat");
		map1.put("B", dicB);

		System.out.println("Java map with list as value:" + map1);

	}

}
