package week_06.assignment;

import java.util.Scanner;

public class Question_06_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        if (isPalindrome(number)) {
            System.out.print(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not palindrome");

        }
    }


    public static boolean isPalindrome(int number) {
        if (reverse(number) == number) {
            return true;
        }
        return false;

    }

    public static int reverse(int number) {
        String numberStr = number + "";
        String numReverse = "";
        for (int i = numberStr.length(); i > 0; i--) {
            numReverse += numberStr.charAt(i - 1);

        }
        return Integer.parseInt(numReverse);
    }
}