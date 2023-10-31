package in.com.Thareds;

public class WiththreadTest {
	public static void main(String[] args) {
		
		Withthread w1 = new Withthread("dilip");
		Withthread w2 = new Withthread("sagar");
		
		w1.setPriority(9);
		w2.setPriority(10);
		
		w1.start();
		w2.start();
		
		
	}

}
