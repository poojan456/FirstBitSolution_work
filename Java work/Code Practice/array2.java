public class array2 {
    public static void main(String[] args) {
        int[][] a = { { 10, 20, 30 }, { 48, 56, 78 } };
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.println(a[i][j] + " ");
            }
        }
    }
}
