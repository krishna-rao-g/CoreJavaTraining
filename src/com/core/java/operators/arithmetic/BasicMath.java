package com.core.java.operators.arithmetic;

public class BasicMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 1 + 1;
		a = a + 1;
		a += 4;
		a %= 4;
		int b = a * 3;
		int c = b/4;
		int d = c - a;
		int e = -d;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		
		
		// increment and decrement
		int counter = 0;
		
		for(int i=0; i< 10; i++) {
			counter = counter + 1;
		}
		System.out.println(counter);
		
		for(int i=0; i< 10; i++) {
			counter += 1;
		}
		
		System.out.println(counter);
		
		for(int i=0; i< 10; i++) {
			counter++;
		}
		
        System.out.println(counter);
		
		for(int i=0; i< 10; i++) {
			++counter;
		}
		
		System.out.println(counter);
	}

}
