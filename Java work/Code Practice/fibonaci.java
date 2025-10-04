package Other;
public class fibonaci {
    public static void main(String[] args) {
        // 0 1 2 3 4 5 6 7 8 9
        // 0+1 =1 , 1+1=2, 1+2=3
        // swaping function is used
        int a = 0;
        int b = 1;
        int c;
        for (int i = 1; i <= 10; i++) {
            c = a + b;
            System.out.println(c);
            a = b;
            b = c;

        }

    }

}
