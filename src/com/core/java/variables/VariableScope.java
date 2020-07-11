package com.core.java.variables;

public class VariableScope {

	public static void main(String[] args) {

		int x;

		x = 10;
		int y = 20; // started here
		if (x == 10) {
			System.out.println(x + " " + y);
			x = y + 2;
		} // ended here

		System.out.println(x);
		System.out.println(y);
	}

}
