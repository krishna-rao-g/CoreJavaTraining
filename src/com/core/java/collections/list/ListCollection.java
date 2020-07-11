package com.core.java.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

/*
 * ArrayList -> AbstractList -> AbstractCollection --->[Collection] --> [Iterbale]
 * LinkedList -> AbstractSequenceList -> AbstractList -> ABstractCollection --->[Collection] --> [Iterbale]
 * 
 * 
 * 
 */

public class ListCollection {

	public static void main(String[] args) {

		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("Hello");
		arrayList.add("World");
		// arrayList.add(0, "Welcome ");
		arrayList.set(1, "Hello1");
		// ["Hello","World"];
        // Sort arraylist
		Collections.sort(arrayList);
		System.out.println("Java provided : " + arrayList);

		ArrayListC<String> customArrayList = new ArrayListC<String>();
		customArrayList.add("Hello");
		customArrayList.add("World");
		customArrayList.set(1, "Hello1");

		System.out.println("Custom array List: " + customArrayList);

		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("Hello");
		linkedList.add("world");
		linkedList.add("welcome");
		// hello -> world -> welcome
		System.out.println("Java LinkedList: " + linkedList);

		LinkedListC<String> linkedListC = new LinkedListC<String>();
		linkedListC.add("Hello");
		linkedListC.add("world");
		linkedListC.add("welcome");
		// hello -> world -> welcome
		System.out.println("custom Java LinkedList: " + linkedListC);

	}

}

// when to use linked List 
// adding is fast, removing is also first, searching is slow
class LinkedListC<E> {
	int size;
	Node<E> first;
	Node<E> last;

	LinkedListC() {
		size = 0;
		first = null; // head engine, only once the element added here
		last = null; // tail always new element is added here
	}

	public void add(E data) {
		Node<E> next = new Node<E>(data);
		if (first == null) {
			first = next;
			first.next = null; // no coaches attached to it
			last = first;
		} else {
			last.next = next; // attach it to caoch
			last.next.next = null;
			last = next;
		}
		size++;
	}

	public E get(int index) {
		Node<E> referce = first;
		int counter = 0;
		while (referce.next != null) {
			if (counter == index) {
				return referce.data;
			} else {
				referce = referce.next;
			}
		}
		return null;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		Node<E> referce = first;
		sb.append("[");
		while (referce!= null) {
			sb.append(referce.data);
			sb.append(", ");
			referce = referce.next;
		}
		sb.append("]");
		return sb.toString();
	}

	public int getSize() {
		return size;
	}

}

class Node<E> {
	E data;
	Node<E> next;

	Node(E data) {
		this.data = data;
		this.next = null;
	}
}

// when to use arraylist
// resizing of array, remove element in array are costly operation -> if you are having mostly add operation and
// search operations in this case arraylist is fastest collection
class ArrayListC<E> {
	private int size = 0;
	private Object[] values;
	private final int DEFAULT_SIZE = 10; // if 11 th element comes it grows to 20 and copy all 10 to current one
	private int userSize = 0;

	ArrayListC() {
		values = new Object[DEFAULT_SIZE];
	}

	ArrayListC(int initialSize) {
		this.userSize = initialSize;
		values = new Object[initialSize];
	}

	public void add(E data) {
		// if size === userSize then grow
		grow();
		values[size++] = data;
	}

	public void set(int index, E data) {
		values[index] = data;
	}

	public void grow() {
		// if creates new array with 2* userSize
		// copy all old to new
	}

	public E get(int index) {
		return (E) values[index];
	}

	public int size() {
		return this.size;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for (int i = 0; i < size; i++) {
			sb.append(values[i]);
			if (i < size - 1)
				sb.append(", ");
		}
		sb.append("]");
		return sb.toString();
	}
}
