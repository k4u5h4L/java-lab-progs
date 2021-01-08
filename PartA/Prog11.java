
import java.util.Scanner;

/*
 * Write a Java program to find digit sum two digit number until the digit sum is
   less than 10.
*/

public class Prog11 {
	int n;
	int sum;
	
	Prog11() {
		Scanner scan = new Scanner(System.in);
		sum = 0;
		System.out.println("Enter a two digit number:");
		n = scan.nextInt();
		
		int temp = n / 100;
		
		if (temp != 0) {
			System.out.println("It was not a two digit number. Shutting down...");
			System.exit(0);
		}
	}
	
	int getSum() {
		while (n > 0) {
			sum += n % 10;
			n = n / 10;
		}
		
		n = sum;
		sum = 0;
		return n;
	}
	
	public static void main(String args[]) {
		Prog11 obj = new Prog11();
		int sum = 0;
		
		while (obj.n > 9) {
			sum = obj.getSum();
		}
		
		System.out.println("Sum of digit is: " + sum);
	}
}
