package in.com.Set_get_method;

public class TestConstructorOverloding {
	public static void main(String[] args) {
		
	
	ConstructorOverloding c =new ConstructorOverloding();
	ConstructorOverloding c1 =new ConstructorOverloding(2222);
	ConstructorOverloding c2 =new ConstructorOverloding(1220,"dilip");
	
	System.out.println(c.salary +" " +c.id +" " +c.name);
	System.out.println(c1.salary);
	System.out.println(c2.id +" " +c2.name);

	}	
	}


