package fileHandling;

import java.io.File;

public class Test3 {
	public static void main(String[] args) {
		//listing files
		
		File f = new File("F:\\Java");
		String[] files = f.list();
		for(String file:files) {
			System.out.println(file);
		}
	}

}
