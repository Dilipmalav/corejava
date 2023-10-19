package in.com.Cloning;

public class Account implements Cloneable {
	int balance;
	
	public Account(int balance) { // constructor
		this.balance = balance;
		
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

}
