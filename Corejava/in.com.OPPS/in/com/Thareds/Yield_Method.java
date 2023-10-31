package in.com.Thareds;

class Thread1 implements Runnable {

	 String name;
	 Thread1(String name){
		 this.name = name;
	 }
	@Override
	public void run() {
		String s = Thread.currentThread().getName();
		for (int i=0; i<10; i++) {
			System.out.println(s+"  "+name);
			Thread.yield();
		}
		
	}
	
}

class Thread2 implements Runnable{
    String name;
    public Thread2(String name) {
    	this.name = name;
    }
	@Override
	public void run() {
		
		String s1 = Thread.currentThread().getName();
		for(int i=0; i<5; i++) {
			System.out.println(s1+" "+name);
			
		}
		
	}
	
}



public class Yield_Method {
	public static void main(String[] args) {
		Runnable r;
		r=new Thread1("rrr");
		Thread t = new Thread(r, "Thread1");
		
		t.start();
		t.getPriority();
		
		r = new Thread2("ddd");
		Thread t1 = new Thread(r, "Thread2");
		
		
		t1.start();
		t1.getPriority();
	}

}








