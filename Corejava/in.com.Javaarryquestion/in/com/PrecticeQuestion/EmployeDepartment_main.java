package in.com.PrecticeQuestion;

import java.util.Scanner;

public class EmployeDepartment_main {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	Employe []e=new Employe[2];
	for (int i = 0; i < e.length; i++) {
		System.out.println("ENter the employe id");
		int e_id=sc.nextInt();
		System.out.println("Enter the employe name");
		String e_name=sc.next();
		System.out.println("Enter the dep name");
		String d_name=sc.next();
		System.out.println("enter the dep id");
		int d_id=sc.nextInt();
		System.out.println("enter the dep salary");
		int d_salary=sc.nextInt();
		Department d=new Department(d_name, d_id, d_salary);
		e[i]=new Employe(e_id, e_name, d, false);
	}
	for (int i = 0; i < e.length; i++) {
		if(e[i].d.d_name.equalsIgnoreCase("hr")) {
			e[i].isSpceal=true;
			System.out.println("is special");
		}
		else if(e[i].d.d_name.equalsIgnoreCase("it")) {
			e[i].isSpceal=true;
			System.out.println("is speceal");
		}
		else {
			System.out.println("not special");
		}
	}
}
}