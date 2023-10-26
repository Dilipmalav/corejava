package in.com.Collection;

import java.util.Comparator;

public class TestbyID implements Comparator<Emp1>{

	@Override
	public int compare(Emp1 o1, Emp1 o2) {
		
		return o1.id-o2.id;
	}
	

}
