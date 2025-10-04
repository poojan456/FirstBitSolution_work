import java.util.Scanner;

public class swapnum {
    public static void main(String args[]) {
        Scanner sr = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = sr.nextInt();
        System.out.println("Enter second number: ");
        int b = sr.nextInt();
        int t;
        t = a;
        a = b;
        b = t;
        System.out.println("a:" + a);
        System.out.println("b:" + b);
    }

}
