package in.com.Comparator;

import java.util.Comparator;

public class Byname implements Comparator<Emp> {

	@Override
	public int compare(Emp o1, Emp o2) {
		
		return o1.name.compareTo(o2.name);
	}

}
