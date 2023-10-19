package in.com.Exercise;

public class LargestArray {
	
	public static void main(String[] args) {
		
		int[] arr= {1000,2,3,4,585,900};
		int a=0;
		
		for (int i = 2; i < arr.length; i++) {
			
			if (arr[i]>a) {
				
				a=arr[i];
				
			}
			
		}
		System.out.println(a);
		
	}

}
