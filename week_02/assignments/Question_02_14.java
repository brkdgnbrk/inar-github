package week_02.assignments;

import java.util.Scanner;

public class Question_02_14 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        final double ONE_POUND=0.45359237; //1 Pound in kilogram
        final double ONE_INCH=0.0254; // 1 Inch in meters

        System.out.print("Enter weight in pounds ");

        double weight=input.nextDouble();

        System.out.print("Enter height in inches: ");

        double height= input.nextDouble();

        double bmi=(weight*ONE_POUND)/(Math.pow((height*ONE_INCH),2));

        System.out.println("BMI is " +bmi);
    }
}
