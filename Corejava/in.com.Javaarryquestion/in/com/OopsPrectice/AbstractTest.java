package in.com.OopsPrectice;

public class AbstractTest {
	public static void main(String[] args) {
		
		Abstractme a = new Abstractme() {
			
			@Override
			public void b() {
				System.out.println("this is second class");
				
			}
		};
		a.m();
		a.b();
	}
	
}
