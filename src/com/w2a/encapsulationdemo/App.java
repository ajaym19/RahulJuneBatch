package com.w2a.encapsulationdemo;

public class App {

	public static void main(String[] args) {
		Employees e1 = new Employees();
//		e1.empName = "BadName";
//		e1.companyName = "BadCompany";
//		e1.empId = 23;
//		System.out.println(e1.empId);
//		System.out.println(e1.companyName);
//		System.out.println(e1.empName);
		//e1.setEmpName("Ajay");
		
		System.out.println(e1.getEmpName());
		
		e1.setGender('T');
		System.out.println(e1.getGender());
		//Math.PI = 4;
		
	}
	
}
