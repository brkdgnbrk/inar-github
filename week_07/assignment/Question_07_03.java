package week_07.assignment;

import java.util.Scanner;

public class Question_07_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the integers between 1 and 100: ");
        int[] numbers = new int[100];
        int num;
        do {
            num = input.nextInt();
            if ((0 < num && 100 > num))
                numbers[num - 1]++;
        } while (num != 0);
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                System.out.println((i + 1) + " occours " + numbers[i] + " time"+(numbers[i]>1?"s":""));

            }


        }
    }
}
