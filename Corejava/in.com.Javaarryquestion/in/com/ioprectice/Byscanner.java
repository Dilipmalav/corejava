package in.com.ioprectice;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Byscanner {
	public static void main(String[] args) throws IOException {
		
		FileReader file = new FileReader("C:\\Users\\acer\\Desktop\\javaIO\\print.txt");
		
		Scanner sc = new Scanner(file);
		
		while(sc.hasNext()) {
			System.out.println(sc.nextLine());
		}
		file.close();
		sc.close();
	}

}
