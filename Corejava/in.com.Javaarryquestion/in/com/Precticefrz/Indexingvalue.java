package in.com.Precticefrz;

import java.util.Scanner;

public class Indexingvalue {
	
	public static void main (String [] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size");
		
		int size = sc.nextInt();
		System.out.println("enter the nomber");
		int number [] = new int [size];
		
		for (int i = 0; i < number.length; i++) { // input
			
			number [i] = sc.nextInt();
					
		}
		System.out.println("enter the search index");
		int x = sc.nextInt();
		
		for (int i = 0; i < number.length; i++) {
			if(number[i]== x) {
				System.out.println("index of x found"+i);
			}
			
			
		}
	}
	
	

}
