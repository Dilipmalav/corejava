package in.com.Cloning;

public class Test1 {
	public static void main(String[] args) throws CloneNotSupportedException {
		Customer c = new Customer("dilip", 200);
	   Customer c1 = (Customer) c.clone();
	   c1.name = "deepu";
	   c1.ac.balance = 300;
	   
	   System.out.println(c.name);
	   System.out.println(c.ac.balance);
	   
	   System.out.println(c1.name);
	   System.out.println(c1.ac.balance);
	   
	   
	}
	

}
