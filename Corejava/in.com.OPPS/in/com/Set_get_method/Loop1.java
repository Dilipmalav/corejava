package in.com.Set_get_method;

public class Loop1 {
public static void main(String[] args) {
	
	
	int count = 0;
	for(int a = 1; a<=11; a++) {
	    count =0;
		for(int b=1;b<=a; b++) {
			if(a%b==0) {
				
				count++;
			}
		}if(count==2) {
			System.out.println(a);
		}

	}	

}
	
}