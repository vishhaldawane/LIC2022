

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReadingTest {
	public static void main(String[] args) {
	
		try {
			System.out.println("Trying to open the file in read mode...");
			FileInputStream fin = new FileInputStream("Lic.txt");
			System.out.println("File is ready...");
			
			
			byte theLetter = (byte) fin.read(); //returns int
			
			while(theLetter != -1) // -1 means end of file
			{
				System.out.print((char)theLetter);
				theLetter = (byte) fin.read();
				
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			fin.close();
			System.out.println("File is closed...");
		
		} catch (FileNotFoundException e) {
			
			System.out.println("File not found...");
			
		} catch (IOException e) {
			System.out.println("Some IO problem...");
		}
		
		
	}
}
