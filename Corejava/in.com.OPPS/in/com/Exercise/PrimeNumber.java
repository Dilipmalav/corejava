package in.com.Exercise;

public class PrimeNumber {
	public static void main(String[] args) {
		
	
	int num = 15;
	int count = 0;
	
	for(int i=2; i<num; i++) {
		if(num%i==0) {
			count++;
			
		}
	}if(count==0) {
		System.out.println("prime num" +num);
	}else {
		System.out.println("not prime num" +num);
	}
	
	
	
}

}
