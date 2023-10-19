package in.com.Inheritance_level_exercise;

public class Cricle extends Rectangle{
	
	public static final double pi = 3.14;
	private int radius;
	
	public void setRedius(int radius) {
		this.radius = radius;
	}
	
	public int getRadius() {
		return radius;
	}
	
	public void area() {
		double Carea = pi*getRadius()*getRadius();
		System.out.println("cricle area"+Carea);
	}

}
