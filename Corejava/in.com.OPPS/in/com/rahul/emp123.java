package in.com.rahul;

import java.util.ArrayList;
import java.util.Iterator;

class Emp {
	int id;
	String name;
	int salary;
	
	
	public Emp(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "Emp123 [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	

}
public class emp123{
	ArrayList<Emp> a1 = new ArrayList<Emp>();
	int flage1 = 0;
	public void maxsalary(ArrayList<Emp>a1) {
		Iterator<Emp> it = a1.iterator();
		while(it.hasNext()) {
			Emp em = it.next();
			if(em.salary>10000) {
				System.out.println(em.id+" "+em.name+" "+em.salary);
			}
		}
	}
	
	public void searchEmploye(ArrayList<Emp>a1) {
		Iterator<Emp>it = a1.iterator();
		
		while(it.hasNext()) {
			Emp emp2 = it.next();
			if(emp2.name.equals("sachin")) {
				System.out.println(emp2.name+" :"+"employe is persent");
				flage1=1;
			}
		}
		if(flage1==1) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	}
	
	public static void main(String[] args) {
		ArrayList<Emp> a1 = new ArrayList<Emp>();
		a1.add(new Emp(2, "dm", 140000));
		a1.add(new Emp(3, "sr", 10000));
		a1.add(new Emp(3, "sachin", 11000));
		a1.add(new Emp(4, "lavish", 1200000));
		a1.add(new Emp(5, "rahul", 14000));
		emp123 emp1 = new emp123();
		emp1.maxsalary(a1);
		emp123 em = new emp123();
		em.searchEmploye(a1);
	}
}







