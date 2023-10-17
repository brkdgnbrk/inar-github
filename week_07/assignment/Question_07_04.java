package week_07.assignment;

import java.util.Scanner;

public class Question_07_04 {
    public static void main(String[] args) {
        System.out.print("Enter numbers: ");
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[100];
        int index = 0;
        int num;
        int sum = 0;

        do {
            num = input.nextInt();
            if (num >= 0) {
                numbers[index] = num;
                sum += num;
                index++;
            }
        } while (num >= 0);

        if (index > 0) {
            double average = (double) sum / index;
            System.out.println("Average: " + average);
            int count = 0;
            int countBelow = 0;
            for (int i = 0; i < index; i++) {
                if (average <= numbers[i]) {
                    count++;
                } else {
                    countBelow++;

                }
            }
            System.out.println("Number of scores above or equal to average: " + count);
            System.out.print("Number of scores below average: " + countBelow);
        }


    }
}