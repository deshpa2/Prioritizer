package util;

import java.util.Comparator;
import java.util.Scanner;

public class Main {

	@SuppressWarnings({ "unchecked", "null" })
	public static <T> void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		T t = null;

		Prioritizer1<Object, Comparator> p1 = null;

		// Prioritizer 2- Creating Object and Initialize it using Constructor
		Prioritizer<T> p2 = null;

		Object obj1 = null;
		boolean flag = false;
		do {
			System.out.println("Choose a prioritizer by entering 1,2 or 3");
			int prioritizer = sc.nextInt();
			System.out.println("Enter an operation from the following\n" + "1:Insert elements\n" + "2:Change Phase\n"
					+ "3:Remove Next Item\n" + "4:Remove Any element\n" + "5 Get Size\n" + "6:Is In Insertion Phase?\n"
					+ "7:Exit");
			int ch = sc.nextInt();
			switch (ch) {
			case 1:
				if (prioritizer == 1) {
					System.out.println("Enter the size of the prioritizer");
					int size = sc.nextInt();

					p1 = new Prioritizer1<>(size, t);
					for (int i = 0; i < size; i++) {
						System.out.println("Enter " + i + 1 + " th Element");
						obj1 = sc.nextInt();
						p1.insert((T) obj1, i);
					}
					T[] input = (T[]) p1.getInput();
					System.out.println("Input Received");
					// System.out.println(input);
					for (int i = 0; i < input.length; i++) {
						System.out.println(input[i]);
					}
					break;
				}
				if (prioritizer == 2) {
					System.out.println("Enter the size of the prioritizer");
					@SuppressWarnings("resource")
					Scanner sc1 = new Scanner(System.in);
					int a = sc1.nextInt();
					Object size = a;
					p2 = new Prioritizer2<T>(a);
					p2.insert((T) size, 0);
					break;
				}
				if (prioritizer == 3) {
					System.out.println("Enter elements to insert");
					// obj1=sc.nextInt();
					// p3.insert((T)obj1,i);
				}
			case 2:
				if (prioritizer == 1) {
					p1.changePhase();
				}
				if (prioritizer == 2) {
					p2.changePhase();
				}
				if (prioritizer == 3) {
					// p3.changePhase();
				}
				break;
			case 3:
				if (prioritizer == 1) {
					System.out.println("Removing Next Element");
					p1.removeNextInorder();
				}
				if (prioritizer == 2) {
					System.out.println("Removing Next Element");
					p2.removeNextInorder();
				}
				if (prioritizer == 3) {
					System.out.println("Removing Next Element");
					// p3.removeNextInorder();
				}
				break;
			case 4:
				if (prioritizer == 1) {
					System.out.println("Removing a random element");
					p1.removeAny();
				}
				if (prioritizer == 2) {
					System.out.println("Removing a random element");
					p2.removeAny();
				}
				if (prioritizer == 3) {
					System.out.println("Removing a random element");
					// p3.removeAny();
				}
				break;
			case 5:
				if (prioritizer == 1) {
					System.out.println("Getting size");
					int size = p1.getSize();
					System.out.println(size);
				}
				if (prioritizer == 2) {
					int size = p2.getSize();
					System.out.println("Size of the array =  " + size);
				}
				if (prioritizer == 3) {
					System.out.println("Getting size");
					// p3.getSize();
				}
				break;
			case 6:
				if (prioritizer == 1) {
					System.out.println("Checking for insertion phase");
					boolean phase = p1.isInInsertionPhase();
					System.out.println(phase);

				}
				if (prioritizer == 2) {
					System.out.println("Checking for insertion phase");
					if (p2.isInInsertionPhase() == true) {
						System.out.println("IsInInsertionPhase");
					} else {
						System.out.println("IsInRemovalPhase");
					}
				}
				if (prioritizer == 3) {
					System.out.println("Checking for insertion phase");
					// p3.isInInsertionPhase();
				}
				break;
			case 7:
				flag = true;
				break;
			}
		} while (flag == false);
		System.out.print("Terminated");
	}
}
