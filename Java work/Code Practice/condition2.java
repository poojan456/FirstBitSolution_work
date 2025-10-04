package condition;
import java.util.Scanner;

public class condition2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int days = sc.nextInt();
        switch (days) {
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wendsday");
                break;
            case 4:
                System.out.println("tuesday");
                break;
            case 5:
                System.out.println("tuesday");
                break;
            default:
                System.out.println("invalid days");
        }

    }

}
