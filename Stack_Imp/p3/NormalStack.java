package p3;

class Stack {
    int top;
    int size;
    int[] stack;

    // constructor
    public Stack(int size) {
        this.size = size;
        stack = new int[size];
        top = -1;
    }

    // push
    void push(int data) {
        if (top == size - 1) {
            System.out.println("Stack Overflow");
        } else {
            stack[++top] = data;
            System.out.println(data + " pushed");
        }
    }

    // pop
    void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
        } else {
            System.out.println(stack[top--] + " popped");
        }
    }

    // peek (top element)
    void peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Top element: " + stack[top]);
        }
    }

    // display
    void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.print("Stack elements: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(stack[i] + " ");
            }
            System.out.println();
        }
    }
}

// test class
public class NormalStack {
    public static void main(String[] args) {
        Stack s = new Stack(5);

        s.push(10);
        s.push(20);
        s.push(30);

        s.display();

        s.peek();

        s.pop();
        s.display();
    }
}

