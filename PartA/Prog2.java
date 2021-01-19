
import java.util.Scanner;

/*
 *  Design a java program with one method to put even & odd elements of an array
	in 2 separate arrays, and another method to find the transpose of the matrix by
	implementing the concept of method overriding
 */

class mat
{
	int a[][] = new int[10][10];
	int m,n;
	
	public void compute()
	{
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the row size");
		int m = s.nextInt();
		System.out.println("Enter the column size");
		int n = s.nextInt();
		int[][] tmat = new int[n][m];
		System.out.println("Enter the values for the matrix");
		for(int i=0; i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				a[i][j] = s.nextInt();
			}
		}
		
		for(int i=0; i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				tmat[j][i] = a[i][j];
			}
		}
		System.out.println("The transpose is");
		for(int i=0; i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				System.out.printf(tmat[i][j]+"\t");	
			}
			System.out.println("");
		}

	}
	
}

class arr extends mat
{
	int a[] = new int[10];
	int size;
	
	public void compute()
	{
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter lenght of array");
		int size = s.nextInt();
		System.out.println("Enter the values of the array");
		for(int i=0;i<size;i++)
			a[i] = s.nextInt();
		
		
		int en=0;
		int on=0;
		int e[] = new int[size];
		int o[] = new int[size];
		
		for(int i=0;i<size;i++)
		{
			if(a[i]%2==0)
			{
				e[en] = a[i];
				en++;
			}
			else if(a[i]%2!=0)
			{
				o[on] = a[i];
				on++;
			}
				
		}
		System.out.println("The array of even elements is:");
		for(int i=0;i<en;i++)
		{
			System.out.println(e[i] + "\t");
		}
		System.out.println("The array of odd elements is:");
		for(int i=0;i<on;i++)
		{
			System.out.println(o[i] + "\t");
		}
	}
}
public class Prog2
{
	
	public static void main(String[] args)
	{
		int choice;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Choice\n1.Array\n2.Transpose");
		choice = s.nextInt();
		switch(choice)
		{
			case 1: arr obj1 = new arr();
					obj1.compute();
					break;
					
			case 2: mat obj2 = new mat();
					obj2.compute();
					break;
							
		}
	}
}
