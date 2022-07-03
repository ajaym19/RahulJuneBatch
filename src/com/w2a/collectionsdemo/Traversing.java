package com.w2a.collectionsdemo;

import java.util.ArrayList;
import java.util.Iterator;

public class Traversing {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println(list);

		// Adding

		list.add(10);
		list.add(11);
		list.add(14);
		list.add(12);
		System.out.println(list);
		
		System.out.println("Printing using for loop");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
			
		}
		
		System.out.println("Using for each loop");
		for (Integer abc : list) {
			System.out.println(abc);
		}
		
		System.out.println("Iterator");
		Iterator<Integer> it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
			
		}
		
		
		//HW: print using lambda function
		
		
		
		
	}
}
