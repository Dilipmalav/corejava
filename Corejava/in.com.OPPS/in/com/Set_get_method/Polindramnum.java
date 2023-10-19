package in.com.Set_get_method;

import java.util.Scanner;

public class Polindramnum {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
//	int num =sc.nextInt(); 
	int num = 121;
	int temp = 0;
	temp = num;
	int rem=0,sum=0;
	while(num>0) {
		rem = num%10;
		sum = sum*10+rem;
		num = num/10;
	}
	if(sum==temp) {
		System.out.println("no is polinddrm");
		
	}else {
		System.out.println("no is not polindrm");
	}
	}
  
}
