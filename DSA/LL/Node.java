package p2;

public class Node {
	public int data;
	
	public Node next;


	

	public Node() {
		super();
		this.data=0;
		this.next=null;
		
	}

	public Node(int data) {
		super();
		this.data = data;
		
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	
	
}
