package in.com.ioprectice;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import in.com.IO.Printwriter;

public class Bykeybord {
	public static void main(String[] args) throws IOException {
		System.out.println("enter your text");
		
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		
		FileWriter fr = new FileWriter("C:\\Users\\acer\\Desktop\\javaIO\\rays.txt");
		PrintWriter pw = new PrintWriter(fr);
		
		String line = br.readLine();
		
		while(!(line.equals("stop"))) {
			pw.println(line);
			line = br.readLine();
			
			
		}
		System.out.println("comliler is stop");
		is.close();
		fr.close();
		br.close();
		pw.close();
		
	}

}
