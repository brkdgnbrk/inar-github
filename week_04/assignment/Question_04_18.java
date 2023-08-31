package week_04.assignment;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Question_04_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two characters: ");
        String s = input.nextLine();
        char first = s.toUpperCase().charAt(0);
        char second = s.charAt(1);

        switch (first) {
            case 'M':
                System.out.print("Mathematics ");
                break;
            case 'C':
                System.out.print("Computer Science ");
                break;
            case 'I':
                System.out.print("Information Technology ");
                break;
            default:
                System.out.println("Invalid input");System.exit(1);
        }
        switch (second) {
            case '1':
                System.out.println("Freshman");
                break;
            case '2':
                System.out.println("Sophomore");
                break;
            case '3':
                System.out.println("Junior");
                break;
            case '4':
                System.out.println("Senior");
                break;
            default:
                System.out.println("Invalid input");System.exit(1);
        }


    }
}
