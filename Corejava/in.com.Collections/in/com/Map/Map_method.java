package in.com.Map;

import java.util.HashMap;
import java.util.Map;

public class Map_method {
public static void main(String[] args) {
	   
	   Map<String, Integer> num = new HashMap<String, Integer>();
	   
	   num.put("one", 1);
	   num.put("two", 2);
	   num.put("three", 3);
	   num.put("four", 4);
	   num.put("five", 5);
	   
	  // num.clear();
	   //System.out.println(num);
	   
	   
	   
	   System.out.println(num.containsKey("one")); // true and false 
	   System.out.println(num.containsValue(3));  // return true and false
	   
	   System.out.println(num.entrySet());  // all print karta h
	   System.out.println(num.get("one")); // sath wala pair print krta h 
	   
	   System.out.println(num.isEmpty()); // return true and false
	   System.out.println(num.keySet());  // only return keys
	   
	   num.put("six", 6);
	   System.out.println(num); // add the element
	   
	   num.remove("one", 1);
	   System.out.println(num); // same work
	   
	   num.remove("two");
	   System.out.println(num); // remove only percent element
	   
	   System.out.println(num.size()); // give the size 
	   
	   System.out.println(num.values());  // only give value
	   
	   
}
}
