package Lsearching;

import java.util.Scanner;

public class found {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }
        int target = sc.nextInt();
        int ans = LinearSearch(arr, target);
        System.out.println(ans);

    }

    static int LinearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == target) {
                return i;
            }
        }
        return -1;

    }

}
