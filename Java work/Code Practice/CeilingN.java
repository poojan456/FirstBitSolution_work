package Bsearching;

public class CeilingN {
    public static void main(String[] args) {
        int a[] = { 1, 2, 4, 5, 6, 7, 89 };
        int target = 3;
        System.out.println(ceiling(a, target));

    }

    static int ceiling(int a[], int target) {
        int start = 0;
        int end = a.length - 1;
        while (start <= end) {

            int mid = start + (end - start) / 2;
            if (target < a[mid]) {
                end = mid + 1;

            } else if (target > a[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return start;
    }

}
