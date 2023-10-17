package week_07.assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Question_07_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter list: ");
        int size = input.nextInt();
        int[] numbers = new int[size];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }
        System.out.println((isSorted(numbers)) ? "The list is already sorted" : "The list is not sorted");

    }

    public static boolean isSorted(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            if (list[i] > list[i + 1]) {
                return false;
            }

        }
        return true;
    }
}
