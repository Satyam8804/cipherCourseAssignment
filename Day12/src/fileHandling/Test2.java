package fileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class Test2 {
	public static void main(String[] args) throws IOException {
		
		//writing Data in file
		
		FileWriter fw = new FileWriter("F:\\JavaTask\\i.txt",true);
		
		//.write() method to write data in a file
		
		fw.write("I am the Earth \n");
		fw.write("I am the Forest Green\n");
		
		fw.flush(); // flush clears the data i the buffer memory and writes into the file
		fw.close();
		System.out.println("File prepared Successfully");
	}

}
