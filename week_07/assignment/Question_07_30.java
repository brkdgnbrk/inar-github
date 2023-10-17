package week_07.assignment;

import java.util.Scanner;

public class Question_07_30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of values: ");
        int size = input.nextInt();
        int[] numbers = new int[size];
        System.out.print("Enter the values: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }
        if (isConsecutiveFour(numbers)) {
            System.out.println("The list has consecutive fours");
        } else {
            System.out.println("The list has no consecutive fours");
        }
    }

    public static boolean isConsecutiveFour(int[] values) {
        for (int i = 1; i < values.length; i++) {
            if (values[i - 1] == values[i] && values[i - 1] == values[i + 1] && values[i - 1] == values[i + 2]) {
                return true;
            }
        }

        return false;
    }
}
