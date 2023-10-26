package in.com.Precticefrz;

import java.util.ArrayList;
import java.util.Collections;

public class TestEmp1 {
	public static void main(String[] args) {
		
		ArrayList<Emp1> emp = new ArrayList<Emp1>();
		
		emp.add(new Emp1(1, "ram", 123456));
		emp.add(new Emp1(3, "sagar", 456321));
		emp.add(new Emp1(2, "rahul", 321654));
		
		System.out.println(emp);
		
		Collections.sort(emp, new Byid());
		System.out.println(emp);
		
		Collections.sort(emp, new Byname());
		System.out.println(emp);
		
		Collections.sort(emp, new Byphone());
		System.out.println(emp);
	}

}
