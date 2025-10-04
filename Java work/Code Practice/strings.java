package String;

//1st operation on string concatination
import java.util.Scanner;

public class strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstName = "Pooja";
        String lastName = "Nagapurkar";
        String fullName = firstName + " " + lastName;

        // System.out.println(fullName);
        // .length function
        System.out.println(fullName.length());
        for (int i = 1; i <= fullName.length(); i++) {
            // at which position
            System.out.println(fullName.charAt(i));
        }

    }

}
