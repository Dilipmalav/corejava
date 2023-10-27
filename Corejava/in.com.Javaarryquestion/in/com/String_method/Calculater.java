package in.com.String_method;

import java.util.Scanner;

public class Calculater {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the no");
		int num1 = sc.nextInt();
		
		System.out.println("enter the second no");
		int num2 = sc.nextInt();
		
		System.out.println("enter the opretor + - / *");
		char op = sc.next().charAt(0);
		double num;
		switch (op) {
		
		case '+':  num = num1+num2;
		           System.out.println(num);
		           
		           
		break;
		
		case '-' : num = num1-num2;
		           System.out.println(num);
		           
		break;
		
		case '/' : num = num1/num2;
		           System.out.println(num);
		           
		break;
		
		case '*' : num = num1*num2;
		           System.out.println(num);
		break;
		
		default : System.out.println("enter the valid opretor");
		}
		
		
	}

}
