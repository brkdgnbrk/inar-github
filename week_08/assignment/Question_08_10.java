package week_08.assignment;

public class Question_08_10 {
    public static void main(String[] args) {
        int[][] matrix = new int[4][4];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = (int) (Math.random() * 2);

            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");

            }
            System.out.println();

        }
        largestRowAndColumn(matrix);
    }

    public static void largestRowAndColumn(int matrix[][]) {
        int largestRowIndex = 0;
        int largestRowSum = 0;
        int largestColumnIndex = 0;
        int largestColumnSum = 0;

        for (int i = 0; i < matrix.length; i++) {
            int rowSum = 0;
            int columnSum = 0;

            for (int j = 0; j < matrix[i].length; j++) {
                rowSum += matrix[i][j];
                columnSum += matrix[j][i];
            }

            if (rowSum > largestRowSum) {
                largestRowSum = rowSum;
                largestRowIndex = i;
            }

            if (columnSum > largestColumnSum) {
                largestColumnSum = columnSum;
                largestColumnIndex = i;
            }
        }

        System.out.println("The largest row index: " + largestRowIndex);
        System.out.println("The largest row column index: " + largestColumnIndex);
    }
}