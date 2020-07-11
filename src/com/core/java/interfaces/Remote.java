package com.core.java.interfaces;

/*

access interface name {

     type final-varname1 = value;
     type final-varname2 = value;

     return-type  method-name1(parameter-list);
     return-type  method-name2(parameter-list);
     
     static return-type methodname3(parameter-list){
       // implementation
     }
}

 */

public interface Remote {
	final int OFF = 0;
	final int ON = 1;
	
	void startDevice(int param);

}
