package in.com.IO;

import java.io.File;

public class puri_detail_file {
	public static void main(String[] args) {
		File f = new File("C:\\Users\\acer\\Desktop\\javaIO\\malav.txt");
		
		if(f.exists()) {
			
			System.out.println("file name is!!!"+f.getName());
			System.out.println("file path!!!"+f.getPath());
			System.out.println("file length!!!"+f.length());
			System.out.println("file perent....."+f.getParent());
			System.out.println("file space......"+f.getFreeSpace());
		}
	}

}
