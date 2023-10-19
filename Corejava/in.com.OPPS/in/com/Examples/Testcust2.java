package in.com.Examples;

public class Testcust2 {
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Customer2 c = new Customer2("dilip", 5000);
		Customer2 c1 = (Customer2) c.clone();
		c1.name = "dilkush";
		c1.b.balance = 4000;
		
		System.out.println(c.name);
		System.out.println(c.b.balance);
		
		System.out.println(c1.name);
		System.out.println(c1.b.balance);
		
	}

}
