package in.com.Examples;

public class AbstractTestplusdiv {
	public static void main(String[] args) {
		
		Plus p = new Plus() {
			
			@Override
			public void multiply() {
				int a = 4;
				int b = 4;
				int mul = 0;
				
				mul = a*b;
				System.out.println("ans multi!!"+mul);
				
			}
		};
		
		p.plus1();
		p.multiply();
		
		
		Divide d = new Divide() {
			
			@Override
			public void mainus() {
				int a = 20;
				int b = 10;
				int mainus = 0;
				
				mainus = a-b;
				System.out.println("minus!!1"+mainus);
				
			}
		};
		d.div();
		d.mainus();
	
		
	}
	
	
}
			
		
	


