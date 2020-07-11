package com.core.java.variables;

public class Conversion {

	public static void main(String[] args) {
		
		
		byte b;
		int i = 257;
		double d = 323.142;
	
		
		// Convertion fails
		System.out.println("Converstions");
		
		b = (byte)i;
		
		System.out.println("i and b "+ i + " "+ b);
		
		i = (int)d;
	
		System.out.println("d and i "+ d + " "+ i);
		
		b= (byte) d;
		
		System.out.println("d and b "+ d + " "+ b);
		
		// Auto Promotion 
		byte b1 = 40;
		byte b2 = 50;
		byte b3 = 100;
		
		int d1 = (b1 * b2 * b3);
		System.out.println(d1);
		
		//
		byte b6 = 50;
		b6 = (byte)(b6 * 2); // multiplication it to int
		System.out.println(b6);
		
	}

}
