public class Areaoverloading {
    public static void main(String[] args) {
        class area {
            void area(int l, int b) {
                System.out.println("Area of rectangle is:" + (l * b));
            }

            void area(int l) {
                System.out.println("Area of square" + (l * l));

            }
        }

        area obj = new area();
        obj.area(9);
        obj.area(10, 20);

    }
}
