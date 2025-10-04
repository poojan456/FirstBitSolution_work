package Lsearching;
// check at which position the element occure
import java.util.*;
public class twod1 {
    public static void main(String[] args) {
        int arr[][] = { { 23, 4, 5 },
                { 34, 56, 78, 12 },
                { 12, 6 },
                { 1, 53, 9 } };
        int target = 53;
        int ans[]=search(arr,target);

        System.out.println(Arrays.toString(ans));

    }
    static int[] search(int arr[][], int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    return new int[]{i,j};
                }

            }

        }
        return new int[]{-1,-1};
        

    }
    
}
