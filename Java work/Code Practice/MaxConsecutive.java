import java.util.*;

public class MaxConsecutive {
    public static int Max(int nums[]) {
        int n = nums.length;
        int count = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 1) {
                count++;
                max = Math.max(count, max);
            } else {
                count = 0;

            }

        }
        return max;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();

        }
        int x = Max(nums);
        System.out.println(x);

    }

}
