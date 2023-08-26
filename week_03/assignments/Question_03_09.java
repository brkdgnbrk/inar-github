package week_03.assignments;

import java.util.Scanner;

public class Question_03_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first 9 digit of an ISBN as integer: ");
        int number = input.nextInt();
        int remainer = number;

        int d1 = remainer / 100000000;
        remainer = remainer % 100000000;

        int d2 = remainer / 10000000;
        remainer = remainer % 10000000;

        int d3 = remainer / 1000000;
        remainer = remainer % 1000000;
        int d4 = remainer / 100000;
        remainer = remainer % 100000;
        int d5 = remainer / 10000;
        remainer = remainer % 10000;
        int d6 = remainer / 1000;
        remainer = remainer % 1000;
        int d7 = remainer / 100;
        remainer = remainer % 100;
        int d8 = remainer / 10;
        remainer = remainer % 10;
        int d9 = remainer;

        int d10 = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;
        System.out.println("The ISBN-10 number is " + (d10 == 10 ? "0"+number + "X" : "0"+number + d10));


    }
}
