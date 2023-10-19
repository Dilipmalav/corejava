package in.com.Compereable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Testemp {
	public static void main(String[] args) {
		
		ArrayList<Employee> e1 = new ArrayList<Employee>();
		
		e1.add(new Employee (1,"Ankit","12345"));
		e1.add(new Employee (3,"ram","54321"));
		e1.add(new Employee (2,"shyam","6789"));
		e1.add(new Employee (4,"sagar","9876"));
		
		System.out.println(e1);
		
		Collections.sort(e1);
		System.out.println(e1);
		
//		Iterator<Employee> it = e1.iterator(); line by line print
//		while(it.hasNext()) {
//			Employee em = it.next();
//			System.out.println(em);
//		}


				
		
	}

}
