
import java.util.Scanner;

/*
 * Design a code for a simple calculator which takes input from the user and also
   details of what operation must be performed. The user can input only 2 operands
 */

public class Prog4 {
	int op1, op2;
	char ch;
	
	Prog4() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter first operand:");
		op1 = scan.nextInt();
		
		System.out.println("Enter second operand:");
		op2 = scan.nextInt();
		
		System.out.println("Enter operation:");
		ch = scan.next().charAt(0);
	}
	
	float compute() {
		float result = 0;
		
		switch(ch) {
			case '+': 	result = op1 + op2;
						break;
			case '-':	result = op1 - op2;
						break;
			case '*':	result = op1 * op2;
						break;
			case '/':	result = op1 / op2;
						break;
			default: 	System.out.println("Enter +, -, * or /");
						break;
		}
		
		return result;
	}
	
	public static void main(String args[]) {
		Prog4 obj = new Prog4();
		
		float res = obj.compute();
		
		System.out.println("Result: " + res);
	}
}
