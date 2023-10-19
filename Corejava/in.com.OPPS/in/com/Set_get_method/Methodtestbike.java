package in.com.Set_get_method;

public class Methodtestbike {
	public static void main (String []args) {
		
		Methodbike b = new Methodbike();
		b.color = "black";
		b.name = "palsur";
		b.price = 150000;
		
		b.printColor();
		b.printName();
		b.printPrice();
		
		Methodbike c = new Methodbike();
		c.color = "red";
		c.name = "hero";
		c.price = 80000;
		
		c.printColor();
		c.printName();
		c.printPrice();
		
		
	}

}
