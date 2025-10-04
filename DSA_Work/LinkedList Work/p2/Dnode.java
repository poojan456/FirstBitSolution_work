package p2;

public class Dnode {
	public int data;
	
	public Dnode next;
	public Dnode prev;
	

	public Dnode() {
		super();
		this.data=0;
		this.next=null;
		this.prev=null;
		
	}

	public Dnode(int data) {
		super();
		this.data = data;
		
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Dnode getNext() {
		return next;
	}

	public void setNext(Dnode next) {
		this.next = next;
	}
}