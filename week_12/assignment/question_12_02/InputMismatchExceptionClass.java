package week_12.assignment.question_12_02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchExceptionClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number1 = 0;
        int number2 = 0;
        boolean validInput = false;

        do {
            try {
                System.out.println("Enter two integers to sum: ");
                number1 = input.nextInt();
                number2 = input.nextInt();
                validInput = true;
            } catch (InputMismatchException ex) {
                System.out.println("Wrong input !! Please enter integer");
                input.nextLine();
            }
        } while (!validInput);

        int sum = number1 + number2;
        System.out.println("Sum of " + number1 + " + " + number2 + " is " + sum);
    }
}