package in.com.Thareds;

public class ByrunableTest  {
	public static void main(String[] args) {
		
		Thread t1 = new Thread(new Byrunable("deepu"));
		Thread t2 = new Thread(new Byrunable("malav"));
		
		t1.setPriority(10);
		t2.setPriority(2);
		
		//t1.start();
		//t2.start();
		
		t1.run();
		t2.run();
	}

}
