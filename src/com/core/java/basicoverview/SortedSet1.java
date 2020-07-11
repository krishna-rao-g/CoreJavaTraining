package com.core.java.basicoverview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class SortedSet1 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = Integer.parseInt(sc.nextLine());
        List<Integer> set = new ArrayList<>();
        Stack stack = new Stack();
        for(int i=0; i<count; i++){
            String[] command = sc.nextLine().trim().split(" ");  
            if(command[0].trim().equals("1")){
                  stack.push(command[1]);
                  set.add(Integer.parseInt(command[1].trim()));
            }else if(command[0].trim().equals("2")){
            	int element = Integer.parseInt((String)stack.pop());
                  set.remove(set.indexOf(element));      
            }else {
            	Collections.sort(set);
            	int value = set.get(set.size()-1);
                System.out.println(value);
            }
        }
    }
	
	int getMax(List<Integer> set) {
		return set.stream().mapToInt(v -> v).max().getAsInt();
	}

}
