package com.core.java.exceptions;

// java.lang.ArithmeticException, java.lang.ArrayIndexOutOfBoundsException:
// not autochecked by eclipse - consider as un-checked exceptions
public class Exc1 {

	public static void main(String[] args) {
		// Arithmetic
		try {
			//int quotient = division(0);
			//System.out.println(quotient);
			
			//int val[] = new int[2];
			//System.out.println(val[3]);
			
			String name = null;
			System.out.println(name.length());
		} catch (ArithmeticException ex ) {
			System.out.println("Arithmeticexcpetion is caught");
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("Arrayindexout of bond is caught");
		} catch (Exception ex) {
			System.out.println("unkown exception caught");
		}
		finally {
			System.out.println("In finally ");
		}

		

	}

	public static int division(int denominator) {
		return 10 / denominator;
	}

}
