package PartB;

import java.util.LinkedList;
import java.util.Scanner;

/*
 * 	Program to find the maximum and minimum value node from a doubly linked
	list.
 */

// check the docs for LinkedList: https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html

class Node {
	int value;

	Node(int v) {
		value = v;
	}
}

public class Prog7 {
	public static void main(String args[]) {
		LinkedList<Node> DoublyLL = new LinkedList<Node>();

		DoublyLL.add(new Node(10));
		DoublyLL.add(new Node(20));
		int i;

		Scanner scan = new Scanner(System.in);

//		System.out.println(DoublyLL.get(0).value);

		int choice = 0, item = 0;
		int min, max;

		while (true) {
			System.out.println("1. Add node\n2. Delete node\n3. Display nodes\n4. Find min\n5. Find max\n6. Exit");

			choice = scan.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Enter value:");
				item = scan.nextInt();
				DoublyLL.add(new Node(item));
				break;

			case 2:
				System.out.println("Enter value of node to remove:");
				item = scan.nextInt();
				for (i = 0; i < DoublyLL.size(); i++) {
					if (DoublyLL.get(i).value == item) {
						DoublyLL.remove(i);
						System.out.println("Node " + item + " has been removed");
						break;
					}
				}
				if (i == DoublyLL.size())
					System.out.println("Node " + item + " has not been found");
				break;

			case 3:
				if (DoublyLL.size() < 1) {
					System.out.println("List already empty");
					break;
				}

				for (i = 0; i < DoublyLL.size(); i++) {
					System.out.print(DoublyLL.get(i).value + (i != DoublyLL.size() - 1 ? " --> " : ""));
				}
				System.out.print("\n");
				break;

			case 4:
				if (DoublyLL.size() < 1) {
					System.out.println("List already empty");
					break;
				}

				min = DoublyLL.get(0).value;

				for (i = 1; i < DoublyLL.size(); i++) {
					if (DoublyLL.get(i).value < min) {
						min = DoublyLL.get(i).value;
					}
				}

				System.out.println("Min value in the list:" + min);
				break;

			case 5:
				if (DoublyLL.size() < 1) {
					System.out.println("List already empty");
					break;
				}

				max = DoublyLL.get(0).value;

				for (i = 1; i < DoublyLL.size(); i++) {
					if (DoublyLL.get(i).value > max) {
						max = DoublyLL.get(i).value;
					}
				}

				System.out.println("Max value in the list:" + max);
				break;

			default:
				System.out.println("Exiting...");
				scan.close();
				System.exit(0);
			}
		}

	}
}
