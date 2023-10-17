package week_07.assignment;

import java.util.Scanner;

public class Question_07_02 {
    public static void main(String[] args) {
        System.out.print("Enter ten integers: ");
        int[] number = new int[10];
        getNumber(number);
        for (int i = number.length - 1; 0 <= i; i--) {
            System.out.print(number[i] + " ");
        }
    }


    public static void getNumber(int[] number) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < number.length; i++) {
            number[i] = input.nextInt();
        }
    }
}