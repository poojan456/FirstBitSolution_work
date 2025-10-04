package p6;
import p5.QueueDemo;



public class QueueTest {
    public static void main(String[] args) {
        QueueDemo q = new QueueDemo(5);

        q.insertData(10);
        q.insertData(20);
        q.insertData(30);
        q.display();

        q.deleteData();  // removes 10
        q.display();

        q.insertData(40);
        q.insertData(50);
        q.insertData(60); 
        q.display();
    }
}
