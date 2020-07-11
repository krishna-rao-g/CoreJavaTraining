package com.core.java.strings;

public class StringBufferPrac {

	public static void main(String[] args) {
		// Synchronized format
		StringBuffer sb = new StringBuffer("Hello");
		sb.append("world");
        System.out.println(sb.toString());
        
        System.out.println(sb.reverse());
	}

}
