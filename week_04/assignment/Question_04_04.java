package week_04.assignment;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Question_04_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the side: ");
        double sideOfHexagon = input.nextDouble();
        double areaOfHexagon = 6 * Math.pow(sideOfHexagon, 2) / (4 * Math.tan(Math.PI / 6));

        System.out.printf("The area of the hexagon %2.2f", areaOfHexagon);
    }
}
