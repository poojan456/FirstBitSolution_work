package Lsearching;

public class range {
    public static void main(String[] args) {
        int[] arr = { 12, 34, 56, 7, 43, 9 };
        int target = 7;

    }

    static int search(int[] arr, int target, int start, int end) {

        if (arr.length == 0) {
            return -1;
        }
        for (int i = start; i <= end; i++) {

            if (arr[i] == target) {
                return i;
            }

        }
        return -1;

    }

}
