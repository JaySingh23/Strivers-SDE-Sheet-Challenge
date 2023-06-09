import java.util.Scanner;

class SetMatrixZeroes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int rows = sc.nextInt();
            int cols = sc.nextInt();
            int matrix[][] = new int[rows][cols];
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++)
                    matrix[i][j] = sc.nextInt();
            }

            boolean r[] = new boolean[rows];
            boolean c[] = new boolean[cols];

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    if (matrix[i][j] == 0) {
                        r[i] = true;
                        c[j] = true;
                    }
                }
            }

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    if (r[i] || c[j])
                        matrix[i][j] = 0;
                }
            }

            for (int i1 = 0; i1 < rows; i1++) {
                for (int j = 0; j < cols; j++)
                    System.out.print(matrix[i1][j] + " ");
                System.out.println();
            }

        }
    }
}
