package P1;
import p2.Node;
import java.util.*;

public class LL1 {
	Node start;

	public static void main(String[] args) {
		Node n1=new Node(10);
		Node n2=new Node(30);
		Node n3=new Node(20);
		Node n4=new Node(40);
		
		Node temp=new Node(100);
		Node temp1=new Node(1005);
		
		LL1 demo=new LL1();
		demo.insertNode(n1);
		demo.insertNode(n2);
		demo.insertNode(n3);
		demo.insertNode(n4);
		demo.insertAtBeg(temp);
		demo.insertAtAnyPos(temp1);
		demo.deleteAtbig();
		demo.deleteAtEnd();
		demo.deleteatpos(8);
		
		demo.display();
		
	
		
	}
	void insertNode(Node ref){
		if(start==null) {
			
			start=ref;
			
		}
		else {
			Node temp=start;
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next=ref;
		}
		
		
	}
	void display() {
		if(start==null) {
			System.out.println("no node insert");
			
		}
		else {
			Node itr=start;
			while(itr.next!=null) {
				System.out.print("["+itr.getData()+"]"+"->");
				itr=itr.next;
				
			}
			System.out.print("["+itr.getData()+"]"+"->null");
			
		}

		
	}
	//add node at begning
	void insertAtBeg(Node temp){
	    
		temp.next=start;
		start=temp;
		
	}
	
	void insertAtAnyPos(Node temp1){
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter position: ");
	    int pos = sc.nextInt();
	    Node itr = start;

	    if(pos<=0){
	        System.out.println("Invalid position!");
	        return;
	    }

	   
	    if(start == null) {
	        if (pos == 1) {
	            start=temp1;
	        } else {
	            System.out.println("Invalid position, list is empty!");
	        }
	        return;
	    }

	  
	    if(pos == 1){
	        temp1.next=start;
	        start=temp1;
	        return;
	    }

	  
	    int count = 1;
	    while(count<pos-1 && itr!=null){
	        itr=itr.next;
	        count++;
	    }

	    if (itr==null){
	        System.out.println("Invalid position!");
	        return;
	    }

	    temp1.next=itr.next;
	    itr.next=temp1;
	}
	void deleteAtbig() {
		if(start==null) {
			System.out.println("no node are there for deletion ");
			
		}
		else {
			
			start=start.next;
		  }
	}
	void deleteAtEnd() {
		Node itr=start;
		if(start==null) {
			System.out.println("no node are there for deletion ");
			
		}
		else {
			while(itr.next.next!=null) {
				itr=itr.next;
				
			}
			itr.next=null;
		}
		
	}
	
	void deleteatpos(int pos) {
	    if (pos == 1) { // delete first node
	    	deleteAtbig();
	        return;
	    }
	    if (pos <= 0) {
	        System.out.println("Position not valid");
	        return;
	    }

	    int count = 1;
	    Node itr = start;

	    // move itr to node before position
	    while (count < pos - 1 && itr != null) {
	        itr = itr.next;
	        count++;
	    }

	    if (itr == null || itr.next == null) {
	        System.out.println("Position out of range");
	        return;
	    }

	    // skip the 

	    itr.next = itr.next.next;
	}

}
