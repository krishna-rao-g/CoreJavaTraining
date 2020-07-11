package com.core.java.controlstatements;

public class ComplexControl {

	/*
	 * 0 0 1 0 2 4 0 3 6 9 0 4 8 12 16
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		outer: for (int i = 0; i < 5; i++) {
		inner:	for (int j = 0; j < 5; j++) {
				if (j > i) {
					System.out.println();
					continue outer;
				}
				System.out.print(" " + (i * j));
			}
		}
		System.out.println();
	}

}
