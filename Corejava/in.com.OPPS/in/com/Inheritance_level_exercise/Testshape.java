package in.com.Inheritance_level_exercise;

public class Testshape{
	public static void main(String[] args) {
		
		Shape s = new Shape();
		
		s.setcolor("red");
		s.setBorderwidth(22);
	    s.area();
		
	    Rectangle r = new Rectangle();
	    
	    r.setLength(55);
	    r.setWidth(66);
	    r.setcolor("black");
	    r.setBorderwidth(88);
	    r.area();
	    
	    Cricle c = new Cricle();
	    
	    c.setRedius(10);
	    c.setcolor("blue");
	    c.setBorderwidth(33);
	    c.setLength(44);
	    c.setWidth(66);
	    c.area();
	}


}
