import java.util.Scanner;

public class seeta {
    public static void main(String[] args) {
        class Area {
            public void area(int l) {
                int r = l * l;
                System.out.println("area of square" + r + "\n");

            }

            public void area(int l, int b) {
                int re = l * b;
                System.out.println("Area of rectangle" + re + "\n");
            }
        }
        Scanner sc = new Scanner(System.in);
        Area a = new Area();
        System.out.println("Find area of\n1Square\n2Rectangle");
        System.out.println("Enter your choice");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter side");
                int s = sc.nextInt();
                a.area(s);
                break;
            case 2:
                System.out.println("Enter length");
                int d = sc.nextInt();
                a.area(d);
                System.out.println("Enter breadth");
                int e = sc.nextInt();
                a.area(d, e);
                break;
            default:
                System.out.println("Enter valid choice");

        }

    }

}
