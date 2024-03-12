package myserialization;

import java.io.Serializable;

public class Child extends Base { //implements Serializable
	String str;
	int y;
	static int z;
	transient int a;
	 volatile int b; //static
	float c;
	public Child(String str, int x,int y,int z,int a, int b,float c) {
		this.str = str;
		this.x = x;
		this.y = y;
		this.a = a;
		this.b = b;
		this.c = c;
	}

}
