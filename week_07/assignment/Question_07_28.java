package week_07.assignment;

import java.util.Scanner;

public class Question_07_28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten numbers:");
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[i] != numbers[j]) {
                    System.out.println(numbers[i] + " " + numbers[j]);
                }
            }
        }
    }
}
