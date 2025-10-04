import java.util.Scanner;

public class compound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float p, r, t, n;
        System.out.println("Enter principle : ");
        p = sc.nextFloat();
        System.out.println("Enter Rate of interest : ");
        r = sc.nextFloat();
        System.out.println("Enter time period: ");
        t = sc.nextFloat();
        System.out.println("Enter number of times that  : ");
        n = sc.nextFloat();
        double amount = p * Math.pow(1 + (r / n), n * t);
        double cinterest = amount - p;
        System.out.println("Compound Interest after " + t + " years: " + cinterest);
        System.out.println("Amount after " + t + "years: " + amount);
    }

}
