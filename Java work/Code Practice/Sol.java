import java.util.*;

public class Sol {
    public static void rotateArrayByTwo(int[] nums) {
        int n = nums.length;

        // store first two elements
        int first = nums[0];
        int second = nums[1];

        // shift elements left by 2
        for (int i = 2; i < n; i++) {
            nums[i - 2] = nums[i];
        }

        // put first two elements at end
        nums[n - 2] = first;
        nums[n - 1] = second;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        rotateArrayByTwo(nums);

        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}

