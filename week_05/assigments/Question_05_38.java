package week_05.assigments;

import java.util.Scanner;

public class Question_05_38 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a decimal integer: ");
        int actualNumber = input.nextInt();
        int number=actualNumber;
        int num1 = 0;
        String num2 = "";

        while (number > 0) {
            num1 = number % 8;
            num2 = num1 + num2;
            number = number / 8;

        }

        System.out.println("The octal of "+actualNumber+" is " + num2);
    }

}
