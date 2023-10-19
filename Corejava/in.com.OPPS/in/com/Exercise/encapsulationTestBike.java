package in.com.Exercise;

public class encapsulationTestBike {
	public static void main (String [] args) {
		
		encapsulationBike b = new encapsulationBike();
		
		
		b.setName("hero");
		b.setPrice(70000);
		b.setAuthorname("dilip");
		
		System.out.println(b.getName());
		System.out.println(b.getPrice());
		System.out.println(b.getAuthorname());
	}

}
