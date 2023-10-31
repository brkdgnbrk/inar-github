package week_08.assignment;

import java.util.Scanner;

public class Question_08_34 {
    public static void main(String[] args) {
        System.out.print("Enter 6 points: ");
        double[][] array = getValue();
        System.out.print("The rightmost lowest point is (" + getRightmostLowestPoint(array)[0] + ", " + getRightmostLowestPoint(array)[1] + ")");
    }

    public static double[][] getValue() {
        Scanner input = new Scanner(System.in);
        double[][] array = new double[6][2];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = input.nextDouble();
            }
        }

        return array;
    }

    public static double[] getRightmostLowestPoint(double[][] points) {
        double[] rightmost = new double[2];

        for (int i = 0; i < points.length; i++) {
            if (points[i][1] < rightmost[1] || (points[i][1] == rightmost[1] && points[i][0] > rightmost[0])) {
                rightmost = points[i];


            }
        }
        return rightmost;
    }
}