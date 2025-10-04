package p3;

public class Stack1 {
    int top;
    private int[] mystack;
    static int size;
    static Stack1 ref;

    private Stack1(int size) {
        this.top = -1;
        Stack1.size = size;
        this.mystack = new int[size];
    }

    public static Stack1 getObject(int size) {
        if (ref == null) {  
            ref = new Stack1(size);
        }
        return ref;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(int d1) {
        if (isFull()) {
            System.out.println("stack overflow");
        } else {
            mystack[++top] = d1;
            System.out.println("data inserted");
        }
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("stack underflow");
        } else {
            System.out.println(mystack[top--] + " element popped");
        }
    }

    public void peek() {
        if (isEmpty()) {
            System.out.println("stack underflow");
        } else {
            System.out.println(mystack[top] + " is top on the stack");
        }
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("stack underflow");
        } else {
            for (int i = 0; i <= top; i++) {
                System.out.println("\t" + mystack[i]);
            }
        }
    }
}

