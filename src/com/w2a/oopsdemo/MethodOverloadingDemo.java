package com.w2a.oopsdemo;

public class MethodOverloadingDemo {
	
	/*
	 * Method Overloading:
	 * you can have methods with same name in the same class
	 * but with different signature
	 * 
	 * Signature and Implementation
	 * 
	 * Can be achieved in 2 ways:
	 * 1. By changing the no. of parameters
	 * 2. By changing the data type of parameters
	 * 
	 * Note: By changing the return type its not possible
	 * 
	 */

	public void add(int a, int b) {
		System.out.println("Adding 2 int numbers");
	}
	
	public void add(int a, int b, int c) {
		System.out.println("Adding 2 int numbers");
	}
	
	public void add(float a, float b, float c) {
		System.out.println("Adding 2 float numbers");
	}
	
	
	
	public static void main(String[] args) {
		MethodOverloadingDemo obj = new MethodOverloadingDemo();
		obj.add(10, 20);
		obj.add(10.5f, 1, 2);
	}

	
	

}
