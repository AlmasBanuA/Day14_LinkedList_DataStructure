package day14.LinkedList;

public class LinkedList {

	/*
	 * Represent the head and tail of the linked list
	 */
	public MyNode head = null;
	public MyNode tail = null;

	/**
	 * creating insert method to insert data into linked list
	 * 
	 * @param data- data to be inserted in to the linked list
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

	/**
	 * creating addNode method to adding new data into linked list
	 * 
	 * addNode() method here new data is added inFront of previous data
	 * 
	 * @param data- data to be added in to the linked list
	 */
	public void addNode(int data) {
		MyNode newNode = new MyNode(data);
		newNode.next = head;
		/*
		 * newNode will be added before head such that head next will point to newNode
		 */
		head = newNode;
	}

	/**
	 * creating append method to add node at end
	 * 
	 * @param data-data to be added at last
	 */
	public void appendNode(int data) {
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

	/**
	 * creating insertMid method -to insert the node at middle
	 * 
	 * @param position -shows position of the node
	 * @param data -here we are passing the data
	 */
	public void insertMid(int position, int data) {
		System.out.println("Added a node with data " + data + " at the position " + position);
		MyNode newNode = new MyNode(data);
		/*
		 * Init the cur and prev nodes to the head
		 */
		MyNode cur = this.head;
		MyNode prev = this.head;
		/*
		 * traverse to the end of the list and check positions moved
		 */
		while (cur.next != null && --position > 0) {
			/*
			 * update the prev and cur references
			 */
			prev = cur;
			cur = cur.next;
		}
		/*
		 * update prev to point to new node
		 */
		prev.next = newNode;
		/*
		 * & new node to point to current node
		 */
		newNode.next = cur;
	}

	/**
	 * Creating popAtFirst() method to delete the first element of the linked list
	 * 
	 * @return -new head which is next to the previous head
	 */
	public int popAtFirst() {
		int popData = 0;
		if (head == null) {
			System.out.println("Stack Over Flow");
		}
		popData = head.data;
		head = head.next;
		return popData;
	}

	/**
	 * Creating popAtLast() to delete the last element of the linked list
	 * 
	 * @return -after deleting last element return will points to zero
	 */
	public int popAtLast() {
		System.out.println("Deleting last element of data from the list");
		if (head == null) {
			System.out.println("Empty LinkedList");
		} else {
			MyNode cur = head;
			MyNode prev = head;
			while (cur.next != null) {
				prev = cur;
				cur = cur.next;
			}
			prev.next = null;
		}
		return 0;
	}

	/**
	 * Creating SearchNode() method to search the element
	 * 
	 * @param data -here we pass the data
	 */
	public void searchNode(int data) {
		MyNode current = head;
		int i = 1;
		boolean flag = false;
		if (head == null) {
			System.out.println("List is empty");
		} else {
			while (current != null) {
				if (current.data == data) {
					flag = true;
					break;
				}
				i++;
				current = current.next;
			}
		}
		if (flag)
			System.out.println("Element is present in the list at the position : " + i);
		else
			System.out.println("Element is not present in the list");
	}

	/**
	 * Creating delete method for deleting of specified node from linked list
	 * 
	 * @param data -passing the data
	 */
	public void delete(int data) {
		System.out.println("deleting a node with data " + data + "");
		MyNode cur = head;
		MyNode prev = head;
		/*
		 * find the node that holds the data
		 */
		while (cur != null && cur.data != data) {
			/*
			 * update the prev and cur references
			 */
			prev = cur;
			cur = cur.next;
		}

		/*
		 * If node was found, adjust the prev node & to point to the next of the node to
		 * be deleted
		 */

		if (cur != null) {
			prev.next = cur.next;
		} else {
			System.out.println("The data " + data + " could not be found in the List");
		}
	}
        /**
	 * printSize Method to display the size of the LinkedList
	 */
	public void printSize() {
		int count = 3;
		System.out.println("size of list: " + count);
	}

	/**
	 * Creating sortedList() method to sort the elements in ascending order
	 */
	public void sortedList() {
		MyNode current = head, index = null;
		int temp;
		if (head == null) {
			System.out.println("List is empty");
			return;
		} else {
			while (current != null) {
				index = current.next;
				while (index != null) {
					if (current.data > index.data) {
						temp = current.data;
						current.data = index.data;
						index.data = temp;
					}
					index = index.next;
				}
				current = current.next;
			}
		}
	}

	/**
	 * creating print method to print the data
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
}
