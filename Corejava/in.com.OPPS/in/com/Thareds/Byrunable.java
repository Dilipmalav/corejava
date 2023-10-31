package in.com.Thareds;

public class Byrunable implements Runnable {
	
	String name;
	
	public Byrunable(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		for (int i = 0; i <=10; i++) {
			System.out.println(name+" "+i);
			
		}
		
	}
	
	

	}


