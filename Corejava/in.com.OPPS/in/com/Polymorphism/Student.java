package in.com.Polymorphism;

public class Student {  // compile time polymorphism overloading
	public void read() {
		System.out.println("studen reading book!!");
	}
	
	public void read(String bookname) {
		System.out.println("student reading book!!"+bookname);
	}
	
	public void read(String writer, int rate) {
		System.out.println("writer name"+writer);
		System.out.println("book prize"+rate);
	}
	
	public void read (int page,String color) {
		System.out.println("count page"+page);
		System.out.println("book color"+color);
	}

}
