package in.com.Precticefrz;

import java.util.Comparator;

public class Byphone implements Comparator<Emp1> {

	@Override
	public int compare(Emp1 o1, Emp1 o2) {
		
		return o1.phone-o2.phone;
	}

}
