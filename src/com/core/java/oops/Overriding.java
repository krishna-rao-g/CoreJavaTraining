package com.core.java.oops;

// default -access is for current package
// public - access this can be seen from any package
// private - access this can bve accesible form same class
// protected - access is give to its childeren only

public class Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       A a = new A(3,4);
       a.show();
       
       B b = new B(3,4,5);
       b.show();

}
	
}

class A {
	int i, j;

	A(int a, int b) {
		i = a;
		j = b;
	}
	
	A(){
		
	}
	// polymorphiosm - similar thing working in different ways.
	public void show() {
		System.out.println("i and j:" + i + " " + j);
	}
	
}

class B extends A {
	int k;
	
	B(int a, int b, int c){
		super(a, b);
		k = c;
	}
	
	@Override
	public void show() {
		System.out.println("k : " + k);
	}

}
