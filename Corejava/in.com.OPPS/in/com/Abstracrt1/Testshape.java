package in.com.Abstracrt1;

public class Testshape {
	public static void main(String[] args) {
		
		Cricle c = new Cricle() {
			
			@Override
			public void area() {
				System.out.println("cricle area!!");
				
			}
		};
		
		
		c.area();
		
		Shape s = new Shape() {
			
			@Override
			public void deppu() {
				System.out.println("shape area");
				
			}
		};
		s.hello();
		s.deppu();
		
		Rectangle r = new Rectangle();
		r.area();
		r.hello();
		r.deppu();
	
	}	
}
	


      




