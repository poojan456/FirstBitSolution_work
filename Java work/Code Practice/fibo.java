package Other;
public class fibo {

    public static void main(String[] args) {

        int a = 0;
        int b = 1;

        // The index of the Fibonacci number to find
        int index = 6;
        int c = 0;

        for (int i = 2; i <= index; i++) { // Start from i = 2 since F(1) and F(2) are known
            c = a + b;
            a = b;
            b = c;
        }

        System.out.println(c); // This will print the 6th Fibonacci number
    }

}
