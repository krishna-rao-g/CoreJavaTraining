package com.core.java.generics;

public class Generic {

	public static void main(String[] args) {
		Gen<String, Integer> gen = new Gen<String, Integer>("Ravi", 124);
		gen.show();
		String x2 = gen.getN();

		Gen<Integer, String> gen1 = new Gen<Integer, String>(456, "Rakesh");
		gen1.show();
		
		GenObject genObject = new GenObject("hello");
		genObject.show();
		
		
		String x1 = (String)genObject.getO1();
	}

}


class GenObject {
	Object o1;
	
	GenObject(Object o1){
		this.o1= o1;
	}
	
	Object getO1() {
		return 01;
	}
	
	void show() {
		System.out.println(o1.getClass().getName());
	}
}

class Gen<T, V> {
	T n;
	V n2;

	Gen(T obj, V obj2) {
		n = obj;
		n2 = obj2;
	}

	T getN() {
		return this.n;
	}

	V getV() {
		return this.n2;
	}

	void show() {
		System.out.println(n.getClass().getName());
		System.out.println(n2.getClass().getName());
	}
}