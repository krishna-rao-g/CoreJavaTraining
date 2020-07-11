package com.core.java.basicoverview;

import java.util.ArrayList;
import java.util.*;

public class BasicJava {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("Hello");
		
		Set<String> st = new HashSet<String>();
		st.add("Hello1");
		st.add("Hello1");
		st.add("Hello2");
		
		Map<String,String> mp = new HashMap<String,String>();
		mp.put("India", "AAA");
		mp.put("Nepal", "BBB");
		
		int []a = new int[10];
		
		//setting
		 int input = 4;
		 
		 int index = input % (a.length);
		 
		 a[index] = input;
		 
		 //getting
		 int input1 = 4;
		 
		 int get_index = input1 % (a.length);
		 
		//  a[get_index]	
		
		// Data in db
		
		// take that data
		
		// process and show to user / extra 
	/*	100 rows 
		
		collections 
		
		List -> it will have duplicate -> maintains the order
		Set -> it will not have duplicates -> does not maintian order
		Map -> key,value data structure -> does not maintain order
		
		LinkedSet   -> order mainitaining
		LinkedMap
		
		SortedSet
		
		first in first out -> Queue 
		last in first out -> stack 
		
		  Sort -> A, C, B {A, B, C}
		
		
	 
		
		
		*/
		
		
		
		System.out.println("Main class");
		
		//
		System.out.println("args length" + args.length);

	}
	
	public static void main() {
		System.out.println("Main class");
		
	

	}
	
	
	public static void main(int[] args ){
		System.out.println("Main class");
		
	

	}
	
	
	public void main1(int[] args ){
		System.out.println("Main class");
		
	

	}
	
	public String main1(){
		System.out.println("Main class");
		
	   return "ffg";

	}
	
	
	
	

}
