package array;

//take a matrix as input from user search for a given number x and print indices at which it occur
import java.util.Scanner;

public class tdarray1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int col = sc.nextInt();
        int[][] number = new int[rows][col];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                number[i][j] = sc.nextInt();

            }
        }
        int x = sc.nextInt();
        // outer
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                if (number[i][j] == x) {
                    System.out.print("x is found at location (" + i + "," + j + ")");

                }

            }
            System.out.println();

        }
    }

}
