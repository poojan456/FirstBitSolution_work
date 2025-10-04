import java.util.Scanner;

public class swapnum2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first num:");
        int a = sc.nextInt();
        System.out.println("Enter second num:");
        int b = sc.nextInt();
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a:" + a);
        System.out.println("b:" + b);

    }

}
