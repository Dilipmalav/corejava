package in.com.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Emp_comp {
	
	ArrayList<Company1> a1 = new ArrayList<>();
	
	void checkcity(ArrayList<Company1> a1) {
		Iterator<Company1> it = a1.iterator();
		while(it.hasNext()) {
			Company1 c = it.next();
			if(c.clocation.equalsIgnoreCase("noida")){
				System.out.println(c.cname+" "+c.e.eid+" "+c.e.esalary+" "+c.e.ename+" "+c.e.edepartment);
				
			}
		}
	}
	
	
	void checkCompany(ArrayList<Company1> a1) {
		Iterator<Company1> it = a1.iterator();
		
		while(it.hasNext()) {
			Company1 cm2 = it.next();
			if(cm2.cname.equalsIgnoreCase("hc1")) {
				System.out.println(cm2.e.eid+" "+cm2.e.ename+" "+cm2.e.esalary+" "+cm2.e.edepartment);
			}
		}
	}
	
	void checkempname(ArrayList<Company1> a1) {
		Iterator<Company1> it = a1.iterator();
		
		while(it.hasNext()) {
			Company1 cm3 = it.next();
			if(cm3.e.ename.equalsIgnoreCase("sham")) {
				System.out.println(cm3.cname+" "+cm3.clocation+" "+cm3.e.eid+" "+cm3.e.edepartment);
			}
		}
	}
  public static void main(String[] args) {
		Emp_comp emp = new Emp_comp();
		
		Employee1 e = new Employee1(101, "sham", "it", 12000);
		Employee1 e1 = new Employee1(102, "sham", "hr", 13000);
		Employee1 e2 = new Employee1(103, "ram", "it", 12000);
		Employee1 e3 = new Employee1(104, "aiex", "testing", 15000);
		
		Company1 c = new Company1("hc1", "noida", e);
		Company1 c1 = new Company1("infosys", "noida", e1);
		Company1 c2 = new Company1("hc1", "indore", e2);
		Company1 c3 = new Company1("microsoft", "indore", e3);
		
		ArrayList<Company1> a1 = new ArrayList<>();
		a1.add(c);
		a1.add(c1);
		a1.add(c2);
		a1.add(c3);
		
		System.out.println("searching city wise");
		emp.checkcity(a1);
		System.out.println("---------------");
		System.out.println("searching company wise");
		emp.checkCompany(a1);
		System.out.println("----------------");
		System.out.println("searching empname wise");
		emp.checkempname(a1);
		
		
		
	}

}
