package in.com.Examples;

public class Testcust {
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Customer c = new Customer("dilip", 2000);
		Customer c1 = (Customer) c.clone();
		c1.name = "malav";
		c1.a.balance = 3000;
		
		System.out.println(c.name);
		System.out.println(c.a.balance);
		
		System.out.println(c1.name);
		System.out.println(c1.a.balance);
		
	}

}
