package in.com.Set_get_method;

import java.util.Scanner;

public class BikeMain {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("choose the bike color");
	String color = sc.next();
	
	System.out.println("choose the prize ");
	int prize = sc.nextInt();
	
	System.out.println("choose average");
	int average = sc.nextInt();
	
	System.out.println("choose the priz");
	Bike b=new Bike("black", 50000, 70);
	
	System.out.println("bike color is :"+b.getColor());
	System.out.println("bike amount is"+b.getPrize());
	System.out.println("bike average is"+b.getAverage());
}
}
