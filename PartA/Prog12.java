
import java.util.Scanner;

/*
 * 	Design a java code which accepts a number (which is non-zero and positive)
	from the user and then checks if it is a happy number or not. Implement it using
	nested interface concept
 */
 
interface GetHappyNumber {
    interface FindIfHappyOrNot {
        void findSum();
        boolean checkIfHappy();
    }
}
 
public class Prog12 implements GetHappyNumber.FindIfHappyOrNot {
    int[] digits = new int[20];
    int sum = 0;
 
    void getDigits(int n) {
        int m, a, i = 1, counter = 0;
        m = n;
//        while(n > 0) {
//            n = n / 10;
//        }
        while(m > 0) {
            a = m % 10;
            digits[counter++] = a;
            m = m / 10;
        }
    }
 
    public boolean checkIfHappy() {
        if (sum == 1) {
            return true;
        } else {
            return false;
        }
    }
 
    public void findSum() {
        int i; 
        sum = 0;
        for (i = 0; i < digits.length; i++) {
            sum += (digits[i] * digits[i]);
            digits[i] = 0;
        }
    }
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
 
        System.out.println("Enter a number:");
 
        int num = s.nextInt();
 
        if (num < 0) {
            System.out.println("Please enter a number greater than 1");
            System.exit(0);
        }
 
        int i;
 
        Prog12 obj = new Prog12();
 
        obj.getDigits(num);
        obj.findSum();
 
        while (!obj.checkIfHappy() && obj.sum >= 10) {
            obj.getDigits(obj.sum);
            obj.findSum();
        }
 
        // System.out.println("Sum: " + obj.sum);
        System.out.println("Happy? : " + obj.checkIfHappy());
    }
}