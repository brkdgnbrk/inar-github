package week_07.assignment;

import java.util.Scanner;

public class Question_07_15_ {
    public static void main(String[] args) {
        System.out.print("Enter ten number: ");
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(eliminateDuplicates(numbers)+"");
        }
    }
    public static int[] eliminateDuplicates(int[] list) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if (list[i] != list[j])
                    list[i] = input.nextInt();
            }
        }
        return list;
    }
}