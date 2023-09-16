package week_05.assigments;

import java.util.Scanner;

public class Question_05_31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the initial deosit amount: ");
        double amount = input.nextDouble();
        System.out.print("Enter annual percentage yield: ");
        double annualPercentage = input.nextDouble();
        System.out.print("Enter maturity period (number of months): ");
        int numberOfMonths = input.nextInt();
        double sum = amount;
        System.out.println("Month   CD Value");
        for (int i = 1; i <= numberOfMonths; i++) {
            double interest = sum * (annualPercentage / 1200);
            sum += interest;
            System.out.printf("%d %14.2f\n", i, sum);
        }


    }
}
