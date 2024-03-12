package bytestream;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MyDataInputStream {

	public static void main(String[] args) {
	System.out.println("Data Out Put Stream API....");
	String str = " ";
	try {
		FileInputStream fis = new FileInputStream("Priya.txt");
		DataInputStream dis = new DataInputStream(fis);
		
		while ((str=dis.readLine())!=null){
			System.out.println("  "+str);
		}
		dis.close();
	} catch (IOException e) {
		e.printStackTrace();
	}
	System.out.println("End of main  ");
	}

}
