package in.com.Exercise;

public class Avragecount {
	
	public static void main(String[] args) {
		
		int n=20;
		int sum=0;
		int count=0;
		int avg;
		
		
		for (int i = 1; i <=n; i++) {
			
//			if (i%2==0) {
				
				sum=sum+i;
				count++;
				
				
				
			}
			
//		}
		
		avg=sum/count;
		
		
		System.out.println(avg);
		
		
	}
	
	
	

}
