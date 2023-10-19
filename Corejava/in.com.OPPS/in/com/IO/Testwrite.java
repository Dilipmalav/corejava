package in.com.IO;

import java.io.FileWriter;
import java.io.IOException;

public class Testwrite {
	public static void main(String[] args) throws IOException {
		FileWriter writer = new FileWriter("C:\\Users\\acer\\Desktop\\javaIO\\dm.txt");
		
		writer.write("hello i am dilip malav !!!!");
		writer.close();
		
		System.out.println("data write sucessfully!!");
	}

}
