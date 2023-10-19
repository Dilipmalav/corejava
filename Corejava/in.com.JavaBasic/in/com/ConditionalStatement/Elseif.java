package in.com.ConditionalStatement;

import java.util.Scanner;

public class Elseif {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a==b) {
			System.out.println("equal");
		}else if(a>b) {
				System.out.println("a is greter");
		}else {
				System.out.println("a is leser");
		}

	}
		
	}

	
	

