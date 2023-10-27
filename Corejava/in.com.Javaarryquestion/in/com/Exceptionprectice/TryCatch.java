package in.com.Exceptionprectice;

public class TryCatch {
	public static void main(String[] args) {
		
		int a = 10;
		int b= 0;
		String name = "deepu";
		
		try {
			System.out.println(a/b);
		} catch (Exception e) {
			System.out.println(e);
		}
		try {
			System.out.println(name.charAt(5));
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
