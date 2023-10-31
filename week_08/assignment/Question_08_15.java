package week_08.assignment;

import java.util.Scanner;

public class Question_08_15 {
    public static void main(String[] args) {
        double[][] matrix = getValue();
        if (sameLine(matrix)){
            System.out.println("The five points are on the same line");

        }else {
            System.out.println("The five points are not on the same line");
        }

    }

    public static double[][] getValue() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter five points: ");
        double[][] matrix = new double[5][2];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = input.nextDouble();
            }

        }
        return matrix;
    }

    public static boolean sameLine(double[][] points) {
        for (int i = 0; i < points.length - 2; i += 3) {
            if (calculatePoints(points[i][0], points[i][1], points[i + 1][0],
                    points[i + 1][1], points[i + 2][0], points[i + 2][1]) != 0) {
                return false;
            }
        }
        return true;
    }
    public static double calculatePoints(double x0, double y0, double x1, double y1, double x2, double y2) {
        return (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);
    }
}