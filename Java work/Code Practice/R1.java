import java.util.*;

public class R1 {
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n; // handle if k > n
        int temp[] = new int[n];

        // copy last k elements to temp
        for (int i = 0; i < k; i++) {
            temp[i] = nums[n - k + i];
        }

        // shift first n-k elements to right
        for (int i = n - 1; i >= k; i--) {
            nums[i] = nums[i - k];
        }

        // put temp elements at start
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
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println("Enter how many elements you want to rotate:");
        int k = sc.nextInt();

        rotate(nums, k);

        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
