import java.util.Scanner;
/*
 * 	Design a java code which accepts a number (which is non-zero and positive)
	from the user and then checks if it is a happy number or not. Implement it using
	nested interface concept
 */
interface GetHappyNumber {
    interface FindIfHappyOrNot {
        void findSum();
    }
}
public class Testing implements GetHappyNumber.FindIfHappyOrNot {
	int sum;
	int n;
	Testing(int num) {
		sum = 0;
		n = num;
	}
	public void findSum() {
		int a;
		while (n > 0) {
			a = (n % 10);
			sum += a * a;
			n /= 10;
		}
		n = sum;
		sum = 0;
	}
    public static void main(String args[]) {
    	Scanner s = new Scanner(System.in);    	
    	System.out.println("Enter number");
    	int n = s.nextInt();
    	Testing obj = new Testing(n);
    	while (obj.n != 1 && obj.n >= 10) {
    		obj.findSum();    		
    	}
    	System.out.println("Happy? : " + (obj.n == 1 ? "Yes" : "No"));
    }
}
