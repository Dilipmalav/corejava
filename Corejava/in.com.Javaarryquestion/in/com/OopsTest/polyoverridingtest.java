package in.com.OopsTest;

public class polyoverridingtest {
	public static void main(String[] args) {
		
		Polyoverridingemp p1 = new Polyoverridingemp(); // Runtime polymorphysm
		
		p1.details();
		p1.details(11);
		
		Polyoverridingemp p2 = new Polyoverridingdev();  // overriding
		
		p2.details();
		p2.details(22);
	}

}
