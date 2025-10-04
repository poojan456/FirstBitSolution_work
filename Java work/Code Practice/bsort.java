
public class bsort {
    public static void main(String[] args) {
        int a[] = { 5, 10, 7, 18, 9, 4 };
        int temp;
        for (int i = 0; i < a.length; i++) {// this for loop is for round
            for (int j = 0; j < a.length - 1; j++) {
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

}
