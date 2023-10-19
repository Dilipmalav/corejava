package in.com.iterator;

import java.util.ArrayList;
import java.util.Iterator;


public class TestEmp {
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee(22, "dilip", "jhalawar");
		Employee e2 = new Employee(33, "sagar", "khanpuriya");
		
		ArrayList List = new ArrayList();
		List.add(e1);
		List.add(e2);
		
		Employee e = (Employee) List.get(0);
		System.out.println(e);
//		System.out.println(e.getId());
//		System.out.println(e.getName());
//		System.out.println(e.getAddress());
		
		for (int i = 0; i < List.size(); i++) {
			
			Employee e3 = (Employee) List.get(i);
			System.out.println(e3);
			
		}
		
		for (Object object : List) {
			
			Employee e4 = (Employee) object;
			System.out.println(e4);
			
		}
		
		Iterator it = List.iterator();
		
		while (it.hasNext()) {
			Employee e5 = (Employee) it.next();
			System.out.println(e5);
			
		}
		
	}

}
