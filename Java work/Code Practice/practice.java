
public class practice {
    public static void main(String[] args) {
        int n[] = { 2, 2, 1, 7, 3 };
        int max = n[0];

        for (int i = 0; i < n.length; i++) {
            for (int j = i + 1; j < n.length; j++) {
                if (n[i] > n[j]) {
                    int temp = n[i];
                    n[i] = n[j];
                    n[j] = temp;

                }
            }
            System.out.println(n[i]);
        }
        System.out.println("the Secondlargest number is " + n[n.length - 2]);
    }
}
