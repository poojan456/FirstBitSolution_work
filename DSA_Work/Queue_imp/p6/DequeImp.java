package p6;
import java.util.*;

public class DequeImp {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque<Integer> dq=new ArrayDeque<>();
		dq.addFirst(10);
		dq.addLast(45);
		dq.addLast(4);
		dq.addFirst(20);
		dq.addFirst(30);
		System.out.println(dq);
		
		dq.removeFirst();
		dq.removeLast();
		System.out.println("after removing "+dq);
		
		System.out.println("front element"+dq.peekFirst());
		System.out.println("rear element"+ dq.peekLast());
		
		

	}

}
