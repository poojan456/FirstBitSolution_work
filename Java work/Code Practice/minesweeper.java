package Other;
import java.util.Scanner;

public class minesweeper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r = 1;

        while (true) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();

            if (n == 0 && m == 0) {
                break;
            }

            char[][] field = new char[n][m];

            // Reading the field
            for (int i = 0; i < n; i++) {
                field[i] = scanner.next().toCharArray();
            }

            processField(field, r);
            r++;
        }

        scanner.close();
    }

    public static void processField(char[][] field, int r) {
        System.out.println("Field #" + r + ":");

        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[0].length; j++) {
                if (field[i][j] == '.') {
                    int adjacentMines = countAdjacentMines(field, i, j);
                    System.out.print(adjacentMines);
                } else {
                    System.out.print('*');
                }
            }
            System.out.println();
        }
        System.out.println(); // empty line between field outputs
    }

    public static int countAdjacentMines(char[][] field, int x, int y) {
        int count = 0;
        for (int i = Math.max(0, x - 1); i <= Math.min(field.length - 1, x + 1); i++) {
            for (int j = Math.max(0, y - 1); j <= Math.min(field[0].length - 1, y + 1); j++) {
                if (field[i][j] == ',') {
                    count++;
                }
            }
        }
        return count;
    }
}
