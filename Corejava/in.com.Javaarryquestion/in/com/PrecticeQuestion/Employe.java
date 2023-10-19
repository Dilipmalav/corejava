package in.com.PrecticeQuestion;

public class Employe {
	
	int e_id;
	String e_name;
	Department d;
	boolean isSpceal=false;
	public Employe(int e_id, String e_name, Department d, boolean isSpceal) {
		super();
		this.e_id = e_id;
		this.e_name = e_name;
		this.d = d;
		this.isSpceal = isSpceal;
	}
	

}
