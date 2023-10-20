package in.com.IO;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Bykeybord {
	public static void main(String[] args) throws IOException {
		
		System.out.println("enter your text here..");
		
		InputStreamReader is = new InputStreamReader(System.in);
		
		BufferedReader br = new BufferedReader(is);
		
		FileWriter fw = new FileWriter("C:\\Users\\acer\\Desktop\\javaIO\\bykeybord.txt");
		
		PrintWriter pw = new PrintWriter(fw);
		
		String line = br.readLine();
		
		while(!(line.equals("stop"))) {
			pw.println(line);
			line = br.readLine();
		}
		System.out.println("your compiler is stop");
		
		is.close();
		br.close();
		fw.close();
		pw.close();
	}

}
