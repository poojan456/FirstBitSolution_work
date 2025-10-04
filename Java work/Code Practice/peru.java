import java.util.Scanner;

public class peru {
    public static void main(String[] args) {
        class Area {
            public void area(int l) {
                int r = l * l;
                System.out.println("Area of square" + r + "\n");
            }

            public void area(int l, int b) {
                int re = l * b;
                System.out.println("area of rectangle" + re + "\n");

            }

        }
        Scanner sc = new Scanner(System.in);
        System.out.println("find\n1square\n2rectangle");
        System.out.println("Enter choice");
        int ch = sc.nextInt();
        Area a = new Area();
        switch (ch) {
            case 1:
                System.out.println("enter side");
                int s = sc.nextInt();
                a.area(s);
                break;

            case 2:
                System.out.println("Enter length");
                int d = sc.nextInt();
                System.out.println("Enter breadth");
                int e = sc.nextInt();
                a.area(d, e);
                break;
            default:
                System.out.println("enter valid choice");
        }

    }
}
