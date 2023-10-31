package week_08.assignment;

import java.util.Scanner;

public class Question_08_14 {
    public static void main(String[] args) {
        int[][] matrix = getValue();
        printArray(matrix);
        zeroRow(matrix);
        oneRow(matrix);
        zeroColumn(matrix);
        oneColumn(matrix);
        majorDiagonal(matrix);
        subDiagonal(matrix);


    }

    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");

            }
            System.out.println();
        }
    }

    public static int[][] getValue() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size for the matrix:  ");
        int size = input.nextInt();
        int[][] matrix = new int[size][size];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = (int) (Math.random() * 2);

            }

        }
        return matrix;
    }

    public static void zeroRow(int matrix[][]) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum = 0;
            for (int j = 0; j < matrix.length; j++) {
                sum += matrix[i][j];

            }
            if (sum == 0) {
                System.out.println("All 0s on row  " + i);
                break;
            }

        }
    }


    public static void oneRow(int matrix[][]) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum = 0;
            for (int j = 0; j < matrix.length; j++) {
                sum += matrix[i][j];

            }
            if (sum == 4) {
                System.out.println("All 1s on row  " + i);
            }

        }
    }

    public static void zeroColumn(int matrix[][]) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum = 0;
            for (int j = 0; j < matrix.length; j++) {
                sum += matrix[j][i];

            }
            if (sum == 0) {
                System.out.println("All 0s on column  " + i);
                break;
            } else {
                System.out.println("No all 0s on a column");
                break;
            }
        }
    }

    public static void oneColumn(int matrix[][]) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum = 0;
            for (int j = 0; j < matrix.length; j++) {
                sum += matrix[j][i];

            }
            if (sum == 4) {
                System.out.println("All 1s on column  " + i);
                break;
            } else {
                System.out.println("No all 1s on a column");
                break;
            }
        }
    }

    public static void majorDiagonal(int matrix[][]) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];

            if (sum == 4 || sum == 0) {
                System.out.println("Same number on the major diagonal");
                break;
            } else {
                System.out.println("No same number on the major diagonal");
                break;
            }
        }

    }

    public static void subDiagonal(int matrix[][]) {
        int sum = 0;
        for (int i = 1; i < matrix.length; i--) {
                sum += matrix[i][i-1];
            if (sum == 4 || sum == 0) {
                System.out.println("Same number on the sub-diagonal");
                break;
            } else {
                System.out.println("No same number on the sub-diagonal");
                break;
            }
        }
    }
}