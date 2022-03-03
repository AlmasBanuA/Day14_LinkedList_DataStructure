package day14.LinkedList;

public class Runner {

	/**
	 * Main method for manipulation linkedList
	 * 
	 * @param args - Default Java param (Not used)
	 */
	public static void main(String[] args) {

		/*
		 * PROCEDURE 1. Creating Linked list 
		 * 2. Adding nodes to linkedList 
		 * 3. Printing linkedList after adding nodes
		 * 4. Deleting node from start of the linkedlist
		 * 5. Printing linkedList after deleting node from start of the linkedlist 
		 * 6. Deleting node from end of the linkedlist
		 * 7. Printing linkedList after deleting node from end of the linkedlist
		 */

		System.out.println("Welcome to LinkedList program");

		/*
		 * 1. Creating Linked list and creating object(list) for LinkedList class
		 */
		LinkedList list = new LinkedList();

		/*
		 * UC10. Ability to create Ordered Linked List in ascending order of data entered
		 * in following sequence 56, 30, 40,and 70 
		 * Final Sequence: 30->40->56->70
		 */
		list.insert(56);
		list.insert(30);
		list.insert(70);
		list.print();
		list.searchNode(30);
		list.insertMid(3, 40);
		list.print();
		list.sortedList();
		System.out.println("sorted data");
		list.print();

	}
}
