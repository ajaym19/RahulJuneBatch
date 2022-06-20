package com.w2a.basics;

public class LoopingDemo {

	public static void main(String[] args) {

		// print numbers from 5 to 10

		for (int i = 10; i >= 0; i--) {
			// 1, ...10
			// System.out.println(i);
		}
		System.out.println("After for Loop");

		// if id = 1, Admin
		// if id = 2, HR
		// if id = 3, Finance
		// else general employee
		int id = 6;

		if (id == 1) {
			System.out.println("Admin");
		} else if (id == 2) {
			System.out.println("HR");
		} else if (id == 3) {
			System.out.println("Finance");
		} else {
			System.out.println("General Employee");
		}

		// print 1 to 10, if you find 3 print ajay also
		for (int i = 1; i < 11; i++) {

			if (i == 3) {
				// System.out.println("Ajay");
			} else {
				// System.out.println(i);
			}
		}

		// if found 3 stop
		for (int i = 1; i < 11; i++) {
			if (i == 3) {
				break;
			} else {
				System.out.println(i);
			}
		}

		// While loop
		int a = 1;
		while (a <= 10) {
			// System.out.println(a);
			a++;
		}

		// Do while loop
		System.out.println("Learning do-while");
		int b = 12;
		do {
			System.out.println(b);
			b++;
		} while (b <= 10);

		// switch case

		// print day value based on the day id
		// 1 = monday
		int day = 3;

		System.out.println("Learning Switch Case");
		switch (day) {
		case 1:
			System.out.println("Monday");
			break;

		case 2:
			System.out.println("Tuesday");
			break;

		case 3:
			System.out.println("Wednesday");
			break;

		case 4:
			System.out.println("Thursday");
			break;

		case 5:
			System.out.println("Friday");
			break;

		case 6:
			System.out.println("Saturday");
			break;

		case 7:
			System.out.println("Sunday");
			break;

		default:
			System.out.println("Please enter number from 1-7");
			break;
		}
		
		int w = 3;
		System.out.println(w); //3
		int j = ++w;
		System.out.println(w); //4
		System.out.println(j); //3

	}
}
