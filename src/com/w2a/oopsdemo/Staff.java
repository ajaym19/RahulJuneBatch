package com.w2a.oopsdemo;

public class Staff extends BaseDemo{

	public void maintainRegisters() {
		System.out.println("Register Maintenance");
	}
	
	//Method Overriding
	@Override
	public void lunchTime() {
		System.out.println("Lunch Time is for 45 minutes");
	}
}
