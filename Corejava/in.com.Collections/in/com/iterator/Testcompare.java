package in.com.iterator;

public class Testcompare {
	public static void main(String[] args) {
		
		CompareTolist c1 = new CompareTolist(2,"dilip","jhalawar");
		CompareTolist c2 = new CompareTolist(2,"dilip","jhalawar");
		
		System.out.println(c1.equals(c2));
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		
	}

}
