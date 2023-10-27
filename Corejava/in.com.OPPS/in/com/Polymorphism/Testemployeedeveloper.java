package in.com.Polymorphism;

public class Testemployeedeveloper {
	public static void main (String[]args) {
		
		//Employee d = new Employee(); // runtime polymorphism
		
		Employee e = new Developer(); // overriding
		//Developer d = new Developer();
		
		e.showdetail();
		//d.showdetail();
	}

}
