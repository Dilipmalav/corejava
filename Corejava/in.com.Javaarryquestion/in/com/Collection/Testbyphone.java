package in.com.Collection;

import java.util.Comparator;

public class Testbyphone implements Comparator<Emp1> {

	@Override
	public int compare(Emp1 o1, Emp1 o2) {
		
		return o1.phone.compareTo(o2.phone);
	}

}
