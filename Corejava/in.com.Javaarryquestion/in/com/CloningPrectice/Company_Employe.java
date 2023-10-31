package in.com.CloningPrectice;

public class Company_Employe implements Cloneable {
	
	String name;
	String address;
	Company1 c = new Company1();
	public Company_Employe(String name, String address,int id) {
		super();
		this.name = name;
		this.address = address;
		this.c.id = id;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Company_Employe c2 = (Company_Employe) super.clone();
		c2.c= (Company1) c.clone();
		return c2;
	}
	

}
