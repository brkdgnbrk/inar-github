package week_05.assigments;

import java.util.Scanner;

public class Question_05_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int firstNumber = input.nextInt();
        System.out.print("Enter second integer: ");
        int secondNumber = input.nextInt();
        int gcd = 1;
        int min = Math.min(firstNumber, secondNumber);
        while (min > 1) {
            if (firstNumber % min == 0 && secondNumber % min == 0) {
                gcd = min;
                break;
            }
            min--;



        }System.out.println(gcd);
    }
}

