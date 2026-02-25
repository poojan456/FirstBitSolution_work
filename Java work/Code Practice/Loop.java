public class Loop {
    public static void main(String[] args) {

        int i = 2;

        while (i <= 100) {
            int j = 2;
            boolean isPrime = true;   // reset for each number

            while (j < i) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
                j++;
            }

            if (isPrime) {
                System.out.println(i);
            }
            i++;
        }
    }
}

