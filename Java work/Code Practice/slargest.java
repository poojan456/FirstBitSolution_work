package array;
import java.util.Scanner;

public class slargest {
    public static int getSecondOrderElements(int n, int[] a) {
        int largest = a[0];
        int slargest = -1;

        for (int i = 1; i < n; i++) {
            if (a[i] > largest) {
                slargest = largest; // Update second largest before changing largest
                largest = a[i]; // Update largest to the current element
            } else if (a[i] > slargest && a[i] != largest) {
                slargest = a[i]; // Update second largest if current element is smaller than largest but larger
                                 // than second largest
            }
        }

        return slargest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int result = getSecondOrderElements(n, a);
        System.out.println(result);

        sc.close();
    }
}
