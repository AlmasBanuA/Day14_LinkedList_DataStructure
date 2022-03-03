package day14.LinkedList;

public class LinkedList {

	/*
	 * Represent the head and tail of the linked list
	 */
	public MyNode head = null;
	public MyNode tail = null;

	/*
	 * creating insert method
	 */
	public void insert(int data) {
		/*
		 * Creating object as newNode
		 */
		MyNode newNode = new MyNode(data);
		if (head == null) {
			/*
			 * If list is empty, both head and tail will point to new node
			 */
			head = newNode;
			tail = newNode;
		} else {
			/*
			 * newNode will be added after tail such that tail's next will point to newNode
			 */
			tail.next = newNode;
			tail = newNode;
		}
	}

	/*
	 * creating print method
	 */
	public void print() {
		/*
		 * Node current will point to head
		 */
		MyNode temp = head;
		if (head == null) {
			System.out.println("List is empty");
			return;
		}
		System.out.println("Nodes of linked list is: ");
		while (temp != null) {
			/*
			 * Prints each node by incrementing pointer
			 */
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}

	/*
	 * addNode() method here new data is added inFront of data
	 */
	public void addNode(int data) {
		MyNode newNode = new MyNode(data);
		newNode.next = head;
		/*
		 * newNode will be added before head such that head next will point to newNode
		 */
		head = newNode;
	}

}
