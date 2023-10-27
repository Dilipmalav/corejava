package in.com.OopsTest;

public class AbstractTest {
	public static void main(String[] args) {
		
		Abstractme a = new Abstractme() {
			
			@Override
			public void m() {
				System.out.println("this is override");
				
			}
		};
		a.m();
		a.d();
	}

}
