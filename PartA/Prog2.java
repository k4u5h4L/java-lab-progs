
import java.util.Scanner;

/*
 *  Design a java program with one method to put even & odd elements of an array
	in 2 separate arrays, and another method to find the transpose of the matrix by
	implementing the concept of method overriding
 */

// Still not complete

class MatrixClass {
	int[][] mat = new int[10][10];
	int m, n;
	
	MatrixClass() {
		int i, j;
		
		Scanner scan1 = new Scanner(System.in);
		
		System.out.println("Enter rows length");
		
		m = scan1.nextInt();
		
		System.out.println("Enter columns length");
		
		n = scan1.nextInt();
		
		System.out.println("Enter matrix:");
		
		for (i = 0; i < m; i++) {
			for (j = 0; j < n; j++) {
				mat[i][j] = scan1.nextInt();
			}
		}
		
		scan1.close();
	}
	
	void compute() {
		int[][] transMat = new int[10][10];
		int i, j;
		
		for (i = 0; i < m; i++) {
			for (j = 0; j < n; j++) {
				transMat[j][i] = mat[i][j];
			}
		}
		
		for (i = 0; i < m; i++) {
			for (j = 0; j < n; j++) {
				System.out.print(transMat[i][j]);
			}
			System.out.print("\n");
		}
	}
}

public class Prog2 extends MatrixClass {
	int[] arr = new int[20];
	int[] odd = new int[20];
	int[] even = new int[20];
	
	Prog2() {
		super();
		
		int i;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter length of array:");
		int n = scan.nextInt();
		
		System.out.println("Enter the array:");
		
		for (i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		scan.close();
	}
	
	void compute() {
		int i;
		int oddIndex = 0, evenIndex = 0;
		
		for (i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				even[evenIndex++] = arr[i];
			} else {
				odd[oddIndex++] = arr[i];
			}
		}
		System.out.println("Odd array:");
		for (i = 0; i < odd.length; i++) {
			System.out.println(odd[i]);
		}
		
		System.out.println("Even array:");
		for (i = 0; i < even.length; i++) {
			System.out.println(even[i]);
		}
	}
	
	public static void main(String args[]) {
		Prog2 obj1 = new Prog2();
//		MatrixClass obj2 = new MatrixClass();
		
		obj1.compute();
		
//		obj2.compute();
	}
}
