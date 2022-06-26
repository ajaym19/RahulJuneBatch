package com.w2a.abstractiondemo;

public class App {

	public static void main(String[] args) {
		HDFCBank hdfc = new HDFCBank();
		hdfc.interestRate();
		hdfc.getBalance();
		
		//create an Object of Interface
		//IRBI rbi = new IRBI();
		AbstractClassDemo abs = new ICICIBank();
		
		IRBI rbi = new HDFCBank();
		HDFCBank hd = new HDFCBank();
		
		//Dynamic Casting
		//we can only call those method which are present in parent class
	
		hd.giveLoan();
		
		/*
		 * webdriver: 5 methods
		 * Chrome Driver: 5 M + 1 specific method to chrome
		 * 
		 *  //webdriver driver = new ChromeDriver();//I cannot call chrome specific methods
		 *  //ChromeDriver driver1 = new ChromeDriver(); //I can call child specific methods also
		 * FireFixDriver driver1 = new FireFoxDriver();
		 * 
		 * driver1.childMethods();
		 * 
		 * repeat List, collections
		 * 
		 */
	}
	
}
