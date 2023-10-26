package in.com.ioprectice;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Bufferedreader1 {
public static void main(String[] args) throws IOException {
	
	FileReader fr = new FileReader("C:\\Users\\acer\\Desktop\\javaIO\\print.txt");
	
	BufferedReader br = new BufferedReader(fr);
	
	String line = br.readLine();
	
	while(line != null) {
		
		System.out.println(line);
		
		line = br.readLine();
	}
	fr.close();
	br.close();
	
}
}
