package com.core.java.controlstatements;

public class SelectionStatements {

	public static void main(String[] args) {

		int byteAvailable = 10;
		
		if (byteAvailable > 1000000) {
			System.out.println("To big to process");
		} else if (byteAvailable > 100) {
			System.out.println("process");
		} else {
			System.out.println("invalid output ");
		}
		
		int month = 4; // April 
		String season = null;
		
		if(month ==12 || month == 1 || month == 2) {
			season = "winter";
		} else if (month ==3 || month == 4 || month == 5) {
			season = "spring";
		}else if (month ==6 || month == 7 || month == 8) {
			season = "summer";
		}
		
		System.out.println(season);

	}

}
