package in.com.Thareds;

class Passport implements Runnable{
	Thread t;
	
	public Passport() throws InterruptedException {
		t=new Thread(this,"Passport");
		t.start();
		t.join();
		
	}

	@Override
	public void run() {
		System.out.println("plz varify your document...");
		
	}
}

class Check implements Runnable{
	String name;
	String loction;
	int phoneno;
	int aadhar;
	public Check(String name, String loction, int phoneno, int aadhar) throws InterruptedException {
		Thread t;
		this.name = name;
		this.loction = loction;
		this.phoneno = phoneno;
		this.aadhar = aadhar;
		t=new Thread(this,"Check");
		t.start();
		t.join();
	}
	@Override
	public void run() {
		System.out.println("please wait verify document");
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
		  e.printStackTrace();	
		}
		System.out.println(name+" "+"name is..."+name);
		System.out.println(name+" loction is..."+loction);
		System.out.println(name+" phone no is..."+phoneno);
		System.out.println(name+" aadhar no is..."+aadhar);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e ) {
			e.printStackTrace();
		}
		System.out.println("your document is verified...");
	}
}
class done implements Runnable{
	Thread t;
	public done() throws InterruptedException {
		t=new Thread(this,"done");
		t.start();
		t.join();
	}
	@Override
	public void run() {
		System.out.println("document verification is done");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("your passport verification is done");
		
	}
}




public class Passport_Verification {
	public static void main(String[] args) throws InterruptedException {
		Passport p = new Passport();
		Check c=new Check("dilip", "jhalawar_326001", 1425367896, 252521533);
		done d = new done();
		
	}

}
