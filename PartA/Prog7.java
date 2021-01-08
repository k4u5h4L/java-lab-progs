
import java.util.Scanner;
//import java.util.Arrays;

/*
 * Design a java code for implementing Binary Search, pass array as parameter to
   the method
 */

public class Prog7 {	
	int binarySearch(int arr[], int x) {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
//        	int m = (r + l) / 2;
 
            // Check if x is present at mid
            if (arr[m] == x)
                return m;
 
            // If x greater, ignore left half
            if (arr[m] < x)
                l = m + 1;
 
            // If x is smaller, ignore right half
            else
                r = m - 1;
        }
 
        // if we reach here, then element was not present
        return -1;
    }
	
	public static void main(String args[]) {
		Prog7 obj = new Prog7();
		
		int i;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter length of array:");
		int n = scan.nextInt();
		
		int[] a = new int[n];
		
		System.out.println("Enter array (sorted):");
		for (i = 0; i < n; i++) {
			a[i] = scan.nextInt();
		}
				
		System.out.println("Enter item to be searched:");
		int key = scan.nextInt();
		
		scan.close();
		
//		Arrays.sort(obj.a);
		
		int pos = obj.binarySearch(a, key);
		
		if (pos == -1) 
			System.out.println("Element wasn't found");
		else
			System.out.println("Element was found at position: " + (int)((int)pos + 1));
	}
}
