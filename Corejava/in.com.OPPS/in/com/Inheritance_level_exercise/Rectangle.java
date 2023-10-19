package in.com.Inheritance_level_exercise;

public class Rectangle extends Shape{
	private int lenght;
	private int width;
	
	public void setLength(int length) {
		this.lenght = length;
	}
    
	public int getLength() {
		return lenght;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	public int getWidth() {
		return width;
	}
	
	public void area(){
		
		int Rarea = getLength()* getWidth();
		System.out.println("Rectangle area"+Rarea);
	}
}
