package week_02.live_class;

import java.util.Scanner;

public class ComputeAverage {
    public static void main(String[] Args) {

        Scanner input = new Scanner(System.in);

        int number1;
        int number2;
        int number3;
        double average;

        System.out.println("Enter three numbers: ");

        number1 = input.nextInt();
        number2 = input.nextInt();
        number3 = input.nextInt();

        average = (number1 + number2 + number3) / 3.0;

        System.out.println("The average of " + number1 + "," + number2 + "," + number3 + " is " + average);
    }
}
