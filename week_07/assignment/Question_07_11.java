package week_07.assignment;

import java.util.Scanner;

public class Question_07_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten numbers: ");
        double[] numbers = new double[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
        }
        System.out.printf("The mean is %.2f \nThe standard deviation is %.5f", mean(numbers), deviation(numbers));

    }

    /**
     * Compute the deviation of double values
     */
    public static double deviation(double[] x) {
        double sumOfSquares = 0;
        for (int i = 0; i < x.length; i++) {

            sumOfSquares += Math.pow(x[i] - mean(x), 2);

        }
        return Math.sqrt((sumOfSquares / (x.length - 1)));
    }

    /**
     * Compute the mean of an array of double values
     */
    public static double mean(double[] x) {
        double sum = 0;
        for (int i = 0; i < x.length; i++) {
            sum += x[i];
        }
        return sum / x.length;
    }
}
