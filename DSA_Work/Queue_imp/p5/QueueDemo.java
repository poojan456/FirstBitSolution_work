package p5;

public class QueueDemo {
    int start, end;
    int[] myQueue;
    int size;

    public QueueDemo(int size) {
        this.start = -1;
        this.end = -1;
        this.size = size;
        this.myQueue = new int[size];
    }

    public boolean isEmpty() {
        if(start == -1) {
        	System.out.println("queue is empty");
        }
        return true;	 
    }

    public boolean isFull() {
        return (end == size - 1);
    }

    // Enqueue
    public void insertData(int data) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }
        if (isEmpty()) {
            start = 0;
            end = 0;
        } else {
            end++;
        }
        myQueue[end] = data;
        System.out.println("Inserted: " + data);
    }

    // Dequeue
    public void deleteData() {
        if (isEmpty()) {
            System.out.println("No data is there");
            return;
        }

//        System.out.println("Deleted: " + myQueue[start]);
//
//        if (start == end) {
//            // Queue becomes empty
//            start = -1;
//            end = -1;
//        }
        else {
            start++;
        }
    }

    // Display all elements
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.print("Queue elements: ");
        for (int i = start; i <= end; i++) {
            System.out.print(myQueue[i] + " ");
        }
        System.out.println();
    }
}


	
	


	
	    

	
	

