public class find {
    public static void main(String[] args) {
        class rect {
            int l, b;

            void display() {
                System.out.println("Area of the rectangle:" + (l * b));
            }
        }
        class sq {
            int a;

            void display() {
                System.out.println("Area of the square:" + (a * a));
            }
        }
        rect r = new rect();
        sq s = new sq();
        r.l = 23;
        r.b = 15;
        s.a = 7;
        r.display();
        s.display();
    }
}
