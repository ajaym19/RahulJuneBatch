package com.w2a.basics;

public class StringsDemo {

	/*
	 * String
	 * is a class
	 * Non Primitive Data Type
	 * 
	 * Rules:
	 * 1. String class is a final class
	 * 2. String Objects are immutable
	 * 
	 * Declared in 2 ways
	 * 1. String Literal (new keyword is not used)
	 * 		a. Objects are created inside SCP
	 * 		b. Before creating an object, it will check if an object with the same value is present or no
	 * 		if Present, it will not create an object and will point to the existing object
	 * 		if not Present, it will create a new object
	 * 
	 * 2. New Keyword
	 * 		a. Objects will be created in Heap Memory
	 * 		b. every time a new object will be created
	 * 
	 * 
	 */
	public static void main(String[] args) {
		String name  = "Ajay";
		System.out.println(name); //Ajay
		name = name.concat("Trainer");
		System.out.println(name); //AjayTrainer
		
		String a = new String("Hello");
		
		//we need some mutable representations of String
		System.out.println("Learning String Builder");
		StringBuilder builder = new StringBuilder("Ajay Mumbai India");
		System.out.println(builder);
		builder.append("Trainer");
		System.out.println(builder); //Ajay Trainer
		System.out.println(builder.charAt(2));
		System.out.println(builder.length());
		System.out.println(builder.equals(name));
		System.out.println(builder.reverse());
		
		//HW: reverse a string without using in built method
		
		StringBuffer bf = new  StringBuffer("Java");
		
		
		
	}
}
