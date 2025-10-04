package p6;
 
import p5.QueueDemo;

public class QueueUse {
    public static void main(String[] args) {
        QueueDemo q = new QueueDemo(5); 

       
        q.insertData(10);
        q.insertData(20);
        q.insertData(30);

        System.out.println("Queue elements:");
        q.display();

       
        q.deleteData();

        
        q.insertData(40);
        q.insertData(50);

        System.out.println("Queue after more insertions:");
        q.display();
    }
}
