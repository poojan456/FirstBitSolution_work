import java.util.Scanner;

public class avgerage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        double num1 = sc.nextDouble();
        System.out.println("Enter second number:");
        double num2 = sc.nextDouble();
        System.out.println("Enter third number:");
        double num3 = sc.nextDouble();
        sc.close();
        System.out.println("the average of entered numbers is:" + avr(num1, num2, num3));
    }

    public static double avr(double a, double b, double c) {
        return (a + b + c) / 3;
    }

}
