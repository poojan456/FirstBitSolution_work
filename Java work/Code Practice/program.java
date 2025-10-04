public class program {
    public static void main(String[] args) {
        int maxi = 0;
        int this_took_maxsteps = 0;
        for (int i = 1; i <= 10; i++) {
            int count = 0;
            int j = i;
            while (j != 1) {
                if (j % 2 != 0) {
                    j = 3 * j + 1;
                    count++;
                } else {
                    j = j / 2;
                    count++;
                }
                if (count > maxi) {
                    maxi = count;
                    this_took_maxsteps = 1;
                }
            }
        }
        System.out.println("\n" + "this_took_maxstep" + "took maximum steps to become 1");
        System.out.println("and it took " + maxi + "step to become 1");
    }
}