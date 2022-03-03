package day14.LinkedList;

/* 
 * Created MyNode Class
 */
public class MyNode {
	int data;
	MyNode next;

	/*
	 * Creating Constructor
	 */
	public MyNode(int data) {
		this.data = data;
		this.next = null;
	}
	/*
	 * Getter Setter method
	 */
	public MyNode getNext() {
        return next;
    }

    public void setNext(MyNode next) {
        this.next = next;
    }

}

