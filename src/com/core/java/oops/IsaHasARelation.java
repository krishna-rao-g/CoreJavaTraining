package com.core.java.oops;

import java.util.List;

public class IsaHasARelation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}


//Has a relation


// Car has tyres, steering

class Car {
	List<Tyre> tyre;
	Steering steering;
	
	Car(List<Tyre> tyre, Steering steering){
		this.tyre = tyre;
		this.steering = steering;
	}
	
}

class Tyre {
	int numberOfWheels;
}

class Steering{
	String typeOfSterring;
	int engineType;
}

//IS - A relation -- Inheritence 
//Dog is an animal 
class Animal {
	 
	void barking() {
		
	}
}

class Dog extends Animal{
	
}


class Student {
	List<Instructor> instructors;
}


class Instructor {
	List<Student> students;
}





