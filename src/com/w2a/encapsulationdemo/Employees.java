package com.w2a.encapsulationdemo;

public class Employees {

	// properties
	/*
	 * Encapsulation: capsule: mixing of 2 medicines inside a single container wrap
	 * the data and code
	 * 
	 * we apply access modifier to our variables
	 * 
	 * known as Getters and Setters
	 * 
	 * HW
	 * Access Modifiers: 
	 * 1. Private: can be accessed only within the class 
	 * 2. Protected: can be accessed only within the package + outside the package only by child class 
	 * 3. Default: can be accessed only within the package 
	 * 4. Public: can be accessed within the project
	 */

	private int empId; // r - yes, w - no
	private String empName; // r - yes, w - no
	private static final String companyName = "Infosys";
	private long mobileNo; // r -yes, u - yes
	private String address;
	private int age;
	private char gender;
	private float salary;

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		// apply my checks
		if (gender == 'M' || gender == 'F' || gender == 'O') {
			this.gender = gender;
		} else {
			System.out.println("Please provide valid gender value");
		}
	}

	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getEmpId() {
		return empId;
	}

	public String getEmpName() {
		return empName;
	}

	public static String getCompanyName() {
		return companyName;
	}

	public float getSalary() {
		return salary;
	}
	
	
	
	

}
