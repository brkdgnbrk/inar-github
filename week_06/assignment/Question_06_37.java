package week_06.assignment;

import java.util.Scanner;

public class Question_06_37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number and its width: ");
        int number = input.nextInt();
        int width = input.nextInt();
        String numberStr = number + "";
        if (width >= numberStr.length()) {
            System.out.println(format(number, width));

        } else {
            System.out.println(number);
        }
    }

    public static String format(int number, int width) {
        String num = number + "";
        String zero = "0";
        for (int i = 1; i < width - num.length(); i++) {
            zero += "0";

        }
        return zero + num;
    }
}
