

public class Largest {
    public static void main(String[] args) {

        int a[] = { 5, 2, 11, 1, 7, 15,15 };
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];

            }

        }
        System.out.println("max eleemnt is" + " " + max);
    }

}
