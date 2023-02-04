package readingFile;

import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

public class Test0 {
	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("F://JavaTask//i.txt");
		
		BufferedReader br = new BufferedReader(fr);
		
//		String line = br.readLine();
//		System.out.println(line);
//		
//	 line = br.readLine();
//		System.out.println(line);
		
		String line;
		
		// till the time value of line variable is not matching with null 
		// keep running the loop
		while((line=br.readLine())!=null) {
			System.out.println(line);
		}
		
		br.close();
		fr.close();
			
	}

}
