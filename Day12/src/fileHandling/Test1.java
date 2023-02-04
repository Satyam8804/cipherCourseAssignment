package fileHandling;

import java.io.File;

public class Test1 {
	
	// Checking if File Exists and Fetching File Details!!
	
	public static void main(String[] args) {
		File f = new File("D:\\myTextFile.txt");
		
		//using exist() to check if file exists or not
		
		if(f.exists()) {
			System.out.println("Printing File Details");
			System.out.println("---------------------");
			
			System.out.println("File Name : "+f.getName());
			System.out.println("File Size : "+f.length());
			System.out.println("File Path : "+f.getAbsolutePath());
			System.out.println("is File Readable ? "+f.canRead());
			System.out.println("is File writable ? "+f.canWrite());
			
			System.out.println("-------------");
		}
		
		//Creating directory in java
		
		File f1= new File("D:\\avengers");
		f1.mkdir();
		
		
	}

}
