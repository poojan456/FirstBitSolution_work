package Other;
import java.util.Scanner;

public class swapp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int t;
        t = a;
        a = b;
        b = t;
        System.out.println(a);
        System.out.println(b);

    }

}
