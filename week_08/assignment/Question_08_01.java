package week_08.assignment;

import java.util.Scanner;

public class Question_08_01 {
    public static void main(String[] args) {
        System.out.println("Enter a 3-by-4 matrix row by row:");
        double[][] array = getValue();
        int columnIndex = 0;
        for (columnIndex = 0; columnIndex < array[0].length; columnIndex++) {
            System.out.println("Sum of the elements at column " + columnIndex + " is " + sumColumn(array, columnIndex));
        }
    }

    public static double sumColumn(double[][] m, int columnIndex) {
        double sum = 0;
        for (int row = 0; row < m.length; row++) {
            sum += m[row][columnIndex];
        }
        return sum;

    }

    public static double[][] getValue() {
        Scanner input = new Scanner(System.in);
        double[][] result = new double[3][4];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                result[i][j] = input.nextDouble();
            }

        }
        return result;

    }
}

