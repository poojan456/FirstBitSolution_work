import java.util.*;

public class Soln {

    public static void rotateArrayByK(int[] nums) {
        Scanner sc = new Scanner(System.in);
        int n = nums.length;

        System.out.println("Enter how many elements you want to rotate:");
        int k = sc.nextInt();
        k = k % n; // in case k > n

       
        int temp[] = new int[k];
        for (int i = 0; i < k; i++) {
            temp[i] = nums[i];
        }

        // shift the rest left by k
        for (int i = k; i < n; i++) {
            nums[i - k] = nums[i];
        }

        // put temp elements at end
        for (int i = 0; i < k; i++) {
            nums[n - k + i] = temp[i];
            
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int nums[] = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        rotateArrayByK(nums);

        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
