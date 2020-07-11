package com.core.java.operators.bitwise;

public class BitWiseOperators {

	/*
	A   B   A|B    A&B      A^B   ~A
	0   0   0       0       0      1
	1   0   1       0       1      0
	0   1   1       0       1      1
	1   1   1       1       0      0
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean payment = true;
		boolean shipItem = true;
		
		boolean payOnline = true;
		boolean payBycash = false;
		
		System.out.println(payment&shipItem);
		
		System.out.println(payOnline | payBycash);
		
		boolean trainticket = true;
		boolean flightticklet = false;
		
		System.out.println(trainticket^flightticklet);
		
	//	boolean output = function1() && function2();
	  //  System.out.println(output);
	    
	    boolean output1 = function1() || function2();
	    System.out.println(output1);

	}
	
	public static boolean function1 () {
		System.out.println("function1");
		return false;
	}
	
	public static boolean function2 () {
		System.out.println("function2");
		return false;
	}

}
