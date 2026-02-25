import java.util.*;

public class TargetSearch {
    public static int targetsearch(int nums[], int target) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (target == nums[i]) {
                return i;
            } 
                
            
        }
        return -1;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size");
        int n = sc.nextInt();
        System.out.println("Enter array element");
        int nums[] = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("Enter target");
        int target = sc.nextInt();

        int x = targetsearch(nums, target);
        System.out.println(x);

    }

}
