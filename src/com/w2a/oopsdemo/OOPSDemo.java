package com.w2a.oopsdemo;

public class OOPSDemo {

	/*
	 * OOPS:
	 * its a paradigm or concept of various principles
	 * any language which follows these principles is called as OOPL
	 * we can inherit methods from parent
	 * and we can create our own child specific methods
	 * 
	 * 4 pillars:
	 * 1. Inheritance
	 * 2. Polymorphism
	 * 3. Abstraction
	 * 4. Encapsulation
	 * 
	 * Object is the parent of all class by default
	 * 
	 * 
	 * 1. Inheritance: we use extend keyword to define the relationship
	 * 
	 * Parent Class:
	 * 
	 * takeLunchBreak(){
	 * 10 LOC
	 * }
	 * 
	 * markattendance(){
	 * }
	 * 
	 * make all the classes who want to use these methods as Child Class
	 * 
	 * 
	 * 
	 * School: Project
	 * 
	 * Students:
	 * 
	 * 
	 * 
	 * Teachers
	 * takeLunchBreak(){
	 * 10 LOC
	 * }
	 * 
	 * markattendance(){
	 * }
	 * 
	 * 
	 * Staff
	 * takeLunchBreak(){
	 * 10 LOC
	 * }
	 * 
	 * markattendance(){
	 * 
	 * }
	 * 
	 * 
	 * Polymoprhism:
	 * poly = many
	 * morph = form
	 * 
	 * 2 types:
	 * Compile Time/Static : can be achieved by Method Overloading
	 * Run Time/ Dynamic : can be achieved by Method Overriding
	 * 
	 * 
	 */
	
	
	public static void main(String[] args) {
		BaseDemo obj = new BaseDemo();
		obj.lunchTime();
		
		Students std = new Students();
		std.lunchTime();
		
		Teachers t = new Teachers();
		t.lunchTime();
		
		std.takeExams();
		//t.takeExams();
		
		t.lunchTime();
		std.lunchTime();
		
		Staff stf = new Staff();
		System.out.println("Learning which method to call");
		obj.lunchTime();
		t.lunchTime();
		stf.lunchTime();
		t.equals("Hi");
		t.m1();
	}
	
	
	
	
	
}
