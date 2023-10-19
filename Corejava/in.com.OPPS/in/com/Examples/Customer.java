package in.com.Examples;

public class Customer implements Cloneable {
	String name = null;
	
	Account1 a = new Account1();
	       
	        
	
	public Customer (String name, int balance) {
		this.name = name;
		this.a.balance = balance;
		
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Customer c =  (Customer) super.clone();
		c.a = (Account1) a.clone();
		return c ;
	}

}
