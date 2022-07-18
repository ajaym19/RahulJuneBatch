package com.w2a.collectionsdemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo {

	/*
	 * ArrayList:
	 * is a class implementing List Interface
	 * used to store multiple elements of similar data type
	 * internally it uses the concept of Array
	 * but the size is dynamic
	 * 
	 * Rules:
	 * 1. Insertion Order is maintained
	 * 2. No Sorting is applied
	 * 3. Duplicate values are allowed
	 * 4. Null Values are allowed
	 * 5. Values are stored in sequential memory location
	 */
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println(list);
		
		//Adding
		
		list.add(10);
		list.add(11);
		list.add(14);
		list.add(12);
		list.add(null);
		System.out.println(list);
		System.out.println("The value at First Index is " +list.get(1));
		list.add(0, 44);
		System.out.println(list);
		
		//Fetching
		System.out.println("The value at First Index is " +list.get(1));
		
		//Removing
		System.out.println("Original List "+list);
		list.remove(2);
		System.out.println("After Removing value at Index 2, new List "+list);
		
		//Updating(index, value)
		list.set(0, 54);
		System.out.println(list);
		
		//Extra Methods
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(101);
		list1.add(102);
		list1.add(103);
		//add all the elements of new list to original list
		//using for loop - HW
		
		//using method
		System.out.println("Existing List: "+list);
		list.addAll(2, list1);
		System.out.println("After adding all: "+list);
		
		list.removeAll(list1);
		System.out.println(list);
		System.out.println(list.isEmpty());
		//list.clear();
		System.out.println(list);
		System.out.println(list.isEmpty());
		
		System.out.println(list.contains(54));
		System.out.println(list.indexOf(120));
		System.out.println(list.lastIndexOf(12));
		System.out.println("Size of the list is: "+list.size());
		
		/*
		 * HW: Convert an arraylist to array
		 * convert an array to arraylist
		 * 
		 */
		
		//list.get(23);
		
		ArrayList<String> fruits = new ArrayList<>();
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Mango");
		System.out.println(fruits);
		
		//for loop, for each
		
		for (String fruit : fruits) {
			System.out.println(fruit);
		}
		
		
		
		/*
		 * HW:
		 * Remove all the duplicates from the Set
		 * IP: [23,34,23,12,23]
		 * OP: [23,34,12]
		 */
		
		
	}
}
