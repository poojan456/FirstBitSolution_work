package array;
public class twodarray {
    public static void main(String[] args) {
        int[][] a = { { 10, 20, 30 }, { 40, 50, 60 } };
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length + 1; j++) {
                System.out.println(a[i][j]);

            }

        }
    }

}
