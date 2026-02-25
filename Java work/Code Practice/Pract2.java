public class Pract2 {
    public static void main(String[] args) {
        int n[] = { 2, 2, 1, 7, 3 };
        for (int i = 0; i < n.length; i++) {
            for (int j = i + 1; j < n.length; j++) {
                if (n[i] < n[j]) {
                   
                    System.out.println("not sorted ");
                } else {
                    System.out.println("sorted ");
                    break;
                }
            }

        }

    }
}
