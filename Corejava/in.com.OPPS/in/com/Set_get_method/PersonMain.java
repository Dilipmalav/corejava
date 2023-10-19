package in.com.Set_get_method;

public class PersonMain {
public static void main(String[] args) {
	Person p = new Person ();
	p.setName("dilip");
	p.setDob(2002);
	p.setAddress("jhalawar");
	
	System.out.println(p.getName());
	System.out.println(p.getDob());
	System.out.println(p.getAddress());
	
}
}
