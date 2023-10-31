package in.com.ConditionalStatement;

public class CountAlphabate {
	public static void main(String[] args) {
		
		String name = "dilipmalav@gmail.com";
		int count = 0;
		
		for (int i = 0; i < name.length(); i++) {
			for (char j = 'a'; j<'z'; j++) {
				if(name.charAt(i)==j) {
					count++;
				}
				
			}
			
		}
		if(count>0) {
			System.out.println(count);
		}
	}

}
