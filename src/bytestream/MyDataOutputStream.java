package bytestream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class MyDataOutputStream {

	public static void main(String[] args) {
	System.out.println("Data Out Put Stream API...");
	String str =" ";
	DataInputStream dis = new DataInputStream(System.in);
	try {
		FileOutputStream fos = new FileOutputStream("Priya.txt");
		//DataOutputStream dos = new DataOutputStream(fos);
		PrintStream ps = new PrintStream(fos);
		while(!str.equals("stop")) {
			System.out.println("Enter a String :=>   ");
			str = dis.readLine();
			
			//dos.writeChars(str);
			//dos.writeBytes(str);
			//dos.writeUTF(str);
			//dos.flush();
			ps.println(str);
		
			
		}
		//dos.close();
		fos.close();
		dis.close();
		ps.close();
		
	} catch (FileNotFoundException e) {
		
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
