package in.com.Inheritance_level_exercise;

public class Testshapearry {
	public static void main(String[] args) {
		Shape [] s = new Shape [2];
		s[0] = new Rectangle();
		s[1] = new Cricle();
		
		
		Rectangle r = (Rectangle) s[0];
		r.setLength(10);
		r.setWidth(20);
		r.area();
		
		Cricle c = (Cricle) s[1];
		c.setRedius(30);
		c.area();
	}     

}
