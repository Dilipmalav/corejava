package in.com.Collection;

public class Em implements Comparable<Em> {
	 int Emid;
	 String name;
	 String phone;
	
	public Em(int Emid,String name,String phone) {
		this.Emid = Emid;
		this.name = name;
		this.phone = phone;
	}
	@Override
	public int compareTo(Em o) {
		 
		return this.Emid-o.Emid;
	}
	@Override
	public String toString() {
		
		return Emid+" "+name+" "+phone;
	}

}
