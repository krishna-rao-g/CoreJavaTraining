package com.core.java.strings;

public class JavaString {

	public static void main(String[] args) {
		// 1 way
		String s = new String();

		// 2 way
		char chars[] = { 'a', 'b', 'c' };
		String s1 = new String(chars);

		// 3 way
		String s2 = new String("abc");

		// 4 way
		byte ascii[] = { 65, 66, 67, 68, 69, 70 };
		String s4 = new String(ascii);
		System.out.println(s4);

		// 5 way
		char chars1[] = { 'a', 'b', 'c', 'd', 'e', 'f' };
		String s5 = new String(chars1, 0, 6);
		System.out.println("Limited string : " + s5);

		System.out.println(s5.length());
		System.out.println(s5);
		System.out.println(s5.toString());

		System.out.println("Char at zero : " + s5.charAt(0));
		System.out.println("Char at zero : " + s5.charAt(1));

		System.out.println(s5.toCharArray());

		String s6 = "Hello";
		String s7 = "Hello";

		System.out.println(s6.equals(s7));// string constant pool
		System.out.println(s6 == s7); // it checks reference of the object in string constant pool

		String s8 = new String("Hello"); // heap
		String s9 = new String("Hello"); // heap

		System.out.println(s8.equals(s9)); // here it checks whether the value is
		System.out.println(s8 == s9); // it checks reference for object in heap

		String s10 = "Hello"; // string constant pool
		String s11 = new String("Hello"); // heap
		System.out.println(s10.equalsIgnoreCase(s11));
		System.out.println(s10 == s11);

		String s21 = "geeks for geeks";

		if (s21.startsWith("geeks")) {
			System.out.println("Success it starts with key word");
		}

		System.out.println(s21.charAt(s21.indexOf('e')));
		System.out.println(s21.indexOf("geeks"));

		// substring, concat , trim, replace

		// string is a imutable -> cannot be changed

		//concat
		String s45 = "Hello";// it is present in string constant pool
		s45 = s45.concat(" world");
		System.out.println(s45);

		s45 = s45 + " world";
		System.out.println(s45);

		//replace
		s45 = s45.replace("world", "->");
		System.out.println(s45);
		
		//trim
		String s46 = "Rakesh      ";
		s46 = s46.trim();
		System.out.println(s46);
		
	}

}
