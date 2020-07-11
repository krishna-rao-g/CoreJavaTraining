package com.core.java.operators.bitwise;

public class ShiftOperators {

	/*
      >>
      <<
      
      00001
      
      // left shifting
      00010
      
      // right shifting
      10000
      
      	==
	    !=
	    >
		<
		<=
		>=
		
      
      */
	public static void main(String[] args) {
		int a =1;
		a = a >> 1;
		System.out.println(a);
		
		int a1 = 1;
		a1 = a1 << 1;
		System.out.println(a1);
		
	}

}
