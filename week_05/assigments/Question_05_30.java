package week_05.assigments;

import java.util.Scanner;

public class Question_05_30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an amount : ");
        double amount = input.nextDouble();
        System.out.print("Enter the annual interest rate: ");
        double interestRate = input.nextInt();
        System.out.print("Enter the number of months: ");
        double numberOfMonths = input.nextInt();
        double monthlyInterestRate = interestRate / 100.0 / 12.0;
        double sum = 0;
        for (int i = 1; i <= numberOfMonths; i++) {

            sum = (sum + amount) * (1.0 + monthlyInterestRate);
        }
        System.out.printf("Amount in savings account after 6 months: $%.2f", sum);

    }
}
