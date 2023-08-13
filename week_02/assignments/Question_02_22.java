package week_02.assignments;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Question_02_22 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter an amount as integer,for example 1156 for 11,56: ");

        int money = input.nextInt();
        int remainingAmount = money;

        int numberOfDollars = remainingAmount / 100;
        remainingAmount = remainingAmount % 100;

        int numberOfQuarters = remainingAmount / 25;
        remainingAmount = remainingAmount % 25;

        int numberOfDimes = remainingAmount / 10;
        remainingAmount = remainingAmount % 10;

        int numberOfNickels = remainingAmount / 5;
        remainingAmount = remainingAmount % 5;

        int numberOfPennies = remainingAmount;

        System.out.println("Your amount " + money + " consist of");
        System.out.println(numberOfDollars + " dollar ");
        System.out.println(numberOfQuarters + " quarters");
        System.out.println(numberOfDimes + " dimes");
        System.out.println(numberOfNickels + " nickels");
        System.out.println(numberOfPennies + " pennies");


    }
}
