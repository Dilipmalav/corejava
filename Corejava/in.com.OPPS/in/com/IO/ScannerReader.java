package in.com.IO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ScannerReader {
	public static void main(String[] args) throws IOException {
		
		FileReader file = new FileReader("C:\\Users\\acer\\Desktop\\javaIO\\dm.txt");
		
		Scanner sc = new Scanner (file);
		
		while(sc.hasNext()) {
			System.out.println(sc.nextLine());
		}
		sc.close();
		file.close();
		
	}

}
