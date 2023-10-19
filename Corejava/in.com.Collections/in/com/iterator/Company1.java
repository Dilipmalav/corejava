package in.com.iterator;

public class Company1 {
	
	String cname;
	String clocation;
	Employee1 e;
	public Company1(String cname, String clocation, Employee1 e) {
		super();
		this.cname = cname;
		this.clocation = clocation;
		this.e = e;
	}
	@Override
	public String toString() {
		return "Company1 [cname=" + cname + ", clocation=" + clocation + "]";
	}
	
	

}
