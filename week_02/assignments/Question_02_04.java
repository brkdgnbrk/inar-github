package week_02.assignments;

import java.util.Scanner;

public class Question_02_04 {
    public static void main(String[] Args) {

        Scanner input = new Scanner(System.in);


        System.out.print("Enter a number in pounds:");
        double pounds = input.nextDouble();
        final double KILOGRAM_FOR_0NE_POUND = 0.454;
        double kilograms = pounds * KILOGRAM_FOR_0NE_POUND;
        System.out.println(pounds + " pounds is " + kilograms + " kilograms");
    }
}
