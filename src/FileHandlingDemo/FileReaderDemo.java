package FileHandlingDemo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) throws IOException {
		/*
		 * Read a file which file? location
		 * place a , lib abc, the book is in chinese?
		 * close?
		 * open >> but the book is not present
		 */

		String filePath;
		filePath = "./src/FileHandlingDemo/TestFile";
		FileReader reader = new FileReader(filePath);
		//System.out.println((char)reader.read());
		//to read all character ?? loop
		//which loop to use? while loop
		//where to stop
		int i = 0;
		while((i = reader.read()) != -1) {
			System.out.print((char)i);
		}
		reader.close();
		
		FileWriter writer = new FileWriter(filePath);
		writer.write("Hello World");
		writer.close();
		
		
		
		
		
	}
}
