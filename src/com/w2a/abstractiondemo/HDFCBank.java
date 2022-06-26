package com.w2a.abstractiondemo;

import com.w2a.oopsdemo.Students;

public class HDFCBank extends Students implements IRBI, ISEBI{

	public void interestRate() {
		System.out.println("Interest Rate if 5%");
	}

	@Override
	public void depositMoney() {
		System.out.println("HDFC Bank Depositing Money");

	}

	@Override
	public void withdrawMoney() {
		System.out.println("HDFC Bank Withdrawing Money");

	}

	@Override
	public void getBalance() {
		System.out.println("HDFC Bank Balance Check");

	}

	@Override
	public void intradayTrading() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deliveryTrading() {
		// TODO Auto-generated method stub
		
	}
	
	public void giveLoan() {
		
	}
}
