package p3;
import java.util.*;
public class Stack2 {
	
     int top;
	 int size;
    String[] myStack;
	public Stack2( int size) {
		super();
		
		this.size = size;
		this.myStack=new String[size];
		top=-1;
		
	}
	
	
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	

	public boolean isFull() {
	       
		return top == size - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }
	
	
	public void write(String line) {
        if (isFull()) {
            System.out.println("stack overflow");
        } else {
        	myStack[++top] = line;
        	System.out.println("Line added");
        }
    }
	
	
	public void undo() {
        if (isEmpty()) {
            System.out.println("stack underflow");
        } else {
            System.out.println(myStack[top--] + " element popped");
            System.out.println("undo perforemd");
        }
    }

//    public void peek() {
//        if (isEmpty()) {
//            System.out.println("stack underflow");
//        } else {
//            System.out.println(myStack[top] + " is top on the stack");
//        }
//    }
    
	public void display() {
	if(isEmpty()) {
		System.out.println("No text written yet");
	}
	else {
		System.out.println("current text");
		for(int i=0;i<=top;i++) {
			System.out.println(myStack[i]);
		}

		
	}
}
}
