package in.com.Precticefrz;

import java.util.Comparator;

public class Byname implements Comparator<Emp1>{

	@Override
	public int compare(Emp1 o1, Emp1 o2) {
		
		return o1.name.compareTo(o2.name);
	}

}
