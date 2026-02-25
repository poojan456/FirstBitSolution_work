import java.util.*;

public class Missing {
    public static void missingNo(int nums[]) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                if (nums[i] > nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;

                }
            }

        }
        for (int k = 0; k < nums.length; k++) {
            if (nums[k] != k) {
                System.out.println(k);
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size");
        int n = sc.nextInt();
        System.out.println("Enter array");
        int nums[] = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        missingNo(nums);
        // System.out.println(x);

    }

}
