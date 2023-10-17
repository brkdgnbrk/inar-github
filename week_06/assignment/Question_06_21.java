package week_06.assignment;

import java.util.Scanner;

public class Question_06_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String phoneNumber = input.nextLine();
        for (int i = 0; i < phoneNumber.length(); i++) {
            if (Character.isLetter(phoneNumber.charAt(i))) {
                System.out.print(getNumber(phoneNumber.toUpperCase().charAt(i)));
            } else {
                System.out.print(phoneNumber.charAt(i));
            }
        }
    }

    public static int getNumber(char uppercaseLetter) {
        switch (uppercaseLetter) {
            case 'A':
            case 'B':
            case 'C':
                return 2;
            case 'D':
            case 'E':
            case 'F':
                return 3;
            case 'G':
            case 'H':
            case 'I':
                return 4;
            case 'J':
            case 'K':
            case 'L':
                return 5;
            case 'M':
            case 'N':
            case 'O':
                return 6;
            case 'P':
            case 'Q':
            case 'R':
            case 'S':
                return 7;
            case 'T':
            case 'U':
            case 'V':
                return 8;
            case 'W':
            case 'X':
            case 'Y':
            case 'Z':
                return 9;


        }
        return -1;
    }
}