package p6;

public class CircularQueue {
    private int[] queue;
    private int front, rear, size, capacity;

    // constructor
    public CircularQueue(int capacity) {
        this.capacity = capacity;
        this.queue = new int[capacity];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    // check full
    public boolean isFull() {
        return size == capacity;
    }

    // check empty
    public boolean isEmpty() {
        return size == 0;
    }

    // enqueue
    public void enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot insert " + data);
            return;
        }
        rear = (rear + 1) % capacity; // circular move
        queue[rear] = data;
        size++;
        System.out.println(data + " inserted.");
    }

    // dequeue
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1;
        }
        int item = queue[front];
        front = (front + 1) % capacity; // circular move
        size--;
        System.out.println(item + " removed.");
        return item;
    }

    // peek (front element)
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return -1;
        }
        return queue[front];
    }

    // display queue elements
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.print("Queue elements: ");
        for (int i = 0; i < size; i++) {
            System.out.print(queue[(front + i) % capacity] + " ");
        }
        System.out.println();
    }

    // main for testing
    public static void main(String[] args) {
        CircularQueue cq = new CircularQueue(5);

        cq.enqueue(10);
        cq.enqueue(20);
        cq.enqueue(30);
        cq.enqueue(40);
        cq.enqueue(50);
        cq.display();

        cq.dequeue();
        cq.dequeue();
        cq.display();

        cq.enqueue(60);
        cq.enqueue(70);
        cq.display();

        System.out.println("Front element: " + cq.peek());
    }
}

