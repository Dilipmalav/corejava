package in.com.Set_get_method;

public class Bike {
   String color;
   int prize;
   int average;
   public Bike(String color,int prize,int average) {
	   this.color=color;
	   this.prize=prize;
	   this.average=average;
	   
   }
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public int getPrize() {
	return prize;
}
public void setPrize(int prize) {
	this.prize = prize;
}
public int getAverage() {
	return average;
}
public void setAverage(int average) {
	this.average = average;
}
   
}
