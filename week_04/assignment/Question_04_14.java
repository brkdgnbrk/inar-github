package week_04.assignment;

import java.util.Scanner;

public class Question_04_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a letter grade: ");
        String s = input.next();
        char letter = s.charAt(0);


        if (letter >= 'A' && letter <= 'F') {
            System.out.print("The numeric value for grade " + letter + " is ");
            switch (Character.toUpperCase(letter)) {
                case 'A':
                    System.out.println("4");
                    break;
                case 'B':
                    System.out.println("3");
                    break;
                case 'C':
                    System.out.println("2");
                    break;
                case 'D':
                    System.out.println("1");
                    break;
                case 'F':
                    System.out.println("0");
                    break;
            }
        } else {
            System.out.println(letter + " is an invalid grade");
        }
    }
}