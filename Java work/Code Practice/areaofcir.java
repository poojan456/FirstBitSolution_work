
import java.util.Scanner;

public class areaofcir {
    public static void main(String[] args) {
        class area {
            double calArea(double r) {
                double t = 3.14 * r * r;
                return t;

            }

            float calArea(float l, float h) {
                float q = (l * h) / 2;
                return q;
            }
        }
        Scanner sc = new Scanner(System.in);
        area a = new area();
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                double r;
                System.out.println("Enter the radius:");
                r = sc.nextInt();
                double sa = a.calArea(r);
                System.out.println("Area of circle:" + sa);
                break;
            case 2:
                float l, h;
                System.out.println("Enter the length:");
                l = sc.nextInt();
                System.out.println("Enter the height:");
                h = sc.nextInt();
                double ca = a.calArea(l, h);
                System.out.println("Area of triangle:" + ca);
                break;
            default:
                System.out.println("Invalid Input!");
                break;
        }

    }

}
