package in.com.Trycatch;

public class TestLoginException { // checked Exception 
	
	public static void main(String[] args) {
		
		String name = "admin";
		
		if(name.equals("admi")) {
		
		System.out.println("yes valid user!!!");
		
	}
		else {
		LoginException e = new LoginException();
		try {
			throw e;
			
		} catch (Exception e1) {
			System.out.println(e);
		}
	}

	}
}
