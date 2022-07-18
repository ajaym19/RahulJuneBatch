package FileHandlingDemo;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionsDemo {

	/*
	 * Exception: unwanted halt to the execution flow try catch block is used for
	 * handling exceptions try - any risky code which might throw an exception catch
	 * - what to do if there is an exception in try block finally - what to do in
	 * every condition
	 * 
	 * Types:
	 * parent class is Exception
	 * 1. Compile Time: java will prompt of exception at compile time, save the code
	 * 2. Run Time: java will not prompt of exception
	 * 
	 */
	public static void main(String[] args) {
		String filePath;
		filePath = "./src/FileHandlingDemo/TestFile";
		
		
		try {
			// opening a connection
			FileReader reader = new FileReader(filePath);
			System.out.println("Reading the file");

			// close the connection
		} catch (FileNotFoundException e) {
			System.out.println("File not present, please check the filename again!!!");
		} finally {
			System.out.println("Closing the connection");
		}
		
		//example of Run time exceptions
		try {
			System.out.println(9/0);
		} catch (Exception e) {
			System.out.println("Cannot divide by zero!!!");
			
		}
		
		String name = null;
		System.out.println(name.length());

	}
}
