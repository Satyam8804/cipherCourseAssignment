package fileHandling;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int fileCounter = sc.nextInt();
		String basePath = "F:\\JavaTask\\";
		String fileName = "myFile";
		String fileType = "txt";
		
		for(int i=0;i<fileCounter;i++) {
			File f1 = new File(basePath + fileName + fileCounter+"."+fileType);
			
			if(!f1.exists()) {
				try {
					f1.createNewFile();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else {
				System.out.println("File exist");
			}
		}
		
		
	}
}
