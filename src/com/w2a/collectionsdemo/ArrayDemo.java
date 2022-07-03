package com.w2a.collectionsdemo;

public class ArrayDemo {

	/*
	 * Array:
	 * used to store multiple values, of similar data type
	 * 
	 * Three steps in Array
	 * 1. Declaration
	 * 2. Instantiation
	 * 3. Initialisation
	 * 
	 * Rules:
	 * 1. Object creation is done using new keyword
	 * 2. While creating an object, it is compulsory to define the size of an Array
	 * 3. Indexing starts from 0
	 * 4. Default value for all the elements will be 0 or null
	 * 5. Duplicates are allowed
	 * 
	 * Disadvantage:
	 * Arrays are static/fixed in size
	 * 
	 */
	
	public static void main(String[] args) {
		
		int[] ids; //Declaration
		//int abc[];
		
		ids = new int[5]; //instantiation
		
		// [21,24,0,28] --values
		//	0,1,2,3 --index
		
		ids[0] = 21; //init
		System.out.println(ids[0]);
		
		ids[1] = 24; //init
		System.out.println(ids[1]);
		
		System.out.println(ids[2]);  //0
		
		ids[3] = 21;
		ids[4] = 31;
		System.out.println(ids[3]);
	//	System.out.println(ids[4]); //error
		System.out.println("Printing all in for loop");
		for(int i =0; i < ids.length; i++) {
			System.out.println(ids[i]);
		}
		
		
		//Declaration and instantiation together
		int[] a = new int[4];
		
		//Declaration and instantiation and init together
		int[] b = {21,23,24};
		System.out.println(b.length);
		
		
		/*
		 * HW
		 * create an array
		 * with this values
		 * 21,31,41,21,23,21
		 * take the input from the user as number to search? >> use Scanner class 
		 * search that number and print the times it is present
		 * 
		 * eg:
		 * Enter the number to search: 21
		 * OP: 3
		 * 
		 * Enter the number to search: 31
		 * OP: 1
		 * 
		 * Enter the number to search: 20
		 * OP: 0
		 * 
		 * 
		 * Practise an array of other data types
		 */
		
		
		
	}
}
