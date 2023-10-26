package in.com.ioprectice;

import java.io.FileWriter;
import java.io.IOException;

public class Filewriter1 {
	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("C:\\Users\\acer\\Desktop\\javaIO\\dm.txt");
		
		fw.write("hello gys kese h aap log");
		fw.close();
		
		System.out.println("data write sucessfully");
		
		
	}

}
