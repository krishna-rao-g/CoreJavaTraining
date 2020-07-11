package com.core.java.basicoverview;

// encapsulation
public abstract class EmployeeInheritence {

	public String employeId;

	private final String salary;

	public EmployeeInheritence(String salary) {
		this.salary = salary;
	}
	
	public EmployeeInheritence() {
		this.salary = null;
	}

	public String getSalary() {
		return this.salary;
	}
	
    abstract void calSal();

}

class Manager extends EmployeeInheritence {
	public Manager() {

	}

	private int incentives;

	public void setIncentives(int incentives) {
		// 
		if(incentives < 0) {
			throw new RuntimeException();
		}
       this.incentives = incentives;
	}

	public int getIncentives() {
		
		return incentives;
	}

	@Override
	void calSal() {
		// TODO Auto-generated method stub
		
	}

}

class Janitor extends EmployeeInheritence {
	public Janitor() {

	}

	@Override
	void calSal() {
		// TODO Auto-generated method stub
		
	}

}

class Driver extends EmployeeInheritence {

	@Override
	void calSal() {
		// TODO Auto-generated method stub
		
	}

}
