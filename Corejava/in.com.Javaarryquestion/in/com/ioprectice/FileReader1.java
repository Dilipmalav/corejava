package in.com.ioprectice;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader1 {
	public static void main(String[] args) throws IOException {
		
		FileReader fl = new FileReader("C:\\Users\\acer\\Desktop\\javaIO\\print.txt");
		
		int ch = fl.read();
		
		while(ch != -1) {
			System.out.print((char)ch);
			
			ch = fl.read();
		}
	}
}
