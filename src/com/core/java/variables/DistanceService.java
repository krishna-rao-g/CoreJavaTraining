package com.core.java.variables;

public class DistanceService {

	public static void main(String[] args) {
		// variables from db and building light object
		Light light = new Light(186000, 1000, 1000 * 24 * 60 * 60);
		caclEngine(light);
	}

	public static void caclEngine(Light light) {
		System.out.println(light.calDistance());
	}
}
