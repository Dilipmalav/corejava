package in.com.iterator;

public class Employee1 {
	
	int eid;
	String ename;
	String edepartment;
	int esalary;
	
	public Employee1(int eid, String ename, String edepartment, int esalary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.edepartment = edepartment;
		this.esalary = esalary;
	}

	@Override
	public String toString() {
		return "Employee1 [eid=" + eid + ", ename=" + ename + ", edepartment=" + edepartment + ", esalary=" + esalary
				+ "]";
	}

	
	

}
