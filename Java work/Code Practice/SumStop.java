import java.util.Scanner;

public class SumStop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        System.out.println("Enter numbers:");

        while (true) {
            int n = sc.nextInt();
            sum = sum + n;

            if (sum > 100) {
                break;
            }
        }

        System.out.println("Sum is: " + sum);
    }
}

