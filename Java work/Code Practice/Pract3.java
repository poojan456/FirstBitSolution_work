public class Pract3 {
    public static void main(String[] args) {
        int n[] = {0, 0, 3, 3, 5, 5, 6};

        System.out.print("Unique elements: ");
        for (int i = 0; i < n.length; i++) {
            boolean isDuplicate = false;

            // check if n[i] appeared before
            for (int j = 0; j < i; j++) {
                if (n[i] == n[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            // print only if not duplicate
            if (!isDuplicate) {
                System.out.println(n[i] + " ");
            }
        }
    }
}

