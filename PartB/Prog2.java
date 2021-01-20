package PartB;

/*
 * Develop a producer-consumer problem using the concept of multithreading
 */

class Producer extends Thread {
	static int value;

	Producer() {
		value = 0;
	}

	public void run() {
		synchronized (this) {
			for (int i = 1; i <= 6; i++) {
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
		synchronized (prod) {

			for (int i = 1; i <= 6; i++) {
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
