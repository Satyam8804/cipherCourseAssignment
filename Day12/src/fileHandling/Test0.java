package fileHandling;
import java.io.File;
import java.io.IOException;

public class Test0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Lab 1 : Creating Empty Files in Java
		
		File f = new File("D:\\myTextFile.txt");
		
		// for creating file we call createNewFile() Method
		
		try {
			f.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("File Created Successfully");
	}

}
