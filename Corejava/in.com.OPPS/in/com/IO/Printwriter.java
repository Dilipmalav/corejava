package in.com.IO;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Printwriter {
	
	public static void main(String[] args) throws IOException {
		FileWriter file = new FileWriter("C:\\Users\\acer\\Desktop\\javaIO\\print.txt");
		
		PrintWriter out = new PrintWriter(file);
		
		out.println("hello gys ");
		out.println("kese h aap log");
		out.println("how are you");
		
		System.out.println("data write sucessfully");
		
		file.close();
		out.close();
	}

}
