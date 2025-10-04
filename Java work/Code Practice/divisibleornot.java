import java.util.Scanner;

public class divisibleornot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int x = sc.nextInt();
        if (x % 5 == 0) {
            System.out.println("Divisible by 5: ");
        } else {
            System.out.println("Not divisible by 5: ");
        }
        if (x % 11 == 0) {
            System.out.println("Divisible by 11: ");

        } else {
            System.out.println("not divisible by 11: ");
        }

    }

}
