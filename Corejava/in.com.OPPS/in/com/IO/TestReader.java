package in.com.IO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestReader {
	public static void main(String[] args) throws IOException {// read file 
		
		FileReader reader = new FileReader("C:\\Users\\acer\\Desktop\\javaIO\\dm.txt");
		
		int ch = reader.read();
		
		while(ch != -1){
			System.out.print((char)ch);
			
			ch = reader.read();
		}
		reader.close();
	}

}
