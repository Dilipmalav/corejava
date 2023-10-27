package in.com.OopsTest;

 class InheritanceBike111 extends InheritanceBike {
	
	int price1 = 100000;
}
  class bike2 extends InheritanceBike111{
	  String color1 = "red";
  }
  
  public class Inheritance11 {
	  
	  public static void main(String[] args) {
		
		InheritanceBike b1 = new InheritanceBike();
		
		System.out.println(b1.color);
		System.out.println(b1.price);
		
		InheritanceBike111 b2 = new InheritanceBike111();
		
		System.out.println(b2.price1);
		System.out.println(b2.price);
		System.out.println(b2.color);
		
		bike2 b = new bike2();
		
		System.out.println(b.color1);
		System.out.println(b.price);
		System.out.println(b.price1);
		System.out.println(b.color);
	}
	

}
