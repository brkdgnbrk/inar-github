package week_05.assigments;

import java.util.Scanner;

public class Question_05_37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a decimal integer: ");
        int actualDecimal = input.nextInt();
        int decimal = actualDecimal;
        String output = "";
        while (decimal > 0) {
            int num1 = decimal % 2;
            output = num1 + output;
            decimal = decimal / 2;

        }
        System.out.print(output);


    }
}

