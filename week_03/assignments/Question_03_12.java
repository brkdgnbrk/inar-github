package week_03.assignments;

import java.util.Scanner;

public class Question_03_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a three-digit integer: ");
        int number = input.nextInt();
        int digit1 = number % 10;
        int digit2 = (number / 10) % 10;
        int digit3 = number / 100;

        if (number < 1000 && number > 99) {
            if (digit1 == digit3) {
                System.out.println(number + " is a palindrome");
            } else {
                System.out.println(number + " is not a palindrome");
            }
        }else{
            System.out.println("Invalid value!");
        }
    }
}
