package com.core.java.interfaces;

public class TvRemote implements Remote{

	@Override
	public void startDevice(int param) {
		System.out.println("Callback implemented and inherited values :" + ON);
		
	}

	public void print() {
		System.out.println("print");
	}

}
