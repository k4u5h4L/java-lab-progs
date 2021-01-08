package PartB;

/*
 * Develop a producer-consumer problem using the concept of multithreading
 */

class Producer extends Thread {
	 static int value;
	// boolean flag;
	 
	 Producer() {
	  value = 0;
	//  flag = true;
	 }
	 
	 public void run() {
	  synchronized(this) {
	   for (int i = 1; i <= 6; i++) {
//	    value++;
	    System.out.println("Producer value: " + value);
	    notify();
	    try {
	     wait();
	    } catch (Exception e) {
	     e.printStackTrace();
	    }
	   }
	  }
	 }
	}

	class Consumer extends Thread {
	 Producer prod;
	 
	 Consumer(Producer temp) {
	  prod = temp;
	 }
	 
	 public void run() {
	  synchronized(prod) {
	   
	   for (int i = 1; i <= 6; i++) {
//	    if (prod.value < 1) break;
//	    prod.value--;
	    System.out.println("Consumer value: " + prod.value++);
	    prod.notify();
	    try {
	     prod.wait();
	    } catch (Exception e) {
	     e.printStackTrace();
	    }
	   }
	   }
	 }
	}

	public class Prog2 {
	 public static void main(String args[]) {
	  Producer p = new Producer();
	  Consumer c = new Consumer(p);
	 
	  
	  p.start();
	  c.start();
	 }
	}
