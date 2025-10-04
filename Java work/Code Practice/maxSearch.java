public class maxSearch {
    public static void main(String[] args) {

        int a[] = { 5, 9, 6, 7, 10 };
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];

            }
        }
        System.out.println("the maximum number is" + max);
    }

}
