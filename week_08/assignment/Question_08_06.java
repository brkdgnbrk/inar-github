package week_08.assignment;

import java.util.Scanner;

public class Question_08_06 {
    public static void main(String[] args) {
        double[][] matrix1 = getValue();
        double[][] matrix2 = getValue();
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1.length; j++) {
                System.out.print(matrix1[i][j] + "  ");

            }
            if (i == 1) {
                System.out.print("* ");
            } else {
                System.out.print("  ");
            }


            for (int j = 0; j < matrix1.length; j++) {
                System.out.print(" "+matrix2[i][j] + "  ");

            }
            if (i == 1) {
                System.out.print("= ");
            } else {
                System.out.print("  ");
            }
            for (int j = 0; j < matrix1.length; j++) {
                System.out.printf("%-8.1f  ",multiplyMatrix(matrix1,matrix2)[i][j]);
            }
            System.out.println();
        }
    }


    public static double[][] getValue() {
        Scanner input = new Scanner(System.in);
        double[][] matrix = new double[3][3];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = input.nextDouble();

            }
        }
        return matrix;
    }

    public static double[][] multiplyMatrix(double[][] a, double[][] b) {
        double[][] multiplyMatrix = new double[3][3];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                for (int k = 0; k < b.length ; k++) {
                    multiplyMatrix[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return multiplyMatrix;
    }
}
