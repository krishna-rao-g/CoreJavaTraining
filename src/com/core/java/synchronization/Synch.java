package com.corejava.synchronization;

public class Synch {

	public static void main(String[] args) {
         Callme target = new Callme();
         Caller ob1 = new Caller(target, "Hello");
         Caller ob2 = new Caller(target, "Synchronized");
         Caller ob3 = new Caller(target, "World");
         
         try{
        	 ob1.t.join();
        	 ob2.t.join();
        	 ob3.t.join();
         } catch (InterruptedException e){
        	 e.printStackTrace();
        	 System.out.println("Interupted");
         }
	}

}

class Callme {
	synchronized void call(String msg) {
		System.out.print("[" + msg);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("]");
	}
}

class Caller implements Runnable {
	String msg;
	Callme target;
	Thread t;

	Caller(Callme target, String msg) {
		this.target = target;
		this.msg = msg;
		t = new Thread(this);
		t.start();
	}

	@Override
	public void run() {
		//synchronized(target){
			target.call(msg);
		//}
	}

}