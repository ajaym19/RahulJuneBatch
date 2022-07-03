package com.w2a.collectionsdemo;

import java.util.HashSet;

public class HashSetDemo {

	/*
	 * HashSet
	 * is a class
	 * Implementing Set Interface
	 * internal implementation used is hashing
	 * majorly used in search related operation
	 * 
	 * Rules:
	 * 1. Insertion Order is not maintained
	 * 2. Elements are stored in random order
	 * 3. Indexing is not maintained
	 * 4. Removing an element works by the value and not by index
	 * 5. Duplicates are not allowed
	 */
	public static void main(String[] args) {
		
		HashSet<Integer> set = new HashSet<>();
		set.add(12);
		set.add(56);
		set.add(49);
		set.add(83);
		set.add(2);
		set.add(83);
		
		System.out.println(set);
		
		
		//remove: it works by value, not by index
		set.remove(220);
		System.out.println(set);
		
		/*
		 * HW:
		 * Remove all the duplicates from the Set
		 * IP: [23,34,23,12,23]
		 * OP: [23,34,12]
		 */
		
		
	}
}
