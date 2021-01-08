package PartB;

/*
 * Write a program to implement different exception handling methods in java.
 */

class M {  
	 void method() throws ArithmeticException {  
		 throw new ArithmeticException("Some arithmetic error");  
	 }  
}

class InvalidAgeException extends Exception {  
	 InvalidAgeException(String s) {  
		 super(s);  
	 }  
}  

public class Prog4 {
	
	static void validate(int age) throws InvalidAgeException, ArithmeticException {  
	     if(age < 18)  
	    	 throw new ArithmeticException("not valid");
	     else if (age == 20)
	    	 throw new InvalidAgeException("Custom exception");
	     else  
	    	 System.out.println("welcome to vote");
	}  
	
	public static void main(String args[]) {
		try {
			System.out.println("Division by zero");
			System.out.println(100 / 0);
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		
		try {
			System.out.println("Division by zero, using Exception class");
			System.out.println(100 / 0);
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		
		try{  
			M m = new M();  
			m.method();  
		} catch (Exception e) {
			System.out.println("Exception handled");
		} finally {
			System.out.println("Finally statement");
		}
		
		try {
			validate(14);  			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			validate(20);  			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
