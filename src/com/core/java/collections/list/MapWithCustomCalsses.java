package com.core.java.collections.list;

public class MapWithCustomCalsses {

	public static void main(String[] args) {
       // why hash map, we will see custom impelmentations, and we will see how to put custom objects in map
	   // hashcode and equals
	}

}

class HashMap1<K, V> {
	int size;
	int defaultSize = 10;
	Node1<K, V>[] mapArray;

	@SuppressWarnings("unchecked")
	HashMap1() {
		mapArray = (Node1<K, V>[]) new Node1[defaultSize];
	}
	
	@SuppressWarnings("unchecked")
	HashMap1(int loadSize) {
		mapArray = (Node1<K, V>[]) new Node1[loadSize];
	}
	
	public void put(K key, V value) {
		
	}
	
	public V get(K key) {
		return null;
	}
}

class Node1<K, V> {
	K key;
	V value;
}