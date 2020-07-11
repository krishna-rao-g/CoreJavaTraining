package com.core.java.controlstatements;

public class SwitchStatements {
	/*
	 * switch(expreission) { case value1: // statements break; case value2: //
	 * statements case value3: // statements
	 * 
	 * . . . case valueM: // statements break;
	 * 
	 * default: // default statemenst
	 * 
	 * }
	 */
	public static void main(String[] args) {

		for (int i = 0; i < 6; i++) {

			switch (i) {
			case 0:
				System.out.println(0);
				break;
				 
			case 1:
				System.out.println(1);
				break;
			case 3:
			default:
				System.out.println("no matching case");
			}
		}

	}

}
