package in.com.Examples;



public class Customer2 implements Cloneable {
	String name;
	
	  Account2 b =new  Account2();
	  
	  public Customer2(String name,int balance) {
		  this.name = name;
		  this.b.balance = balance;
		
	}
      @Override
    protected Object clone() throws CloneNotSupportedException {
    	  Customer2 c = (Customer2) super.clone();
    	  c.b = (Account2) b.clone();
    	return c; 
    }
}
