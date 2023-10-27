package in.com.Exceptionprectice;

public class CheackedException {
	public static void main(String[] args) {
		
		String name = "dilip";
		
		if(name.equals("dilip")) {
			
			System.out.println("yes vaild user");
		}
		else {
			TestCheacked t = new TestCheacked();
			try {
				throw t;
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}

}
