package com.core.java.strings;

public class CustomString {
	public static String x1;
	public static int a;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char c1 = 'A';
		char c2 = 'B';
		char c3 = 'C';
		System.out.println(c1 + "" + c2 + "" + c3);

		char abc[] = new char[3];
		abc[0] = 'A';
		abc[1] = 'B';
		abc[2] = 'C';

		for (char c : abc) {
			System.out.print(c + "");
		}

		System.out.println(x1);
		System.out.println(a);
		
		String1 string = new String1();
		string.append('A');
		string.append('B');
		System.out.println("Custom java string :- " + string.append('C'));
		
		//String constant pool
		String value = "ABC";
		System.out.println(value);
		
		// Heap area 
		String value1 = new String("ABC");
		System.out.println(value1);
	}

}

class String1 {

	char abc[];
	int counter;

	public String1() {
		abc = new char[10];
	}

	public String1(String xyz) {

	}
	
	public String append(char value) {
		abc[++counter] = value;
		return consolidatedString();
	}

	private String consolidatedString() {
		String x = "";
		for (char c : abc) {
			x+=c;
		}
		return x;
	}

}