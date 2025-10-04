package Other;
import java.util.Scanner;

public class fact {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int facter = 1;
        for (int i = 1; i <= p; i++) {

            facter = facter * i;

        }
        System.out.println("factorial of the number" + facter);
    }

}
