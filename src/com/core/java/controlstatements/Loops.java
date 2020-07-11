package com.core.java.controlstatements;

public class Loops {

	public static void main(String[] args) {
		//whileLogic();
		//doWhileLogic();
		
		forloop();

	}
	
	public static void forloop() {
		int numArray[] = {1,2,3,999,-1,4,-1};
		int sum =0;
		
		for(int i=0;i<numArray.length;i++) {
			if(numArray[i] == -1)
				continue;
			
			if(numArray[i] == 999)
				break;
			sum+=numArray[i];
		}
		
		System.out.println(sum);
		
		sum = 0;
		
		// foreach loop
		for(int x: numArray) {
			if(x == -1)
				continue;
			
			if(x == 999)
				break;
			sum+=x;
		}
		
		System.out.println(sum);
	}
	
	public void whileLogic() {
		// list,map length
				int lengthOfArray= 10;
				
				while(lengthOfArray>0) {
					System.out.println("tick " + lengthOfArray);
					lengthOfArray--;
				}
	}
	
	public static void doWhileLogic() {
		// list,map length
				int lengthOfArray= -1;
				
				do {
					System.out.println("tick " + lengthOfArray);
					lengthOfArray--;
				} while (lengthOfArray >0);
	}

}
