package in.com.Thareds;

public class Withthread extends Thread{
        String name;
        
        public Withthread(String name) {
			this.name = name;
		}
        
        @Override
        public void run() {
            for (int i = 0; i <=10; i++) {
            	System.out.println(name+" "+i);
				
			}
        
        }
}
