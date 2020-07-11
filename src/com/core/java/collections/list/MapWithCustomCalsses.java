package com.core.java.collections.list;

import java.util.HashMap;

public class MapWithCustomCalsses extends Object {

	public static void main(String[] args) {
		// customImplementation();

		HashMap<Employee, String> results = new HashMap<Employee, String>();
		populateMap(results);
		businessLogic(results);
	}

	private static void businessLogic(HashMap<Employee, String> results) {
		Employee employee = new Employee(123, "Hritesh");
		System.out
				.println("Hashcode : " + employee.hashCode() + " Key:" + employee + " Value:" + results.get(employee));
	}

	private static void populateMap(HashMap<Employee, String> results) {
		Employee employee = new Employee(123, "Hritesh");
		results.put(employee, "A+");
		System.out
				.println("hashcode : " + employee.hashCode() + " key :" + employee + " Value:" + results.get(employee));

		Employee employee1 = new Employee(124, "Lokesh");
		results.put(employee1, "B");
		System.out.println(
				"hashcode : " + employee1.hashCode() + " key:" + employee1 + " Value:" + results.get(employee1));
	}

	private static void customImplementation() {
		// why hash map, we will see custom impelmentations, and we will see how to put
		// custom objects in map
		// hashcode and equals

		HashMap1<String, String> customMap = new HashMap1<String, String>();
		// put
		customMap.put("1", "Rajesh");
		customMap.put("2", "Ramesh");
		customMap.put("3", "Rajesh");
		customMap.put("14", "Pankaj");
		customMap.put("12", "Ramesh1");

		// get
		System.out.println(customMap.get("1"));
		System.out.println(customMap.get("2")); // --> also resolves to 2 because 2%10 is 2
		System.out.println(customMap.get("3"));
		System.out.println(customMap.get("14"));
		System.out.println(customMap.get("12")); // --> also resolves to 2 because 12%10 is 2

		// 2 -> Ramesh , 12 -> Ramesh1
		// 2 == 12 NO, 12 == 12 yes
	}

}

// Hashmap is faster and it has complexity of O(1) , 2million
// int x = new int[10], in array access is index based 1,2,0,9 (10) -> index out of bond
// key, value 
// key 
// I need to reach to value [array]
// hashing mechanism key%size    size - 10 , 2%10 = 2 , 2%10 = 2 , 12%10 = 2
// custom class how do we take the index (hashCode , equals)
class HashMap1<K, V> {
	int size;
	int defaultSize = 10;
	int currentCount = 0;
	Node1<K, V>[] mapArray;

	@SuppressWarnings("unchecked")
	HashMap1() {
		mapArray = (Node1<K, V>[]) new Node1[defaultSize];
		size = defaultSize;
	}

	@SuppressWarnings("unchecked")
	HashMap1(int loadSize) {
		mapArray = (Node1<K, V>[]) new Node1[loadSize];
	}

	public void put(K key, V value) {
		Integer hashKey = Integer.parseInt((String) key);
		// retrieve index
		int arrayIndex = getComputedHashCode(hashKey.intValue());
		mapArray[arrayIndex] = new Node1(key, value);
	}

	public V get(K key) {
		Integer hashKey = Integer.parseInt((String) key);
		// retrieve index
		int arrayIndex = getComputedHashCode(hashKey.intValue());
		return mapArray[arrayIndex].getValue();
	}

	// modulo on key
	public int getComputedHashCode(int key) {
		return key % size;
	}
}

class Node1<K, V> {
	K key;
	V value;

	Node1<K, V> next;

	Node1(K key, V value) {
		this.key = key;
		this.value = value;
	}

	V getValue() {
		return this.value;
	}

	K getKey() {
		return this.key;
	}
}

class Employee {
	int employeId;
	String employeeName;

	public int getEmployeId() {
		return employeId;
	}

	public void setEmployeId(int employeId) {
		this.employeId = employeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	Employee(int employeId, String employeeName) {
		this.employeId = employeId;
		this.employeeName = employeeName;
	}

	@Override
	public String toString() {
		return "Employee Id : " + employeId + " employeeName is :" + employeeName;
	}

	@Override
	public int hashCode() {
		return this.employeId;
	}

	@Override
	public boolean equals(Object o) {
		Employee that = (Employee) o;
		if (that.getEmployeeName().equals(this.getEmployeeName()) && that.getEmployeId() == this.employeId)
			return true;
		return false;
	}
}
