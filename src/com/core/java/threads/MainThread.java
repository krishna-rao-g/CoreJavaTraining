package com.corejava.threads;

public class MainThread {

	//Java it self have a main thread 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t = Thread.currentThread();
        System.out.println("Current Thread :" + t);
        method1();
        try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        System.out.println("Completed");
        //starting thread inside a main thread
        // it has a seperate stack and memory
        // Main thread always started by java
	}

	private static void method1() {
		int a =1;
		System.out.println(" Method1");
		method2();
	}

	private static void method2() {
		int a =2;
		System.out.println(" Method2");
		
	}
}

//Thread -
//will have its own memory // it stores its objec in heap
// stack [main, method1, method2]
