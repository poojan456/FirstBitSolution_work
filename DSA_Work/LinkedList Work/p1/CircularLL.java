package P1;

import java.util.Scanner;

import p2.Node;

public class CircularLL {
	Node start;
	Node end;
	public static void main(String[]args) {
		
		Node n1=new Node(10);
		Node n2=new Node(30);
		
		Node temp=new Node(100);
		Node ref=new Node(500);
		Node temp1=new Node(90);
		
		CircularLL l1=new CircularLL();
		l1.insertAtBeg(temp);
		l1.insertNode(ref);
		l1.insertNode(n1);
		l1.insertNode(n2);
		
		
		l1.insertAtAnyPos(temp1);
		l1.deleteEnd();
		l1.deleteBeg();
		l1.display();
		
		
			
		
	}
	
	void insertAtBeg(Node temp){
	    if(start==null) {
	        start=temp;
	        end=temp;
	        end.next=start;
	    }
	    else {
	        temp.next=start;
	        start=temp;end.next=start; // maintain circular link
	    }
	}

	void insertNode(Node 
	        ref){
	    if(start==null) {
	        start=ref;
	        end=ref;
	        ref.next=start;
	    } else {
	        end.next=ref;
	        ref.next=start;
	        end=ref;
	    }
	}

	void insertAtAnyPos(Node temp1){
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter position: ");
	    int pos=sc.nextInt();
	    
	    if(pos<=0){
	        System.out.println("Invalid position!");
	        return;
	    }

	    if(pos==1){
	        temp1.next=start;
	        start=temp1;
	        end.next=start;
	        return;
	    }

	    Node itr=start;
	    int count=1;
	    while(count<pos-1 && itr.next!=start){
	        itr=itr.next;
	        count++;
	    }

	    temp1.next=itr.next;
	    itr.next=temp1;

	    if(itr==end){
	        end=temp1;
	    }
	}
	
	public void deleteBeg() {
		if (start == null) {
	        System.out.println("No node to delete");
	        return;
	    }
		else {
			Node temp=start;
			
			start=temp.next;
			
			end.next=start;
			start=end;
		}
		
	}
	
	public void deleteEnd() {
	    if (start == null) {
	        System.out.println("No node to delete");
	        return;
	    }

	
	    if (start == end) {
	        start = end = null;
	        return;
	    }

	  
	    Node temp = start;
	    while (temp.next != end) { 
	        temp = temp.next;
	    }

	    temp.next = start; 
	    end = temp;       
	}

	void display(){
	    if(start==null){
	        System.out.println("no node insert");
	        return;
	    }
	    Node itr=start;
	    do{
	        System.out.print("["+itr.getData()+"]->");
	        itr=itr.next;
	    }while(itr!=start);
	    System.out.println("(back to start)");
	}
	
	
	
	

	
}
