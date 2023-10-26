package in.com.IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serilaization {
	public static void main(String[] args) throws IOException {
		
		FileOutputStream in = new FileOutputStream("C:\\Users\\acer\\Desktop\\javaIO\\obj.txt");
		
		ObjectOutputStream out = new ObjectOutputStream(in);
		
		Serilezationmarks m = new Serilezationmarks();
		m.id = 1;
		m.name = "dm";
		m.java = 74;
		m.python = 77;
		m.html = 85;
		
		m.total = m.java + m.python + m.html;
		
		out.writeObject(m);
		in.close();
		out.close();
		
		System.out.println("obj converted into bytestream");
	}

}
