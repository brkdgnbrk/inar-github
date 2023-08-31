package week_04.assignment;

import java.util.Scanner;

public class Question_04_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a decimal value (0 to 15): ");
        int decimalValue = input.nextInt();

        if (decimalValue >= 0 && decimalValue <= 9) {
            System.out.println("The hex value is " + decimalValue);

        } else if (decimalValue >= 10 && decimalValue <= 15) {
            System.out.println("The hex value is " + (char)(decimalValue+55));

        } else {
            System.out.println(decimalValue + " is an invalid input");

        }
    }
}