import java.util.Scanner;

public class reversec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Your name: ");
        String name = sc.next();
        int length = name.length();
        String rev = " ";
        for (int i = length - 1; i >= 0; i--) {
            rev = rev + name.charAt(i);
        }
        System.out.println("Reverse of name is: " + rev);

    }

}
