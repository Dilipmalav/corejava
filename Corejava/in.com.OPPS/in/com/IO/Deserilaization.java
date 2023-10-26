package in.com.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

public class Deserilaization {
	public static void main(String[] args) throws Exception {
		
		FileInputStream in = new FileInputStream("C:\\Users\\acer\\Desktop\\javaIO\\obj.txt");
		
		ObjectInputStream out = new ObjectInputStream(in);
		
		Serilezationmarks m = (Serilezationmarks) out.readObject();
		
		System.out.println("id="+m.id);
		System.out.println("name="+m.name);
		System.out.println("java="+m.java);
		System.out.println("python="+m.python);
		System.out.println("html="+m.html);
		System.out.println("total="+m.total);
	}

}
