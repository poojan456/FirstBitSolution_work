package Other;
import java.util.*;

public class gcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int g = 0;
        for (int i = 1; i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                // System.out.println(i);
                g = i;

            }
        }
        System.out.println(g);
    }

}
