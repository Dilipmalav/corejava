package in.com.OppsTest;

public class AbstTest {
	
	public static void main(String[] args) {
		 
		Abstractemp a1 = new Abstractemp() {
			
			@Override
			public void demo() {
				System.out.println("this is second clas");
				
			}
		};
		a1.show();
		a1.demo();
	}

}
