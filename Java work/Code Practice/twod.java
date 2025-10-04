package Lsearching;

public class twod {
    public static void main(String[] args) {
        int arr[][] = { { 23, 4, 5 },
                { 34, 56, 78, 12 },
                { 12, 6 },
                { 1, 53, 9 } };
        int target = 7;

        System.out.println(search(arr, target));

    }

    static boolean search(int arr[][], int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    return true;
                }

            }

        }
        return false;

    }

}
