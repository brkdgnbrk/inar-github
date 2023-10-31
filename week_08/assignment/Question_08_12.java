package week_08.assignment;

import java.util.Scanner;

public class Question_08_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("0-single filer, 1-married jointly or qualifying widow(er), 2-married separately, 3-head of household) Enter the filing status: ");
        int status = input.nextInt();
        System.out.print("Enter the taxable income: ");
        double income= input.nextDouble();
        double[] rates = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};
        int[][] brackets = {
                {8350, 33950, 82250, 171550, 372950},
                {16700, 67900, 137050, 20885, 372950},
                {8350, 33950, 68525, 104425, 186475},
                {11950, 45500, 117450, 190200, 372950}
        };
        System.out.println("Tax is "+computeTax(brackets,rates,status,income));

    }
    public static double computeTax(int[][] brackets, double[] rates, int status, double income) {
        double tax = 0, incomeTaxed = 0;
        for (int i = 4; i >= 0; i--) {
            if (income > brackets[status][i])
                tax += (incomeTaxed = income - brackets[status][i]) * rates[i + 1];
            income -= incomeTaxed;
        }
        return tax += brackets[status][0] * rates[0];
    }
}
