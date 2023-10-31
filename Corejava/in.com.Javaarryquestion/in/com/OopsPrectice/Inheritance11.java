package in.com.OopsPrectice;

 class InheritanceBike111 extends InheritanceBike {
	
	int price1 ;

	public int getPrice1() {
		return price1;
	}

	public void setPrice1(int price1) {
		this.price1 = price1;
	}
}
  class bike2 extends InheritanceBike111{
	  String color1 ;

	public String getColor1() {
		return color1;
	}

	public void setColor1(String color1) {
		this.color1 = color1;
	}
  }
  
  public class Inheritance11 {
	  
	  public static void main(String[] args) {
		
		InheritanceBike b1 = new InheritanceBike();
		
		b1.setPrice(1000);
		b1.setColor("red");
		
		System.out.println(b1.getPrice());
		System.out.println(b1.getColor());
		
		InheritanceBike111 b2 = new InheritanceBike111();
		
		b2.setPrice1(20000);
		b2.setPrice(30000);
		b2.setColor("color");
		
		System.out.println(b2.getPrice1());
		System.out.println(b2.getPrice());
		System.out.println(b2.getColor());
		
		bike2 b = new bike2();
		
		b.setPrice(40000);
		b.setColor("ddd");
		b.setPrice1(50000);
		b.setColor1("aaa");
		
		System.out.println(b.getPrice());
		System.out.println(b.getColor());
		System.out.println(b.getPrice1());
		System.out.println(b.getColor1());
	}
	

}
