import java.util.Scanner;

public class B1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter five numbers:");
        for (int i = 1; i <= 5; i++) {
            int n = sc.nextInt();

            if (n == 0) {
                continue;
            }

            System.out.println(n);
        }
    }
}


