import java.util.*;

public class R {
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        int temp[] = new int[k];

        // fix: start from n-1 not n
        for (int i = 0; i < k; i++) {
            temp[i] = nums[n - k + i];
        }

        for (int i = n - 1; i >= k; i--) {
            nums[i] = nums[i - k];
        }

        for (int i = 0; i < k; i++) {
            nums[i] = temp[i];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();

        int nums[] = new int[n];
        System.out.println("Enter the elements of array:");

        // fix: take n elements not n-1
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println("Enter how many elements u want to rotate");
        int k = sc.nextInt();

        rotate(nums, k);

        // fix: print all n elements
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
