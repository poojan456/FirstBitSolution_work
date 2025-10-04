import java.util.Scanner;

public class pooja {
    public static void main(String[] args) {
        class Area {
            public void area(int l) {
                int r = l * l;
                System.out.println("Area of square:" + r + "\n");
            }

            public void area(int l, int b) {
                int re = l * b;
                System.out.println("Area of rectangle:" + re + "\n");

            }

        }
        Scanner sc = new Scanner(System.in);
        Area a = new Area();
        System.out.println("Find area of:\n1.Square\n2.Rectangle");
        System.out.println("enter your choice");
        int ch = sc.nextInt();
        switch (ch) {
            case 1:
                System.out.println("Enter side of square");
                int s = sc.nextInt();
                a.area(s);
                break;
            case 2:
                System.out.println("Enter the length");
                int d = sc.nextInt();
                System.out.println("enter the breadth");
                int e = sc.nextInt();
                a.area(d, e);
                break;
            default:
                System.out.println("Enter valid choice");
        }

    }
}