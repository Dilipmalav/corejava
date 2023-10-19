package in.com.IO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.annotation.processing.Filer;

public class TestbyBufferreader {
	public static void main(String[] args) throws IOException {
		
		FileReader file = new FileReader("C:\\Users\\acer\\Desktop\\javaIO\\dm.txt");
		
		BufferedReader reader = new BufferedReader(file);
		
		String line = reader.readLine();
		
		
		while(line != null) {
			System.out.println(line);
			
			line = reader.readLine();
		}
		file.close();
		reader.close();
	}

}
