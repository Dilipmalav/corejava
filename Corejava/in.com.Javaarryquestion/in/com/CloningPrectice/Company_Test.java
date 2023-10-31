package in.com.CloningPrectice;

public class Company_Test {
	public static void main(String[] args) throws CloneNotSupportedException { 
		
		Company_Employe c = new Company_Employe("ram", "indore", 11);
		Company_Employe c1=(Company_Employe) c.clone();
		 c1.name= "sagar";
		 c1.address= "jhalawar";
		 c1.c.id = 22;
		 
		 System.out.println(c.name);
		 System.out.println(c.address);
		 System.out.println(c.c.id);
		 System.out.println(c1.name);
		 System.out.println(c1.address);
		 System.out.println(c1.c.id);
		
	}

}
