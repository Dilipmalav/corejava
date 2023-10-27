package in.com.Exception1;

public class Login {
	public static void main(String[] args) {
		
		String name= "dilip";
		
		if(name.equals("dili")) {
			System.out.println("yes vaild user");
		}
		
		else {
		TestLogin t = new TestLogin();
		try {
			throw t;
		} catch (Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("chalega");
		}
	}
        
		}
	}
	

