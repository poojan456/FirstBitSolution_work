package P1;
import p2.Node;
import java.util.*;

public class SinglyMenu {
    Node start;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LL1 demo = new LL1();

        while (true) {
            System.out.println("\n==== MENU ====");
            System.out.println("1. Insert Node at End");
            System.out.println("2. Insert Node at Beginning");
            System.out.println("3. Insert Node at Any Position");
            System.out.println("4. Delete at Beginning");
            System.out.println("5. Delete at End");
            System.out.println("6. Delete at Position");
            System.out.println("7. Display List");
            System.out.println("8. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter data: ");
                    int data1 = sc.nextInt();
                    demo.insertNode(new Node(data1));
                    break;

                case 2:
                    System.out.print("Enter data: ");
                    int data2 = sc.nextInt();
                    demo.insertAtBeg(new Node(data2));
                    break;

                case 3:
                    System.out.print("Enter data: ");
                    int data3 = sc.nextInt();
                    demo.insertAtAnyPos(new Node(data3));
                    break;

                case 4:
                    demo.deleteAtbig();
                    break;

                case 5:
                    demo.deleteAtEnd();
                    break;

                case 6:
                    System.out.print("Enter position: ");
                    int pos = sc.nextInt();
                    demo.deleteatpos(pos);
                    break;

                case 7:
                    demo.display();
                    break;

                case 8:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }

    void insertNode(Node ref) {
        if (start == null) {
            start = ref;
        } else {
            Node temp = start;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = ref;
        }
    }

    void display() {
        if (start == null) {
            System.out.println("List is empty");
        } else {
            Node itr = start;
            while (itr != null) {
                System.out.print("[" + itr.getData() + "] -> ");
                itr = itr.next;
            }
            System.out.println("null");
        }
    }

    void insertAtBeg(Node temp) {
        temp.next = start;
        start = temp;
    }

    void insertAtAnyPos(Node temp1) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter position: ");
        int pos = sc.nextInt();
        Node itr = start;

        if (pos <= 0) {
            System.out.println("Invalid position!");
            return;
        }

        if (start == null) {
            if (pos == 1) {
                start = temp1;
            } else {
                System.out.println("Invalid position, list is empty!");
            }
            return;
        }

        if (pos == 1) {
            temp1.next = start;
            start = temp1;
            return;
        }

        int count = 1;
        while (count < pos - 1 && itr != null) {
            itr = itr.next;
            count++;
        }

        if (itr == null) {
            System.out.println("Invalid position!");
            return;
        }

        temp1.next = itr.next;
        itr.next = temp1;
    }

    void deleteAtBeg() {
        if (start == null) {
            System.out.println("No node to delete");
        } else {
            start = start.next;
        }
    }

    void deleteAtEnd() {
        if (start == null) {
            System.out.println("No node to delete");
        } else if (start.next == null) {
            start = null;
        } else {
            Node itr = start;
            while (itr.next.next != null) {
                itr = itr.next;
            }
            itr.next = null;
        }
    }

    void deleteAtPos(int pos) {
        if (pos == 1) {
            deleteAtBeg();
            return;
        }
        if (pos <= 0) {
            System.out.println("Position not valid");
            return;
        }

        int count = 1;
        Node itr = start;

        while (count < pos - 1 && itr != null) {
            itr = itr.next;
            count++;
        }

        if (itr == null || itr.next == null) {
            System.out.println("Position out of range");
            return;
        }

        itr.next = itr.next.next;
    }
}
