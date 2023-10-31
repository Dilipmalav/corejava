package in.com.Cloning;

public class Customer1 implements Cloneable {
	String name = null;
	Account1 ac = new Account1();
	
	public Customer1(String name, int balance) {   //deep cloning
		
		this.name = name;
		this.ac.balance = balance;
		
		
		
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Customer1 c = (Customer1) super.clone();
		c.ac=(Account1) ac.clone();
		
		return c;
	}

}
