package com.w2a.basics;

public class DataTypeConversion {

	/*
	 * Bucket Theory: Bucket1 >> 3L Bucket2 >> 5L
	 * 
	 * Task: Transfer all water 1. from B1 to B2 >> lower to higher >> No problem 2.
	 * from B2 to B1 >>
	 */

	public static void main(String[] args) {

		int i1 = 34;
		long i2 = i1;
		System.out.println(i1);
		System.out.println(i2);

		long l1 = 343;
		byte i3 = (byte) l1;

		System.out.println(l1);
		System.out.println(i3);

		float f1 = 45.8f;
		int i4 = (int) f1;
		System.out.println(f1);
		System.out.println(i4);

		int i6 = 129;
		byte b10 = (byte) i6;
		System.out.println(i6);
		System.out.println(b10);

		// char to int
		char c1 = 'A';
		int i7 = c1;
		System.out.println(c1);
		System.out.println(i7);

		// int to char
		int i8 = 65;
		char c2 = (char) i8;
		System.out.println(i8);
		System.out.println(c2);

		// string to integer
		String name = "123";

		int i9;
		i9 = Integer.parseInt(name);
		System.out.println(name);
		System.out.println(i9);
		
		//int to string
		int i11 = 345;
		String s2 = Integer.toString(i11);
		System.out.println(i11+10); //355
		System.out.println(s2+10); //34510
		
		//string to double
		String s4 = "345";
		Double.parseDouble(s4);
		

	}
}
