
import java.util.Scanner;

/*
   Design a java Program to add two matrix using multi-dimensional arrays, pass
   two dimensional array as parameter to the method
*/

public class Prog1 {
	int[][] a = new int[10][10];
	int[][] b = new int[10][10];
	int m, n;
	
	
	Prog1() {
		int i, j;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter rows length");
		
		m = scan.nextInt();
		
		System.out.println("Enter columns length");
		
		n = scan.nextInt();
		
		System.out.println("Enter first matrix:");
		
		for (i = 0; i < m; i++) {
			for (j = 0; j < n; j++) {
				a[i][j] = scan.nextInt();
			}
		}
		
		System.out.println("Enter second matrix:");
		
		for (i = 0; i < m; i++) {
			for (j = 0; j < n; j++) {
				b[i][j] = scan.nextInt();
			}
		}
		
		scan.close();
	}
	
	int[][] addMatrix(int[][] a, int [][] b) {
		int[][] c = new int[10][10];
		int i, j;
		
		for (i = 0; i < m; i++) {
			for (j = 0; j < n; j++) {
				c[i][j] = a[i][j] + b[i][j];
			}
		}
		
		return c;
	}
	
	
	public static void main(String args[]) {
		int i, j;
		Prog1 obj = new Prog1();
		
		int[][] sum = obj.addMatrix(obj.a, obj.b);
		
		System.out.println("Sum is:");
		
		for (i = 0; i < obj.m; i++) {
			for (j = 0; j < obj.n; j++) {
				System.out.print(sum[i][j] + "\t");
			}
			System.out.print("\n");
		}
		
	} 
}
