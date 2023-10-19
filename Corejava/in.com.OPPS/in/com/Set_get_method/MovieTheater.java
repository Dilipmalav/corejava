package in.com.Set_get_method;

import java.util.Scanner;

public class MovieTheater {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("balconey price = 100");
		System.out.println("saeter price = 50");
		System.out.println("enter your name ");
		String name = sc.next();
		System.out.println("enter the money");
		int money = sc.nextInt();
		double pricebalcony = 100;
		double pricesaet = 50;
		
		if(money==100) {
			System.out.println(pricebalcony = pricebalcony - pricebalcony*0.15);
			System.out.println("your ticket is booked ");
		}else if(money==50) {
			System.out.println(pricesaet = pricesaet - pricesaet*0.05);
			System.out.println("your ticket is booked ");
		}else {
			System.out.println("please enter the valid amount");
		}
	}
}
