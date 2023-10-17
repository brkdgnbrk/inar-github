package week_07.assignment;

import java.util.Scanner;

public class Question_07_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten numbers: ");
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }
        for (int i = 0; i < reverse(numbers).length; i++) {
            System.out.print(reverse(numbers)[i] + " ");
        }
    }

    public static int[] reverse(int[] numbers) {
        int[] newNumbers = new int[numbers.length];
        for (int i = 0, j = numbers.length - 1; i < numbers.length; i++, j--) {
            newNumbers[i] = numbers[j];
        }
        return newNumbers;
    }
}
