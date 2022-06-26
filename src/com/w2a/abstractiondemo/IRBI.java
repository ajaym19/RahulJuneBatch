package com.w2a.abstractiondemo;

public interface IRBI {

	/*
	 * Method has 2 parts:
	 * 1. Signature
	 * 2. Implementation
	 * 
	 * Any method which does not have an implementation/body is called as an Abstract method
	 * 
	 */
	
	public void interestRate();
	
	public void depositMoney();
	
	public void withdrawMoney();
	
	public void getBalance();
}
