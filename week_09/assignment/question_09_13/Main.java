package week_09.assignment.question_09_13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double[][] array = getValue();
        Location location = locateLargest(array);
        System.out.println("The location of the largest element is "+location.maxValue+" at (" + location.row + ", " + location.column + ")");

    }


    public static double[][] getValue() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns in the array: ");
        int rows = input.nextInt();
        int cols = input.nextInt();

        double[][] array = new double[rows][cols];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = input.nextDouble();

            }

        }
        return array;
    }

    public static Location locateLargest(double[][] array) {
        return new Location(array);
    }
}