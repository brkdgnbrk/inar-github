package week_06.assignment;

import java.util.Scanner;

public class Question_06_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("The amount invested: ");
        double amountInvested = input.nextDouble();
        System.out.print("Monthly interest rate: ");
        double interestRate = input.nextDouble();
        System.out.print("Years    Future Value ");
        for (int years = 1; years <= 30; years++) {

            System.out.printf(" %-10d %-12.2f\n",   years, futureInvestmentValue(amountInvested, interestRate, years));
        }

    }


    public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {
        return investmentAmount * Math.pow((1 + monthlyInterestRate / 1200), years * 12);

    }

}
