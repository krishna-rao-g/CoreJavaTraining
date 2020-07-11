package com.core.java.oops;

/*
 class classname {
	type instance-variable1;
	type instance-variable2;..
	type instance-variableN;

	type methodName1(parameter-list) {
		
	}

    type methodName1(parameter-list) {
		
	}
    .
    .
    type methodNameN(parameter-list) {
		
	}
} */
public class BoxOverrloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box box = new Box(100, 200, 300);
		System.out.println(box.volume());
		// garbage collection
	}

}

class Box {

	private double width;
	private double height;
	private double depth;

	Box(double width, double height, double depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
	}

	public double volume() {
		return width * height * depth;
	}

	// overlaoading
	public double volume(double depth) {
		return width * height * depth;
	}

	// overlaoading
	public int volume(int depth) {
		return -1;
	}

	// overlaoading
	public int volume(long depth) {
		return -1;
	}

	// overlaoading
	public double volume(double height, double depth) {
		return width * height * depth;
	}

	// overlaoading
	public double volume(double width, double height, double depth) {
		return width * height * depth;
	}

	public double getWidth() {
		return width;
	}

	public double getHeight() {
		return height;
	}

	public double getDepth() {
		return depth;
	}

}
