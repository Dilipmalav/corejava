package in.com.ConditionalStatement;

import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no");
		
		int x = sc.nextInt();
		
		if(x%2==0) {
			System.out.println("even no");
		}else {
			System.out.println("odd no");
		}
		
	}

}
