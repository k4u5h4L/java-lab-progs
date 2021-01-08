
import java.util.Scanner;

/*
 * 	Design a code to print a pyramid based on level entered by the user
	Enter the number of levels for the number pyramid : 6
					          1 
					        2 3 2 
					      3 4 5 4 3 
					    4 5 6 7 6 5 4 
					  5 6 7 8 9 8 7 6 5 
					6 7 8 9 10 11 10 9 8 7 6
 */

class Prog10 {
	void printNos(int n) {
		int i, j;
		int printer;
		
		for (i = 1; i <= n; i++) {
			printer = i;
			for (j = 1; j <= n-i; j++) {
				System.out.print("  ");				
			}
			
			for (j = 1; j <= (i * 2 - 1); j++) {
				if (j < i) {
					System.out.print(printer++);				
				} else {
					System.out.print(printer--);
				}
				System.out.print(" ");
			}
			
			System.out.println("");
		}
	}
    public static void main(String args[]) {

    	Scanner s = new Scanner(System.in);

        System.out.print("Enter the number of levels for the number pyramid: ");
        
        int num = s.nextInt();
        s.close();
        Prog10 obj = new Prog10();
        obj.printNos(num);
    }
}