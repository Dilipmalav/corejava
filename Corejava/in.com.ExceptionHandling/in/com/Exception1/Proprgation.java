package in.com.Exception1;

public class Proprgation {
	public static void main(String[] args) {
		
		   m1();
	}

	private static void m1() {
		  m2();
		  
		
	}

	private static void m2() {
		   try {
			   m3();
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}

	private static void m3() {
		
		String name = "dilip";
		System.out.println(name.charAt(6));
		
	}

}
