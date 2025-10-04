import java.util.Scanner;

public class user {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = sc.next();
        System.out.println("Enter gender: ");
        char gender = sc.next().charAt(0);
        System.out.println("Enter age: ");
        int age = sc.nextInt();
        System.out.println("Enter phone number: ");
        long number = sc.nextLong();

    }

}
