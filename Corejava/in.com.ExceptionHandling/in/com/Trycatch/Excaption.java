package in.com.Trycatch;

public class Excaption {
	public static void main(String[] args) {
		
	
	
	int a= 10;
	int b= 0;
	String name = "dilip";
	try {
		System.out.println(name.charAt(6));
		
	} catch (Exception e) {
		System.out.println(e);
	}
	
try {
	int c= a/b;
	System.out.println(c);
	
} catch (Exception e) {
	System.out.println(e);
}
finally {
	System.out.println("ye to chalega hi sai");
}
    
	
	
	}

}
