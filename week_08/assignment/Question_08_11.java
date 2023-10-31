package week_08.assignment;

import java.util.Scanner;

public class Question_08_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 511: ");
        int number = input.nextInt();
        String number1 = Integer.toBinaryString(number);
        System.out.println(number1);
        int count = number1.length() - 1;
        char[][] array = {{'0', '0', '0'}, {'0', '0', '0'}, {'0', '0', '0'}};
        for (int i = array.length - 1; i >= 0; i--) {
            for (int j = array.length - 1; j >= 0; j--) {
                if (count >= 0) {
                    array[i][j] = number1.charAt(count);
                    count--;
                }
            }
            if (number1.length() < 4) {
                break;
            } else if (number1.length() < 7 && i == 1) {
                break;
            } else if (number1.length() < 10 && i == 0) {
                break;
            }

        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i][j] == '0') {
                    array[i][j] = 'H';
                } else {
                    array[i][j] = 'T';
                }

            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");

            }
            System.out.println();
        }

    }


}

