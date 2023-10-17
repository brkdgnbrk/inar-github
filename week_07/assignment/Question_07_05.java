package week_07.assignment;

import java.util.Scanner;

public class Question_07_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten numbers: ");
        int[] numbers = new int[10];
        int num;
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            num = input.nextInt();
            if (isDistinct(numbers, num)) {
                numbers[count] = num;
                count++;
            }

        }
        System.out.println("The number of distinct numbers is " + count);
        System.out.print("The distinct numbers are");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                System.out.print(" " + numbers[i]);
            }
        }

    }

    public static boolean isDistinct(int[] numbers, int num) {
        for (int i = 0; i < numbers.length; i++) {
            if (num == numbers[i]) {
                return false;
            }

        }return true;
    }
}