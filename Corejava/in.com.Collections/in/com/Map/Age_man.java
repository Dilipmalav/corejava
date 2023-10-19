package in.com.Map;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

public class Age_man {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the age....");
		System.out.println("enter name....");
		
		HashMap<Integer, String> hm = new HashMap<>();
		hm.put(sc.nextInt(), sc.next());
		hm.put(sc.nextInt(), sc.next());
		hm.put(sc.nextInt(), sc.next());
		
		Set <Entry<Integer,String>> set = hm.entrySet();
		for(in.com.Map.Entry<Integer,String>map:set) {
			
		}
		
	}

}
