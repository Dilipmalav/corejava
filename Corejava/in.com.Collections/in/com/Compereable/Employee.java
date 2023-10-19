package in.com.Compereable;

public class Employee implements Comparable<Employee>{
	public int id;
	public String name;
	public String phone;
	
	public Employee(int id, String name, String phone) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
	}
	@Override
	public int compareTo(Employee o) {
		
		return this.id-o.id;
		//return this.name.compareTo(o.toString());
		
//		if(this.id<o.id)
//			return 1;
//		else if(this.id>o.id)
//			return -1;
//		return 0;
	} 
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", phone=" + phone + "]";
	}
	
	
	

}
