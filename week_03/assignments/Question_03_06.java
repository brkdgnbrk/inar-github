package week_03.assignments;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Question_03_06 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        double weightAsPound = input.nextDouble();
        System.out.print("Enter feet: ");
        double feet = input.nextDouble();
        System.out.print("Enter inches: ");
        double inches = input.nextDouble();

        final double KILOGRAM_PER_POUND = 0.45359237;
        final double METER_PER_INCH = 0.0254;
        final double INCH_PER_FOOT = 12;

        double height = ((feet * INCH_PER_FOOT) + inches) * METER_PER_INCH;
        double weight = weightAsPound * KILOGRAM_PER_POUND;
        double bmi = weight / Math.pow(height, 2);

        if (bmi < 18.5) {
            System.out.println("BMI is " + bmi);
            System.out.println("Underweight");
        } else if (bmi < 25.0) {
            System.out.println("BIM is " + bmi);
            System.out.println("Normal");
        } else if (bmi < 30) {
            System.out.println("BIM is " + bmi);
            System.out.println("Overweight");
        } else if (30<bmi){
            System.out.println("BIM is " + bmi);
            System.out.println("Obese");
        }

    }
}
