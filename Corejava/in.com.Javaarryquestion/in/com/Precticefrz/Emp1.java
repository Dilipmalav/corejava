package in.com.Precticefrz;

public class Emp1 {
	int id;
	String name;
	int phone;
	
	public Emp1(int id,String name,int phone) {
		this.id = id;
		this.name = name;
		this.phone = phone;
		
	}
	
	@Override
	public String toString() {
		
		return id+" "+name+" "+phone;
	}

}
