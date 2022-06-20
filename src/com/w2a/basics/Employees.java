package com.w2a.basics;

public class Employees {

	/*
	 * Constructor it is used to initialize the variables
	 * 
	 * 2 types: 1. Non Parametrised 2. Parametrised
	 * 
	 * Rules: 1. Constructor is of same name as class name 2. it cannot have return
	 * type 3. If user does not define a constructor, there is a default in built
	 * constructor which is called
	 * 
	 */

	int empId;
	String empName;
	long mobileNo;

	//at this point ? empId
	
	
	public Employees(int empId, String empName) {
		
		//at this point empId? 
		
		this.empId = empId;
		this.empName = empName;
	}

	
	
	// No Parameter constructor
//	public Employees() {
//		System.out.println("I am in Constructor");
//	}

//	public Employees(int id, String name) {
//		empId = id;
//		empName = name;
//	}
//	
//	public Employees(int id, String name, long number) {
//		empId = id;
//		empName = name;
//		mobileNo = number;
//	}
//	
	
	
	

	public String getEmpName() {
		return empName;
	}

	public void showEmpDetails() {
		System.out.println("Name is "+empName + " Id is " + empId + " Mobile No is "+mobileNo);
	}

	public int showId() {
		return empId;

	}
	
	/*
	 * Naming Conventions
	 * 
	 * Package: com.companyname.modulename
	 * Class: Employee, Students
	 * Methods and Variables: Camel case, studentId, empNativeAddress, printName, getName;
	 * 
	 */
}
