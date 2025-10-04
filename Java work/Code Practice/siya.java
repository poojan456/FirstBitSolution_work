import java.util.Scanner;

public class siya {
    public static void main(String[] args) {
        class Area {
            public void area(int l) {
                int r = l * l;

            }

            public void area(int l, int b) {
                int re = l * b;

            }
        }
        Scanner sc = new Scanner(System.in);
        Area a = new Area();
        System.out.println("find\n1.square\n2.rectangle");
        System.out.println("Enter choice");
        int ch = sc.nextInt();
        switch (ch) {
            case 1:
                System.out.println("enter side of sq");
                int d = sc.nextInt();
                a.area(d);
                break;
            case 2:
                System.out.println("Enter length");
                int s = sc.nextInt();
                System.out.println("Enter breadth");
                int e = sc.nextInt();
                a.area(s, e);
                break;
        }
    }

}
