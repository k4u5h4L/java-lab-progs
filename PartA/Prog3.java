
import java.util.Scanner;

/*
 * Design a java code to accept a value for ‘n’ and calculate the total number of all
   possible squares in a square matrix.
 */

public class Prog3 {
	int n;
	Prog3() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a number");
		
		n = scan.nextInt();
		
		scan.close();
	}
	
	int findSquares() {
		return (n * (n + 1) * (2 * n + 1)) / 6;
	}
	
	public static void main(String args[]) {
		Prog3 obj = new Prog3();
		
		int number = obj.findSquares();
		
		System.out.println("Sum of ssquares = " + number);
	}
}
