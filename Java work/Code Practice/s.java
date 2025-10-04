package Other;
import java.util.Scanner;

public class s {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter any number from 1 to 7");
        System.out.println("Enter any character");
        // int day = sc.nextInt();
        char c = sc.next().charAt(0);

        // switch (day) {
        switch (c) {
            // case 1:
            case 'A':
                // System.out.println("Monday");
                System.out.println("Excellent");
                break;
            // case 2:
            case 'B':
                // System.out.println("Tuesday");
                System.out.println("better");
                break;
            // case 3:
            case 'C':

                // System.out.println("wensday");
                System.out.println("okok");
                break;
            // case 4:
            // System.out.println("thursday");
            // break;
            // case 5:
            // System.out.println("friday");
            // break;
            // case 6:
            // System.out.println("saturday");
            // break;
            // case 7:
            // System.out.println("sunday");

            // break;
            default:
                System.out.println("invalid character");

        }
    }

}
