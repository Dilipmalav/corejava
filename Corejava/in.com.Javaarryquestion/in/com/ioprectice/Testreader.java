package in.com.ioprectice;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Testreader {
	public static void main(String[] args) throws IOException {
		
		FileReader reader = new FileReader("C:\\Users\\acer\\Desktop\\javaIO\\print.txt");
		
		int ch = reader.read();
		
		while(ch != -1) {
			System.out.print((char)ch);
			
			ch = reader.read();
		}
		reader.close();
	}

}
