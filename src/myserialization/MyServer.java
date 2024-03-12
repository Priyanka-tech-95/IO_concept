package myserialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class MyServer {

	public static void main(String[] args) {
	System.out.println("Serialized the object Impl the Base class as Serializable");
	
	try {
		FileOutputStream fos = new FileOutputStream("empobj.txt");
		ObjectOutputStream objoStream = new ObjectOutputStream(fos);
		
		Child c1 = new Child("Good ", 10, 20, 30, 40, 50,56.67f);
		objoStream.writeObject(c1);
		objoStream.flush();
		objoStream.close();
	} catch (FileNotFoundException e) {
		
		e.printStackTrace();
	} catch (IOException e) {
		
		e.printStackTrace();
	}
	}

}
