package Application;

import java.util.Scanner;

import Queue.QueueUsingLinkedList;

public class Main {
	public static void main(String[] args) {
		
		System.out.println("Queue using LinkedList");
		System.out.println("----------------------");
		
		System.out.println("Enter the number of elements to be inserted");
		Scanner scanner = new Scanner(System.in);
		try {
			int elements = scanner.nextInt();
			QueueUsingLinkedList queue = new QueueUsingLinkedList();
			for(int index = 0; index < elements; index++) {
				System.out.println("Enter the element "+(index+1));
				queue.Enqueue(scanner.nextInt());
			}
			System.out.println("Enter the number of elements to be deleted");
			int toBeDeleted = scanner.nextInt();
			for(int index = 0; index < toBeDeleted; index++) {
				System.out.println("Dequeued element is "+queue.Dequeue());
			}
		}catch(Exception exception) {
			System.out.println("Thrown exception is "+exception.getMessage());
		}
	}
}
