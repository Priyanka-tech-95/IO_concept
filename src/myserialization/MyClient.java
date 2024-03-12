package myserialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class MyClient {

	public static void main(String[] args) {
		System.out.println("DeSerialized the object");
		
		try {
			FileInputStream fis = new FileInputStream("empobj.txt");
			ObjectInputStream objiStream = new ObjectInputStream(fis);
			Child c1 =(Child)objiStream.readObject();
			
			System.out.println("Str nonstatic           "+c1.str);
			System.out.println("Base class instance x   "+c1.x);
			System.out.println("Child class instance y  "+c1.y);
			System.out.println("static z                "+c1.z);
			System.out.println(" transient  a           "+c1.a);
			System.out.println("volatile b              "+c1.b);
			System.out.println("float nonstatic         "+c1.c);
		  objiStream.close();
		  
		} catch (FileNotFoundException e) {
		
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
