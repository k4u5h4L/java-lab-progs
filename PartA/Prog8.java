
public class Prog8 {
	void testMethod() {
		System.out.println("testMethod");
	}
	
	void testMethod(int i) {
		System.out.println("testMethod one arg(int): " + i);
	}
	
	void testMethod(int i, int j) {
		System.out.println("testMethod two args(int):" + i + " " + j);
	}
	
	void testMethod(String str) {
		System.out.println("testMethod one arg(String): " + str);
	}
	
	public static void main(String args[]) {
		Prog8 obj = new Prog8();
		
		obj.testMethod();
		obj.testMethod(1);
		obj.testMethod(1, 2);
		obj.testMethod("Ujwal is CEO");
;	}
}
