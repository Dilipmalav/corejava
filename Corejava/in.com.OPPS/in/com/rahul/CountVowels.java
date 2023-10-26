package in.com.rahul;

public class CountVowels {
	public static void main(String[] args) {
		String s = "passage through a";
		
		char ch[] = s.toCharArray();
		int count = 0;
		int vcount = 0;
		
		for(int i = 0; i< ch.length; i++) {
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u') {
				vcount++;
			}
			else if(ch[i]>'a'||ch[i]<'z') {
				count++;
			}
			}
			System.out.println(vcount);
			System.out.println(count);
		}
		
	}


