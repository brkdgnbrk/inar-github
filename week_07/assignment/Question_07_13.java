package week_07.assignment;

import java.util.Scanner;

public class Question_07_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten numbers to exclude from random (1-54): ");
        int[] excludedNumbers = new int[10];
        for (int i = 0; i < excludedNumbers.length; i++) {
            excludedNumbers[i] = input.nextInt();
        }
        System.out.println("Number generated: " + getRandom(excludedNumbers));
    }

    public static int getRandom(int... numbers) {
        int num;
        boolean isExcluded;
        do {
            isExcluded = false;
            num = 1 + (int) (Math.random() * 54);
            for (int i = 0; i < numbers.length; i++) {

                if (num == numbers[i])
                    isExcluded = true;
            }
        } while (isExcluded);
        return num;
    }
}