package p4;

import p3.Stack1;

public class Mystack {
    public static void main(String[] args) {
        Mystack my = new Mystack();
        my.insert(80);
        my.insert(60);
        my.insert(40);
        my.delete();
    }

    public void insert(int value) {
        Stack1 s = Stack1.getObject(5); 
        s.push(value);
        s.display();
    }

    public void delete() {
        Stack1 s = Stack1.getObject(5); // ✅ same object reused
        s.pop();
        s.display();
    }
}

