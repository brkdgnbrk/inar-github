package week_07.assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Question_07_32_ {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter list: ");
        int size = input.nextInt();
        int[] numbers = new int[size];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }
        System.out.println("After the partition, the list is "+ Arrays.toString(partition(numbers)));

    }

    public static int[] partition(int[] list) {
        for (int i = 1; i < list.length; i++) {
            for (int j = 0; j < list.length-i; j++) {
                if (list[j] >= list[j+1]) {
                    int temp = list[j];
                    list[j] = list[j+1];
                    list[j+1] = temp;
                }
            }

        }return list;
    }
}
