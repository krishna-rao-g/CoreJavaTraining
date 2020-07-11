package com.core.java.operators.arithmetic;

public class PeculiarIncrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 1;
		int z = ++a;
		// a is 2;
		int y = a++; // y should have been 3
		
		y = a;
		a = a+1;
		
		System.out.println(a);
		System.out.println(z);
		System.out.println(y);
		
		System.out.println(a);
		
		a = a +1;
	}

}
