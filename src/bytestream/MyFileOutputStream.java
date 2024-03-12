package bytestream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MyFileOutputStream {

	public static void main(String[] args) {
	System.out.println("File Output Stream API....");
	
	try {
		FileOutputStream fos = new FileOutputStream("abc.txt");
		System.out.println("The file is created Successfully...");
		String str = "India is Best Country I  love India ";
		byte []ch=str.getBytes();
		for (int i=0;i<ch.length;i++) 
			fos.write(ch[i]);
		System.out.println("Write in Success.... ");
	
	} catch (FileNotFoundException e) {
	
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("end of main");
	}

}
