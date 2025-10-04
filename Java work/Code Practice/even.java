package condition;
import java.util.Scanner;

public class even {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number ");
        int n = s.nextInt();
        if (n % 2 == 0) {
            System.out.println("its even number");
        } else {
            System.out.println("its odd number");
        }
    }

}
