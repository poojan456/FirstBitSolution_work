import java.util.*;

public class Solution {
    public static void rotateArrayByOne(int[] nums) {
        int n = nums.length;
        int first = nums[0]; // store first element
        for (int i = 0; i < n - 1; i++) {
            nums[i] = nums[i + 1]; // shift each element left
        }
        nums[n - 1] = first; // put first element at last
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        rotateArrayByOne(nums);

        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}