
/*
 * Design a java program to implement multiple inheritance using an interface.
 */

interface First {
	void log1();
}

interface Second {
	void log2();
}

interface Third {
	void log3();
}

public class Prog9 implements First, Second, Third {

	public void log3() {
		System.out.println("log3");
	}

	public void log2() {
		System.out.println("log2");
	}

	public void log1() {
		System.out.println("log1");
	}
	
	public static void main(String args[]) {
		Prog9 obj = new Prog9();
		
		obj.log1();
		obj.log2();
		obj.log3();
	}
}
