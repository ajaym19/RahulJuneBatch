package com.w2a.collectionsdemo;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	/*
	 * HashMap:
	 * It is not a part of Collection Framework
	 * 
	 * HashMap is a class
	 * implementing Map Interface
	 * 
	 * elements are stored in the form of key and value pair
	 * a key and value together is called as pair/bucket/entry
	 * multiple entries together is called as EntrySet
	 * 
	 * Rules:
	 * 1. Elements are sorted based on the key(ascending Order)
	 * 2. Duplicate values are allowed
	 * 3. Duplicate key is not allowed, if you try to add, it will work as an update
	 * 4. Multiple null values are allowed
	 * 5. Only one null value is allowed as a Key
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		//HashMap<Key, Value>;
		HashMap<Integer, String> map = new HashMap<>();
		map.put(3, "Mango");
		map.put(1, "Apple");
		map.put(2, "Orange");
		System.out.println(map);
		
		System.out.println(map.get(2));
		map.remove(2);
		System.out.println(map);
		
		//tricks
		map.put(4, "Apple");
		map.put(5, null);
		map.put(6, null);
		System.out.println(map);
		map.put(3, "Grapes");
		map.put(null, "Ajay");
		map.put(null, "Smita");
		System.out.println(map);
		
		//Extra Methods
		
		System.out.println(map.isEmpty());
		//map.clear();
		System.out.println(map);
		System.out.println(map.isEmpty());
		System.out.println("Checking if Key is Present "+map.containsKey(113));
		System.out.println("Cheking Value "+map.containsValue("Apple"));
		System.out.println("Size is "+map.size());
		
		//add element if possible but don't update if present already
		System.out.println(map);
		//map.put(3, "Orange");
		map.putIfAbsent(7, "Orange");
		System.out.println(map);
		Set<Integer> keys = map.keySet(); //return all the keys
		for (Integer key : keys) {
			System.out.println(key);
		}
		
		//map.entrySet();
		for(Entry<Integer, String> abc: map.entrySet() ) {
			//abc contains ?? key and value both
			System.out.println("Key is: "+abc.getKey() +" Value is: "+abc.getValue());
			//System.out.println(abc.getValue());
		}
		
	}
}
