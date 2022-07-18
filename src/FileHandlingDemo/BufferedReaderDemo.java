package FileHandlingDemo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {

	public static void main(String[] args) throws IOException {
		String filePath;
		filePath = "./src/FileHandlingDemo/TestFile";
		FileReader reader = new FileReader(filePath);
		BufferedReader br = new BufferedReader(reader);
		
		//System.out.println(br.readLine());
		//while loop
		String line;
		while((line = br.readLine())!= null) {
			System.out.println(line);
		}	
		
		//Apache POI
		
	}
}
