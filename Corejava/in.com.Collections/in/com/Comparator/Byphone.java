package in.com.Comparator;

import java.util.Comparator;

public class Byphone implements Comparator<Emp>{

	@Override
	public int compare(Emp o1, Emp o2) {
		// TODO Auto-generated method stub
		return o1.phone-o2.phone;
	}

}
