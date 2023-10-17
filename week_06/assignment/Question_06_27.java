package week_06.assignment;

import java.util.Scanner;

public class Question_06_27 {
    public static void main(String[] args) {
        int count = 0;
        int number = 13;
        while (count < 100) {
            if (isPrime(number) && !isPalindrome(number) && isPrime(reverse(number))) {
                count++;
                System.out.print(count % 10 == 0 ? number + "\n" : number + " ");
            }
            number++;
        }

    }

    public static boolean isPrime(int number) {
        for (int divisor = 2; divisor < number / 2; divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome(int number) {
        int firstNumber = number;
        int reverse = 0;
        while (number != 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;

        }
        return firstNumber == reverse;
    }

    public static int reverse(int number) {
        int firstNumber = number;
        int reverse = 0;
        while (number != 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;

        }
        return reverse;
    }

}
