package in.com.Map;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Finderage {
	public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        int ages = 18;
		String name;
		System.out.println("enter the age....");
		System.out.println("enter name....");
		
		HashMap<Integer, String> hm = new HashMap<>();
		HashMap<String, String> hm2 = new HashMap<>();
		hm.put(sc.nextInt(), sc.next());
		hm.put(sc.nextInt(), sc.next());
		hm.put(sc.nextInt(), sc.next());
		
		Set <Entry<Integer,String>> set = hm.entrySet();
		for(Entry<Integer,String>map:set) {
			Integer i = map.getKey();
			String s = map.getValue();
			if(i>ages) {
				 name = "you are youth";
				 
				 hm2.put(s, name);
			}
			else {
				name ="you are under 18";
				hm2.put(s, name);
				
			}
			
		}
		Set<Entry<String,String>> set1 = hm2.entrySet();
		for(Entry<String, String> map1:set1) {
			String s1 = map1.getKey();
			String s2 = map1.getValue();
			System.out.println(s1+" "+s2);
		}
		
		
	}

}
