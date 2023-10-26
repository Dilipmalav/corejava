package in.com.Precticefrz;

import java.util.ArrayList;
import java.util.Iterator;



public class Prectice1 {
	int id;
	String name;
	String phone;
	
	public Prectice1(int id,String name,String phone) {
		this.id = id;
		this.name = name;
		this.phone = phone;
		
	}
	@Override
	public String toString() {
		
		return id+" "+name+" "+phone;
	}


 public static void main(String[] args) {
		
		 
		 Prectice1 p1 = new Prectice1(11, "sagar", "12345");
		 Prectice1 p2 = new Prectice1(12, "dilip", "32165");
		 
		 ArrayList ar = new ArrayList();
		 ar.add(p1);
		 ar.add(p2);
		 
		 for(int i=0; i<ar.size(); i++) {
			 
			Prectice1 e = (Prectice1) ar.get(i);
			System.out.println(e);
		 }
		 
		 for(Object obj : ar) {
			 Prectice1 r = (Prectice1) obj;
			 System.out.println(r);
		 }
		 
		 Iterator it = ar.iterator();
		 while(it.hasNext()) {
			 Prectice1 a = (Prectice1) it.next();
			 System.out.println(a);
		 }
		 
		 
		 
}
	
}
