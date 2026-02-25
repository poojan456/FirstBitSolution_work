import java.util.*;

public class RotateArrayByRight {
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        int temp[] = new int[n];
       
        for (int i = n - k; i < n - 1; i++) {
            temp[i] = nums[i];
        }

        
        for (int i = k; i < n - 1; i++) {
            nums[n - k] = nums[i - k];
        }
        for (int i = k; i < n - 1; i++) {
            temp[i] = nums[n - k + i];
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
        System.out.println("Enter how many element u want to rotate");
        int k = sc.nextInt();

        rotate(nums, k);
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }

    }
}