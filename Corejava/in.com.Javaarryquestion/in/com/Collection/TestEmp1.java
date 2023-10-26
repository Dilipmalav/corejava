
package in.com.Collection;

import java.util.ArrayList;
import java.util.Collections;

public class TestEmp1 {
	public static void main(String[] args) {
		ArrayList<Emp1> emp1=new ArrayList<Emp1>();
		
		emp1.add(new Emp1(1, "ram", "321654"));
		emp1.add(new Emp1(3, "sagar", "123456"));
		emp1.add(new Emp1(2, "dilip", "456123"));
		emp1.add(new Emp1(4, "bharat", "653214"));
		
		System.out.println(emp1);
		
		Collections.sort(emp1, new TestbyID());
		System.out.println(emp1);
		
		Collections.sort(emp1, new Testbyname());
		System.out.println(emp1);
		
		Collections.sort(emp1, new Testbyphone ());
		System.out.println(emp1);
	}

}
