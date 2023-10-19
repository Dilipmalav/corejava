package in.com.Interface;

public class Businessman implements Richman,Socialwork{
	
	public static void main(String[] args) {
		Businessman b = new Businessman();
		b.hardwork();
		b.earnmoney();
		b.donation();
		b.helpOther();
		b.party();
	}
	@Override
	public void helpOther() {
		System.out.println("help other people");
		
	}

	@Override
	public void hardwork() {
		System.out.println("work hard");
		
	}

	@Override
	public void earnmoney() {
		System.out.println("richman eran money");
		
	}

	@Override
	public void donation() {
		System.out.println("donation richman");
		
	}

	@Override
	public void party() {
		System.out.println("rich man party");
		
	}
	
}
