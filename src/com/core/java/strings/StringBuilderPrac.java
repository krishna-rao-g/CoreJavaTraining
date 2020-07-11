package com.core.java.strings;

public class StringBuilderPrac {
	static StringBuilder sb = new StringBuilder("Hello"); 
	 StringBuffer sb1 = new StringBuffer("Hello"); // singleton using project
	
	
	public static void main(String[] args) {
		// not a costly operation
		
		performingOperation("world");
        //Synchronized
        /*
        ATM 
        Jointaccount 
        A , B
        A went to ATM and he has seen balance 1000;
        B went to ATM and he has seen balance as 1000 ;
        account will go to negative -1000;
        
        semaphore - 1/0 and monitor
        */

		StringBuilderPrac.performingOperation("value");
		StringBuilderPrac.performingOperation("value1");
		StringBuilderPrac.performingOperation("value2");
		
	}

	private static void performingOperation( String appendParam) {
		
		sb.append(appendParam);
        System.out.println(sb.toString());
        System.out.println(sb.reverse());
	}
	
	// At a time only one thread can access it
	public synchronized void deductAmount() {
			///
			///
	}
	
	public  void deductAmount1() {
		// At a time only one thread can go into this synchronized block
		synchronized(Object.class){
			///
			///
		}
		////
	}

}
