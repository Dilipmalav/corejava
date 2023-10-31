package in.com.OopsPrectice;

public class PolyoverlodingTest {
	public static void main(String[] args) {
		
		PolyoverlodingCompy p = new PolyoverlodingCompy();
		
		p.com();
		p.com(12);
		p.com("dilip");
		p.com(70000, 24);
		
		System.out.println(p);
	}

}
