package in.com.Cloning;

public class Test1 {
	public static void main(String[] args) throws CloneNotSupportedException {
		Customer1 c = new Customer1("dilip", 200);
	   Customer1 c1 = (Customer1) c.clone();
	   c1.name = "deepu";
	   c1.ac.balance = 300;                    
	                                          //  deep cloning
	   System.out.println(c.name);
	   System.out.println(c.ac.balance);
	   
	   System.out.println(c1.name);
	   System.out.println(c1.ac.balance);
	   
	   
	}
	

}
