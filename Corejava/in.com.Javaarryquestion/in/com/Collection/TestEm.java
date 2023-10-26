package in.com.Collection;

import java.util.ArrayList;
import java.util.Collections;

public class TestEm {
	public static void main(String[] args) {
		ArrayList<Em> e1=new ArrayList<Em>();
		
		e1.add(new Em(1, "ram", "45665"));
		e1.add(new Em(2, "sagar", "3468654"));
		e1.add(new Em(5, "rahul", "366843"));
		e1.add(new Em(4, "dilip", "351653"));
		
		System.out.println(e1);
		
		Collections.sort(e1);
		System.out.println(e1);
		
	}

}
