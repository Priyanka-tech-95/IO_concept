package bytestream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MyFileInputStream {

	public static void main(String[] args) {
		System.out.println("File Input Stream API....");
		int ch = -1;
		try {
			FileInputStream fis = new FileInputStream("abc.txt");
			System.out.println("Read the file Successfully...");
			while((ch=fis.read()) != -1) 
				System.out.print((char)ch);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
System.out.println("End of main...");
	}

}
