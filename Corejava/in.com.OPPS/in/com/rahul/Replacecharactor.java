package in.com.rahul;

public class Replacecharactor {
	public static void main(String[] args) {
		
		String name = "dilip malav";
		char ch[] = name.toCharArray();
		for(int i=0; i<ch.length; i++) {
			if(ch[i]=='i'||ch[i]=='a'||ch[i]=='l') {
				ch[i]='@';
			}
		}
		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i]);
		}
	}

}
