package in.com.ConditionalStatement;

import java.util.Scanner;

public class Nevenno {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no..");
		
		int x = sc.nextInt();
		
		for(int i= 1; i<x;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
			
		}
	}

}
