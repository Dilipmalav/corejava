package in.com.Polymorphism;

public class Teststudent {
	public static void main(String[] args) {
		Student s = new Student();
		
		s.read();
		s.read("self lerner");
		s.read("sunilos", 500 );
		s.read(44, "white");
		
	}

}
