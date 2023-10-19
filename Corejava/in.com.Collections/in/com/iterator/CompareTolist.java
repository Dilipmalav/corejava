package in.com.iterator;
public class CompareTolist {
	int id;
	String name;
	String address;
	
	public CompareTolist(int id,String name,String address) {
		this.id = id;
		this.name = name;
		this.address = address;
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof CompareTolist)) {
			return false;	
		}
		CompareTolist c = (CompareTolist) obj;
		boolean b = this.id == c.id && this.name == c.name && this.address == c.address;
		return b;
	}
	@Override
	public int hashCode() {
		String str = id+name+address;
		return str.hashCode();
	}
	
	
			
		

}
