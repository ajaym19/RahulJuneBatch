package com.w2a.basics;

public class DataTypeDemo {

	/*
	 * Data Types:
	 * 1. Primitive:
	 * 	Integer: byte, short, int, long
	 * 	Decimal: float, double
	 *  char: char
	 *  true/false: boolean
	 *  
	 * 2. Non Primitive : classes, interfaces, string, array
	 * 
	 * For each primitive data type there is a corresponding wrapper class
	 * 
	 */
	
	public static void main(String[] args) {
		
		int id = 4;
		short id1 = 45;
		System.out.println(id);
		byte b1 = 12;
		short s1 = 1293;
		System.out.println(b1);
		
		float f1 = 45.55f;
		double d1 = 65.56574575;
		System.out.println(f1);
		System.out.println(d1);
		
		
		char c3 = 'A';
		System.out.println(c3);
		
		String name = "Ajay";
		System.out.println(name);
		
		System.out.println();
		
		System.out.println(name); //Ajay
		System.out.println("name"); //name
		System.out.println("name2"); //
		
		
		//yes or no can be stored in boolean
		//boolean isPresent = False; //error
		//boolean isPresent = True; //error
		//boolean isPresent = false; //false
		//boolean isPresent = true; //no error
		//boolean isPresent = 1; // error 
		//boolean isPresent = 0; //error
		
	}
}
