package in.com.Exercise;

import java.util.Scanner;

public class Aarmstrongno {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no");
		int num = sc.nextInt();
		// 371 171
		
		int temp = num;
		int rem = 0;
		int sum = 0;
		while(num>0) {
			rem = num%10;
			sum = sum+(rem*rem*rem);
			num = num/10;
			
		}
		
		if(sum==temp) {
			System.out.println("armstrong");
		}else {
			System.out.println("not armstrong");
		}
	}
}		
		


