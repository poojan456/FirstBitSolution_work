public class minSearch {
    public static void main(String[] args) {
        int a[] = { 6, 4, 7, 12, 9, 8 };
        int min = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        System.out.println("the minimum number is " + min);
    }

}
