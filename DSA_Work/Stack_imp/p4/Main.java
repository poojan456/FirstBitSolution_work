package p4;
import p3.Stack2;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Stack2 t=new Stack2(5);
		
		int choice;
		
		do {
			System.out.println("\n--- Menu ---");
            System.out.println("1. Write a line");
            System.out.println("2. Undo");
           System.out.println("3. Display current text");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            
            switch(choice) {
            case 1:
               System.out.print("Enter line: ");
                String line = sc.nextLine();
                t.write(line);
                break;
            case 2:
               t.undo();
                break;
           case 3:
             t.display();
               break;
           case 4:
               System.out.println("Exiting...");
               break;
           default:
               System.out.println("Invalid choice!");
        }
    } while (choice != 4);
		sc.close();
	
	}
	

}
