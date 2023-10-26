package in.com.Comparator;

import java.util.Comparator;

public class Byid implements Comparator<Emp>{

	@Override
	public int compare(Emp o1, Emp o2) {
		
		return o1.id-o2.id;
	}

}
