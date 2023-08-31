package week_04.assignment;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Question_04_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a letter: ");
        String s = input.next();
        char letter = s.charAt(0);

        if (Character.isLetter(letter)) {
            switch (Character.toUpperCase(letter)) {
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                    System.out.println(letter + " is a vowel");
                    break;
                default:
                    System.out.println(letter + " is a consonant");
                    break;

            }


        } else {
            System.out.println(letter + " is an invalid input");

        }


    }
}
