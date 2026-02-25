import java.util.*;

public class Union {
    public static int[] Union(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int n2 = nums2.length;
        int temp[] = new int[n + n2];
        int j = 0;
        for (int i = 0; i < n; i++) {
            temp[j++] = nums1[i];
        }
        for (int i = 0; i < n2; i++) {
            temp[j++] = nums2[i];
        }
        return temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of both arrays");
        int n = sc.nextInt();
        int n2 = sc.nextInt();
        int[] nums1 = new int[n];
        int[] nums2 = new int[n2];
        System.out.println("Enter elements of first array:");
        for (int i = 0; i < n; i++) {
            nums1[i] = sc.nextInt();
        }
        System.out.println("Enter elements of second array:");
        for (int i = 0; i < n2; i++) {
            nums2[i] = sc.nextInt();
        }
        // merge
        int[] result = Union(nums1, nums2);
        // sort
        Arrays.sort(result);
        // remove duplicates
        int d[] = new int[n + n2];
        int j = 0;
        for (int i = 0; i < result.length - 1; i++) {
            if (result[i] != result[i + 1]) {
                d[j++] = result[i];
            }
        }
        d[j++] = result[result.length - 1]; 

        int newArr[] = new int[j];
        for (int k = 0; k < j; k++) {
            newArr[k] = d[k];
            System.out.print(newArr[k] + " ");
        }
    }
}

