package in.com.Exception1;

public class TryCatch {
	public static void main(String[] args) {
		
		int a=10;
		int b=0;
		String name="dilip";
		
		try {
			System.out.println(a/b);
		} catch (Exception e) {
			System.out.println(e);
		}
		try {
			System.out.println(name.charAt(6));
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
