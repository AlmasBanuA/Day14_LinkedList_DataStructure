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
		 * UC9. Ability to delete 40 from the Linked List sequence of 56->30->40->70
		 *		and showing the size of LinkedList is 3
		 */
		list.insert(56);
		list.insert(30);
		list.insert(70);
		list.print();

		list.searchNode(30);
		/*
		 * Ability to insert 40 after 30 to the Linked List
		 */
		list.insertMid(3, 40);
		list.print();
		list.delete(40);
		list.printSize();
		list.print();

	}
}
