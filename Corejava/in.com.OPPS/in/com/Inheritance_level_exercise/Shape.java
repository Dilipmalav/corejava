package in.com.Inheritance_level_exercise;

public class Shape {
	
	private String color ;
	private int borderwidth;
	
	public void setcolor(String color) {
		this.color = color;
	}
	
	public String getcolor() {
	    return color;	
	}
    
	public void setBorderwidth(int borderwidth) {
		this.borderwidth = borderwidth;
	}
	
	public int getBorderwidth() {
		return borderwidth;
	}

      
    public void area() {
    	System.out.println("this is area method:");
    	
    }
}




