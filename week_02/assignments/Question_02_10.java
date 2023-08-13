package week_02.assignments;

import java.util.Scanner;

public class Question_02_10 {
    public static void main(String[] Args){

        Scanner input=new Scanner(System.in);

        System.out.print("Enter the amount of water in kilograms: ");
        double weightOfWater=input.nextDouble();

        System.out.print("Enter the initial temperature: ");
        double initialTemperature= input.nextDouble();

        System.out.print("Enter the final temperature: ");
        double finalTemperature= input.nextDouble();

        double energy=weightOfWater*(finalTemperature-initialTemperature)*4184;

        System.out.println("The energy needed is " + energy);
    }
}
