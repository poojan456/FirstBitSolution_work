package p5;

public class WaitingQueue {
	private String[] queue;
	private int front, rear, size, capacity;
	public WaitingQueue(int capacity) {
		front=0;
		rear=-1;
		size=0;
		this.capacity=capacity;
		queue=new String[capacity];
		
		
	}
	public String[] getQueue() {
		return queue;
	}
	public void setQueue(String[] queue) {
		this.queue = queue;
	}
	public int getFront() {
		return front;
	}
	public void setFront(int front) {
		this.front = front;
	}
	public int getRear() {
		return rear;
	}
	public void setRear(int rear) {
		this.rear = rear;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public boolean isFull() {
		return size == capacity;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}

	public void enqueue(String customer) {
		if(isFull()) {
			System.out.println("queue is full. customer"+customer+"cannot be added");
			return;
			
		}
		rear=(rear+1)%capacity;
		queue[rear]=customer;
		size++;
	}
	public String dequeue() {
		if(isEmpty()) {
			System.out.println("Queue is empty.");
			return null;
		}
		String customer = queue[front];
		front = (front + 1) % capacity;
		size--;
		return customer;

		
	}
	public String[] getQueueElements() {
		String[] elements=new String[size];
		for(int i=0;i<size;i++) {
			elements[i] = queue[(front + i) % capacity];
			
		}
		return elements;
	}

}
