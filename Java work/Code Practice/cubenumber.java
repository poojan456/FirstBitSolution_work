import java.util.Scanner;

public class cubenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int x = sc.nextInt();
        int cube = x * x * x;
        System.out.println("cube of number: " + cube);

    }

}
