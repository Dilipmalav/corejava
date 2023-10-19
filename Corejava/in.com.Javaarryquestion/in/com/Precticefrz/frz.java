package in.com.Precticefrz;

public class frz {
	
	public static void main (String [] args) {
		
		int arr [] = {22,32,43,44,55};
		
		int max = 0;
		
		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i]>max) {
				
				max = arr[i];
			}
			
		}
		System.out.println(max);
	}

}
