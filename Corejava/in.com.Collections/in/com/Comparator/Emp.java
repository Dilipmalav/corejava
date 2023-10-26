package in.com.Comparator;

public class Emp {
	int id;
	String name;
	int phone;
	
	public Emp(int id,String name,int phone) {
		this.id = id;
		this.name = name;
		this.phone = phone;
		
	}
	
	@Override
	public String toString() {
		
		return id+" "+name+" "+phone;
				
	}

}
