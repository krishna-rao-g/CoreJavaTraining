package com.core.java.oops;

public class StackImplementation {

	public static void main(String[] args) {
		// use case int values
		// 1. last in first out 1,2,3.. n during retrieval it should give 3,2,1..n
		// 2. I should be able do push operations
		// 3. I should be having pop operation which removes element
		// peek what is top element but you dont want to remove it. - good have
		// it should be a generic class any one can use it.
		
		//Exercise 
		//queue operation (first in first out)
		// you should be able add values 1,2,3,4
		//consumes the first value
		
		Stack stack = new Stack(10);
		for (int i = 0; i < 11; i++) {
			stack.push(i);
		}

		for (int i = 0; i < 11; i++) {
			System.out.println(stack.pop());
		}
		
		final int a1 = 1;
		//a1 = 3;

	}

}

class Stack {
	int stck[];
	int tos;

	Stack(int n) {
		stck = new int[n];
		tos = -1;
	}

	void push(int item) {
		if (tos == stck.length - 1) {
			System.out.println("Stack is full for " + tos);
			return;
		}
		stck[++tos] = item;
	}

	int pop() {
		if(tos<0)
			System.out.println("Stack underflow below " + tos);
		return stck[tos--];

	}

}