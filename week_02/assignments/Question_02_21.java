package week_02.assignments;

import java.util.Scanner;

public class Question_02_21 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter investment amount: ");

        double investAmount = input.nextDouble();

        System.out.print("Enter annual interest rate in percentage: ");

        double annualInterestRate = input.nextDouble();

        System.out.print("Enter number of years: ");

        double numberOfYears = input.nextDouble();

        double futureInvestmentValue = investAmount * Math.pow(1 + annualInterestRate / 100 / 12, numberOfYears * 12);

        System.out.println("Accumulated value is $" + futureInvestmentValue);
    }
}
