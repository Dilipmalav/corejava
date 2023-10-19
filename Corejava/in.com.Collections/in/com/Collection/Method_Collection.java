package in.com.Collection;

import java.util.ArrayList;
import java.util.Collection;

import in.com.PrecticeQuestion.Array_Exception;

public class Method_Collection {
	
	public static void main(String[] args) {
		
		Collection c1 = new ArrayList();
		
		c1.add(22);
		c1.add("dm");
		c1.add(22.9);
		System.out.println(c1);
		
		Collection c2 = new ArrayList();
		c2.add(14);
		c2.add("sr");
		c2.add(55);
		System.out.println(c2);
		
	c1.addAll(c2);
	System.out.println(c1);
		
		c1.contains(c1);
		System.out.println(c1);
		
		c1.containsAll(c1);
		System.out.println(c2);
		
		c1.isEmpty();
		System.out.println();
		
		c1.remove(c2);
		System.out.println(c2);
		
		
	}

}
