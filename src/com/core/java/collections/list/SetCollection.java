package com.core.java.collections.list;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetCollection {

	public static void main(String[] args) {
		Set<String> values = new HashSet<String>();
		values.add("B");
		values.add("A");
		values.add("D");
		values.add("C");
		values.add("Z");
		values.add("M");
		values.add("N");
		values.add("K");
		
		values.add("C");
		values.add("A");
		System.out.println("This is HashSet" + values);

		Set<String> linkedSet = new LinkedHashSet<String>();
		linkedSet.add("B");
		linkedSet.add("A");
		linkedSet.add("D");
		linkedSet.add("C");

		linkedSet.add("C");
		linkedSet.add("A");
		System.out.println("LinkedHashSet: "+ linkedSet);
		
		Set<String> ts = new TreeSet<String>();
		ts.add("B");
		ts.add("A");
		ts.add("D");
		ts.add("C");
		ts.add("Z");
		ts.add("M");
		ts.add("N");
		ts.add("K");
		
		ts.add("C");
		ts.add("A");
		System.out.println("Tree set :"+ ts);
	}

}
