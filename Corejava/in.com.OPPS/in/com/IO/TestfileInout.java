package in.com.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestfileInout {
	public static void main(String[] args) throws IOException {
		
		FileInputStream in = new FileInputStream("C:\\Users\\acer\\Desktop\\javaIO\\IMG_1233.jpg");
		FileOutputStream out = new FileOutputStream("C:\\Users\\acer\\Desktop\\javaIO\\skp.txt");
		
		int ch = in.read();
		while(ch != -1) {
			
			out.write(ch);
			
			ch = in.read();
		}
		in.close();
		out.close();
		System.out.println("data copy sucessfully!!");
	}

}
