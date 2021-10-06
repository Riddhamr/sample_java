public class MatrixAddition {

    private static boolean PrintError(String message) {
        System.err.println(message);
        return false;
    }

    private static boolean checkMatrixDimensions(int[][] a, int[][] b) {
        int no_rows_a = a.length;
        int no_rows_b = b.length;

        if (no_rows_a == 0)
            return PrintError("Matrix is empty");

        if (no_rows_a != no_rows_b)
            return PrintError("Dimension mismatch | no. of Rows");

        for (int i = 0; i < no_rows_a; i++) {
            int no_cols_a = a[i].length;
            int no_cols_b = b[i].length;

            if (no_cols_a != no_cols_b)
                return PrintError("Dimension mismatch | no. of Cols | at row " + (i + 1));
        }

        return true;
    }

    public static void main(String[] args) {

        int[][] a = {{1, 3, 4}, {2, 4, 3}, {3, 4, 5}};
        int[][] b = {{1, 3, 4}, {2, 4, 3}, {1, 2, 4}};

        if (!checkMatrixDimensions(a, b))
            return;

        System.out.println("Addition of Matrix !!!");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + b[i][j] + " ");
            }
            System.out.println();
        }
    }

}
