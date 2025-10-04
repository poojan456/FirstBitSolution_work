import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        int num;
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = s1.nextInt();
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial = factorial * i;
        }
        System.out.println("factorial is :" + factorial);

    }
}
