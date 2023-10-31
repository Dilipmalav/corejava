package in.com.Thareds;

public class Music_Sleep extends Thread {

	@Override
	public void run() {
		
		for (int i = 0; i < 3; i++) {
			String s = Thread.currentThread().getName();
			System.out.println(s+" "+"music play");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
	}
	public static void main(String[] args) {
		Music_Sleep m = new Music_Sleep();
		m.setName("pop music");
		m.start();
		
		Music_Sleep m1 = new Music_Sleep();
		m1.setName("classical");
		m1.start();
		
		
		
}
}
