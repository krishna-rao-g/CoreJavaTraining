package com.corejava.threads;

public class ImplThread {

	public static void main(String[] args) {
        System.out.println("Main thread start");
        Runnable runnable =  new NewThreadImpl(); // step1 create object for runnable
        Thread newThread = new Thread(runnable);  // step2 create object fro the Thread class
        newThread.start(); // It did not wait for this method to complete 
        try {
			newThread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        System.out.println("Main thread ending");
       
	}
	public static void method1() {
		int a =1;
		method2();
	}

	public static void method2() {
		int a =2;
	}
}

class NewThreadImpl implements Runnable {
	
	public void run(){
		Thread t = Thread.currentThread();
        t.setName("Custom NewThread");
        System.out.println("NewThread name :" + t);
        ImplThread.method1();
        System.out.println("Custom thread ended");
	}
}