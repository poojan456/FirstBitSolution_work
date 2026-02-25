

public class Largest2 {
    public static void main(String[] args) {
        int a[] = { 5, 2, 1, 11, 7, 14 };
        int max=a[0];
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length - 1; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;

                }
            }
            System.out.print(" "+a[i]);

            
        }
        System.out.println("max element is "+a[a.length-1]);
        System.out.println("second Max "+a[a.length-2]);
    }

}
