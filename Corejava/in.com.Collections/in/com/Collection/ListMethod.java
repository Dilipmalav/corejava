package in.com.Collection;
import java.util.*;
import java.util.Collection;
import java.util.LinkedList;

public class ListMethod {
	
	public static void main (String [] args) {
		
		LinkedList list= new LinkedList();
		
		list.add(11);
		list.add("sr");
		list.add(22);
		list.add("dm");
		
		System.out.println(list);
		
		list.add(2, 44);
		System.out.println(list);
		
		System.out.println(list.get(4));
		//list.remove(1);
		//System.out.println(list);
		
		list.set(4, "dilip");
		System.out.println(list);
		
		System.out.println(list.indexOf("sr"));
		
		System.out.println(list.lastIndexOf(22));
		
		System.out.println(list.subList(0, 5));
		
		System.out.println(list.getLast());
	}

}
