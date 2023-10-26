package in.com.Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Itrator1 {
	int id;
	String name;
	String address;
	
	public Itrator1 (int id,String name,String address) {
		this.id = id;
		this.address = address;
		this.name = name;
	}
	@Override
	public String toString() {
		
		return id+" "+name+" "+address;
	}
	
	public static void main(String[] args) {
		
		Itrator1 a1 = new Itrator1(111, "ram", "rajsthan");
		Itrator1 a2 = new Itrator1(112, "rahul", "jhalawar");
		
		ArrayList ar = new ArrayList();
		ar.add(a1);
		ar.add(a2);
		
		
//		Itrator1 e = (Itrator1) ar.get(0);
//		System.out.println(e);
//		System.out.println(e.id);
//		System.out.println(e.name);
//		System.out.println(e.address);
		
		
//		for(int i=0; i<ar.size(); i++) {
//			
//			Itrator1 d = (Itrator1) ar.get(i);
//			System.out.println(d);
//		}
		
		
//		for(Object obj : ar ) {
//			Itrator1 s = (Itrator1) obj;
//			System.out.println(s);
//		}
		
		Iterator it = ar.iterator();
		while(it.hasNext()) {
			
			Itrator1 z = (Itrator1) it.next();
			System.out.println(z);
		}
		
		

	}

}
