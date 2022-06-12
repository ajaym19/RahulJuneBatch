package com.w2a.basics;

public class App {

	public static void main(String[] args) {
		//create an Object
		//new is a keyword responsible to create an object
		Students std1 = new Students();
		std1.name = "Smita";
		std1.rollNo = 1;
		System.out.println("Student Name is " + std1.name);
		System.out.println(std1.rollNo);
		std1.schoolname = "IIT";
		std1.doStudy();
		
		
		Students std2 = new Students();
		std2.name = "Vinay";
		System.out.println(std2.name);
		std2.schoolname = "IIT";
		System.out.println(std1.schoolname);
		System.out.println(std2.schoolname);
		
		VariableTypes obj1 = new VariableTypes();
		System.out.println(obj1.stdName); //null
		System.out.println(obj1.schoolName); //null
		obj1.stdName = "Smita";
		obj1.schoolName = "IIM";
		System.out.println(obj1.stdName); //Smita
		System.out.println(obj1.schoolName); //IIM
		
		VariableTypes obj2 = new VariableTypes();
		System.out.println(obj2.stdName); //null
		System.out.println(obj2.schoolName); //IIM
		obj2.schoolName = "ABC";
		System.out.println(obj1.schoolName); //ABC
		System.out.println(obj2.schoolName); //ABC
		
		VariableTypes.printNotes();
		System.out.println(VariableTypes.schoolName);
		
	}
}
