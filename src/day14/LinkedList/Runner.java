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
		 * UC4. Ability to insert 30 between 56 and 70
		 */
		   list.insert(56);
	       list.insert(70);
	       list.insertMid(2, 30);
	       
		/*
		 * Printing linkedList after adding nodes
		 */
		list.print();
		System.out.println("First element is deleted");
		int pop = list.popAtFirst();
        System.out.println(pop);
        System.out.println("After Deleting first element");
        list.print();
	}
}
