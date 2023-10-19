package in.com.PrecticeQuestion;

import java.util.Scanner;

public class CourseStudent_main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	     Student1 []s=new Student1[3];
	     for (int i = 0; i < s.length; i++) {
	    	 System.out.println("enter the student id..");
	    	 int s_id = sc.nextInt();
	    	 System.out.println("enter the student name..");
	    	 String s_name=sc.next();
	    	 System.out.println("enter the course name..");
	    	 String c_name=sc.next();
	    	 System.out.println("enter the course fee..");
	    	 int c_fee=sc.nextInt();
	    	 Cours2 c=new Cours2(c_name, c_fee);
	    	 s[i]=new Student1(s_id, s_name, false, c);
			
		}
//	     for (int i = 0; i < s.length; i++) {
//	    	 if(s[i].c.c_fee>1500) {
//	    		 s[i].isSpeceal=true;
//	    		 System.out.println("you are special");
//	    	 }
//	    	 else {
//	    		 System.out.println("your not specail");
//	    	 }
//			
//		}
		for (int i = 0; i < s.length; i++) {
			if(s[i].c.c_name.equalsIgnoreCase("java")) {
				s[i].isSpeceal=true;
				System.out.println("course are aveleble");
			}
			else if(s[i].c.c_name.equalsIgnoreCase("php")) {
				s[i].isSpeceal=true;
				System.out.println("course are aveleble");
			}
			else if(s[i].c.c_name.equalsIgnoreCase("python")) {
				s[i].isSpeceal=true;
				System.out.println("course are aveleble");
	        }
			else {
				System.out.println("course not aveleble");
			}

		}
		
	}
}
	
