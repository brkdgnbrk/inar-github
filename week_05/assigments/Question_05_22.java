package week_05.assigments;

import java.util.Scanner;

public class Question_05_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Loan Amount: ");
        double principal = input.nextDouble();
        System.out.print("Number of Years: ");
        int numberOfYears = input.nextInt();
        ;
        System.out.print("Annual Interest Rate: ");
        double annualInterestRate = input.nextInt();
        double monthlyInterestRate = annualInterestRate / 1200;
        double monthlyPayment = principal * monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
        double balance = principal;
        System.out.println("Payment\tInterest\tPrincipal\tBalance");
        for (int i = 1; i <= numberOfYears * 12; i++) {
            double monthlyInterest = monthlyInterestRate * balance;
            principal = monthlyPayment - monthlyInterest;
            balance -= principal;
            System.out.printf("%-6d\t%-9.2f\t%-10.2f\t%-10.2f%n", i, monthlyInterest, principal, balance);
        }
    }
}
