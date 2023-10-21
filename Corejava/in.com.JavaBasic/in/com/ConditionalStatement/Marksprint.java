package in.com.ConditionalStatement;

import java.util.Scanner;

public class Marksprint {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no ");
		
		int input;
		
		do {
			
			int mrks= sc.nextInt();
			if(mrks>90) {
				System.out.println("this is good...");
			}else if(mrks<90&&mrks>60) {
				System.out.println("this is also good");
			}else if(mrks<60&&mrks>0) {
				System.out.println("this is normal");
			}else {
				System.out.println("invailid no ");
			}
			
			System.out.println("if u r continoue  1 or 0");
			
			input = sc.nextInt();
			System.out.println("stop the loop ");
			
		}while(input==1);
	}

}
