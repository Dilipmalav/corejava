package in.com.Exercise;

import java.util.Scanner;

public class Loopprectice {
	public static void main(String[] args) {
		
/////////////////aarm
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no");
		int num = sc.nextInt();
		
		
		
		//int num = 371;
		int temp = num ;
		int  rem = 0 ;
		 int sum = 0;
		 while(num>0) {
			 
			 rem = num%10;
			 sum = sum+(rem*rem*rem);
			 num = num/10;
		 }
		 
		 if(sum==temp) {
			 System.out.println("this is armstrong");
		 }else {
			 System.out.println("not armstrong");
		 }
			 
		     

		    
		    
		
		
		
		
	}
}
		
		

