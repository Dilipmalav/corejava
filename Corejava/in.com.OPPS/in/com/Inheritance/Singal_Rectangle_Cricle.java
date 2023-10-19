package in.com.Inheritance;

public class Singal_Rectangle_Cricle {
	public static void main(String[] args) {
		
		Singalleval s = new Singalleval();
		
		s.setColor("white");
		s.setBorderwidth(144);
		
		System.out.println(s.getColor());
		System.out.println(s.getBorderwidth());
		
		
		Rectangle r = new Rectangle();
		
		r.setLenght(55);
		r.setWidth(44);
		r.setColor("red");
		r.setBorderwidth(11);
		
		System.out.println(r.getLenght());
		System.out.println(r.getWidth());
		System.out.println(r.getColor());
		System.out.println(r.getBorderwidth());
		
		Circle c = new Circle();
		
		c.setRadius(45);       
		c.setDaimeter(25);
		c.setLenght(22);
		c.setWidth(23);
		c.setColor("kala");
		c.setBorderwidth(47);
		
		
		System.out.println(c.getRadius());
		System.out.println(c.getDaimeter());
		System.out.println(c.getLenght());
		System.out.println(c.getWidth());
		System.out.println(c.getColor());
		System.out.println(c.getBorderwidth());
		
		
		
	}
	

}
