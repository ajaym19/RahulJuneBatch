package com.w2a.basics;

public class VariableTypes {

	/*
	 * Variables:
	 * 1. Global: declared inside a class, outside a method
	 * 		a. Instance: global variable with no static keyword
	 * 		b. Static: global variable with static keyword
	 * 2. Local: declared inside a class, inside a method
	 */
	
	int stdId;
	String stdName;
	static String schoolName;
	
	public void addition() {
		int a=3;
		System.out.println(a);
		
	}
	
	public static void printNotes() {
		System.out.println("Printing the notes for Notice Board");
	}
	
	public void printStudentName() {
		int a=5;
		System.out.println(a);
		System.out.println(stdName);
		//schoolName
		System.out.println(schoolName);
	}
	
	public static void printSchoolName() {
		System.out.println(schoolName);
		//stdName
//		System.out.println(stdName); Not possible
		printNotes();
		
	}
	public void method1() {
		printStudentName();
		printSchoolName();
	}
	
	
}


