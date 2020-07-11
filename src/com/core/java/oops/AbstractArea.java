package com.core.java.oops;

public class AbstractArea extends Object{

	public static void main(String[] args) {
		//Figure f = new Figure(2,3 );
		
		Rectangle r = new Rectangle(2,4);
		System.out.println(r);
		System.out.println(r.area());
		
		Triangle t = new Triangle(3, 4);
		t.area();

		System.out.println(t);
		System.out.println(t.area());
	}

}

abstract class Figure{
	double dim1;
	double dim2;
	
	Figure(double dim1, double dim2){
		this.dim1 = dim1;
		this.dim2 = dim2;
		System.out.println("Figure");
	}
	
	abstract double area();
}

class Rectangle extends Figure{
	Rectangle(double a, double b){
		super(a, b);
		System.out.println("Rectangle");
	}

	@Override
	double area() {
		return dim1*dim2;
	}
	
	@Override
	public String toString() {
		return "dim1: " + dim1 + " dim2: " + dim2;
	}
}

class Triangle extends Figure{
	Triangle(double a, double b){
		super(a, b);
		System.out.println("Triangle");
	}

	@Override
	double area() {
		return dim1*dim2/2;
	}
	
	@Override
	public String toString() {
		return "dim1: " + dim1 + " dim2: " + dim2;
	}
}