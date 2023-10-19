package in.com.PrecticeQuestion;

public class maximumno {
	public static void main (String []args) {
		
		int arr [] = {112,99,25,111,100,58,75};
		
		int max = 0;
		
		for (int i = 0; i < arr.length; i++) {
			
		
		if(arr[i]>max) {
			
			max=arr[i];
		}
	}
		System.out.println(max);
}

}
