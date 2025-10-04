package array;
//find the duplicate element of array
public class duplicate {
    public static void main(String[] args) {
        int a[] = { 6, 5, 8, 5, 2, 9, 2 };
        int temp = 0;
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if ((a[i] == a[j]) && (i != j)) {
                    temp = temp + 1;

                    System.out.println("the duplicate number is " + a[j]);
                    break;
                }

            }
            if (temp > 0) {
                break;
            }
        }

    }

}
