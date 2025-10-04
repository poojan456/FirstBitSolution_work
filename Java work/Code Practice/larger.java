package condition;
import java.util.Scanner;

public class larger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        if (n1 > n2 && n1 > n3) {
            System.out.println("the larger number is" + " " + n1);
        } else if (n2 > n1 && n2 > n3) {
            System.out.println("the largest number is" + " " + n2);
        } else {
            System.out.println(n3);
        }
    }

}
