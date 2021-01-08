
import java.util.Scanner;

/*
 * 	Design an java code which accepts a Room Number, Mobile Number and Name
	of the Customer and generate a 6 Character Unique Password
 */

public class Prog13 {
    int roomNo, mobileNo;
    String name;

    char specialChars[] = {'!', '@', '#', '$', '%', '^', '&', '*', '(', ')'};

    Prog13() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter room no.");
        roomNo = scan.nextInt();

        System.out.println("Enter mobile no.");
        mobileNo = scan.nextInt();

        System.out.println("Enter name");
        name = scan.next();
        
        scan.close();
    }
    
    char lastLetter(String str) {
        return str.charAt(str.length() - 1);
    }
    char firstLetter(String str) {
        return str.charAt(0);
    }

    char specialCharArrayRet(int index) {
        return specialChars[index];
    }

    int digitSum(int num) {
        int temp;
        int sum = 0;

        while (num > 0) {
            temp = num % 10;
            num /= 10;
            sum += temp;
        }

        return sum;
    }

    int lastDigit(int num) {
        return num % 10;
    }

    int firstDigit(int num) {

        while (num > 10) {
            num /= num;
        }

        return num;
    }

    int fifthDigit(int num) {
        int i;

        for (i = 0; i < 4; i++) {
            num /= 10;
        }

        return num % 10;
    }



    void generatePasswd() {
        // System.out.println("First letter: " + firstLetter(name));

        int sumOfDigits = digitSum(roomNo);

        while (sumOfDigits > 10) {
            sumOfDigits = digitSum(sumOfDigits);
        }

        /*
        System.out.println("\n\nFirst letter name: " + firstLetter(name));
        System.out.println("last digits mobile: " + lastDigit(mobileNo));
        System.out.println("special char at 5th place mobile: " + specialCharArrayRet(fifthDigit(mobileNo)));
        System.out.println("Sum of digits room no: " + sumOfDigits);
        System.out.println("special char at 1st place room no: " + specialCharArrayRet(firstDigit(mobileNo)));
        System.out.println("last char name: " + lastLetter(name) + "\n\n");
        */

        System.out.println("\n\nFinal Password is: " + firstLetter(name) + lastDigit(mobileNo) + specialCharArrayRet(fifthDigit(mobileNo)) + 
        sumOfDigits + specialCharArrayRet(firstDigit(mobileNo)) + lastLetter(name));
    }

    public static void main(String args[]) {
    	Prog13 p = new Prog13();

        p.generatePasswd();

    }
}