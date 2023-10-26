package in.com.ioprectice;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Marks2 {
	public static void main(String[] args) throws IOException {
		
		FileOutputStream in = new FileOutputStream("C:\\Users\\acer\\Desktop\\javaIO\\series.txt");
		
		ObjectOutputStream out = new ObjectOutputStream(in);
		
		Marks1 m = new Marks1();
		
		m.eng = 45;
		m.hindi = 55;
		m.maths = 85;
		
		out.writeObject(m);
		
		in.close();
		out.close();
		
		System.out.println("obj convert into bytestream");
				
		
	}

}
