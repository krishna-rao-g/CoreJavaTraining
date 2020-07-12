package com.corejava.threads;

public class ExtendingThread {

	public static void main(String[] args) {
		Thread t = Thread.currentThread();
        System.out.println("Current Thread :" + t);
        
		NewThread newThread = new NewThread(); // You will directly create object for the custom class
		newThread.start(); // start will start a new thread apart from main thread
		try {
			newThread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//newThread.run(); // It uses the current main thread
		
		System.out.println("Current Thread :" + t);
	}
	
	public static void method1() {
		int a =1;
		method2();
	}

	public static void method2() {
		int a =2;
		
	}

}

class NewThread extends Thread {
	
	public void run(){
		Thread t = Thread.currentThread();
        t.setName("Custom NewThread");
        System.out.println("NewThread name :" + t);
		ExtendingThread.method1();
	}
}
