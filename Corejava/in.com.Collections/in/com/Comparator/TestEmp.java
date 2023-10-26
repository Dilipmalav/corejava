package in.com.Comparator;

import java.util.ArrayList;
import java.util.Collections;

public class TestEmp {
	public static void main(String[] args) {
		
		ArrayList<Emp> emp = new ArrayList<Emp>();
		
		emp.add(new Emp(1, "dilip", 123));
		emp.add(new Emp(3, "sagar", 456));
		emp.add(new Emp(2, "rahul", 567));
		
		System.out.println(emp);
		
		Collections.sort(emp, new Byid());
		System.out.println(emp);
		
		Collections.sort(emp, new Byname());
		System.out.println(emp);
		
		Collections.sort(emp, new Byphone());
		System.out.println(emp);
	}

}
