package in.com.Map;

import java.util.HashMap;



public class Stu_cou_main {
	public static void main(String[] args) {
		
		Student1 s = new Student1(11, "dilip", "jhalawar");
		Student1 s1 = new Student1(22, "ram", "indore");
		Student1 s2 = new Student1(33, "rahul", "bhopal");
		
		Course1 c = new Course1(44, "java", 4000);
		Course1 c1 = new Course1(55, "core", 5000);
		
		
		HashMap<Student1, Course1> hm = new HashMap<>();
		hm.put(s, c);
		hm.put(s1, c1);
		hm.put(s2, c1);
		
		Set<Entry<Student1,Course1>>set = hm.entrySet();
		
		for(Entry<Student1,Course1>map:set) {
			
			
			
		}
		
		
		}
		
	}


