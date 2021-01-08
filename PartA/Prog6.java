
import java.util.Scanner;
import java.util.Arrays;

/*
 * Design a java code to accept 5 strings from the user and print them in
   lexicographical order.
 */

public class Prog6 {
	String[] strs = new String[5];
	
	Prog6() {
		int i;
		Scanner scan = new Scanner(System.in);
		
		for (i = 0; i < 5; i++) {
			System.out.println("Enter string " + (int)((int)i + 1));
			strs[i] = scan.next();
		}
		
		scan.close();
	}
	
	public static void main(String args[]) {
		Prog6 obj = new Prog6();
		Arrays.sort(obj.strs);
		
		System.out.println("Sorted strings:");
		for (String str: obj.strs) {
			System.out.println(str);
		} 
		
	}
}
