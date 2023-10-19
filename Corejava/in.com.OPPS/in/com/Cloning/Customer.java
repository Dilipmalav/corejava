package in.com.Cloning;

public class Customer implements Cloneable {
	String name = null;
	Account1 ac = new Account1();
	
	public Customer(String name, int balance) {
		
		this.name = name;
		this.ac.balance = balance;
		
		
		
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Customer c = (Customer) super.clone();
		c.ac=(Account1) ac.clone();
		
		return c;
	}

}
