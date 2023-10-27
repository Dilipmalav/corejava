package in.com.OopsTest;

public class PolyoverlodingCompy { // compile time overloding
	
	public void com() {
		System.out.println("this is company software");
	}
	public void com(String name) {
		System.out.println("employe name"+name);
	}
	public void com(int id) {
		System.out.println("this is employe is"+id);
	}
	public void com(int salary, int age) {
		System.out.println("this is em salary"+salary);
		System.out.println("this is em age"+age);
	}

}
