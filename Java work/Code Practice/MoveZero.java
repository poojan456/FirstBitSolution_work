import java.util.*;

public class MoveZero {
    public static void Move(int nums[]) {
        int n = nums.length;
        // int temp[] = new int[n];
        // for (int i = 0; i < n - 1; i++) {
        // if (nums[i] != 0) {
        // temp[i] = nums[i];
        // }
        // }
        // int temp2[] = new int[n];
        // int count = 0;
        // for (int i = 0; i < n; i++) {
        // if (nums[i] == 0) {
        // temp2[i] = nums[i];
        // count++;
        // }
        // }
        // for (int i = n - count; i < n - 1; i++) {
        // temp[i] = temp2[i];
        // }
        int temp[] = new int[n];
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                temp[j] = nums[i];
                j++;
            }
        }
        for (int i = 0; i < n; i++) {
            nums[i] = temp[i];
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        System.out.println("Enter element of array");
        int nums[] = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();

        }

        Move(nums);
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }

    }

}
