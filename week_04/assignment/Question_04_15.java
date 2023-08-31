package week_04.assignment;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Question_04_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        String s = input.nextLine();
        char letter = s.toUpperCase().charAt(0);

        if (Character.isLetter(letter)) {
            System.out.print("The corresponding number is ");
            if (Character.isLetter(letter)) {
                if (letter >= 'W')
                    System.out.println("9");
                else if (letter >= 'T')
                    System.out.println("8");
                else if (letter >= 'P')
                    System.out.println("7");
                else if (letter >= 'M')
                    System.out.println("6");
                else if (letter >= 'J')
                    System.out.println("5");
                else if (letter >= 'G')
                    System.out.println("4");
                else if (letter >= 'D')
                    System.out.println("3");
                else if (letter >= 'A')
                    System.out.println("2");
            }
        }else
            System.out.println(letter + " is an invalid input");
    }


    }
