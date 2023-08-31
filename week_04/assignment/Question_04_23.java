package week_04.assignment;

import java.util.Scanner;

public class Question_04_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter employess's name: ");
        String name = input.nextLine();
        System.out.print("Enter number of hours worked in a week: ");
        double hours = input.nextDouble();
        System.out.print("Enter hourly pay rate: ");
        double payRate = input.nextDouble();
        System.out.print("Enter federal tax witholding rate: ");
        double federalTaxRate = input.nextDouble();
        System.out.print("Enter state tax witholding rate: ");
        double stateTaxRate = input.nextDouble();

        double grossPay = hours * payRate;
        double federalTax = grossPay * federalTaxRate;
        double stateTax = grossPay * stateTaxRate;
        double netPay = grossPay - federalTax - stateTax;
        System.out.println("Employee Name: " + name);
        System.out.println("Hours worked: " + hours);
        System.out.println("Pay Rate: " + payRate);
        System.out.println("Gross Pay: " + grossPay);
        System.out.println("Dedutions: ");
        System.out.println("   Federal Withholding: " + federalTax);
        System.out.println("   State Withholding: " + stateTax);
        System.out.println("   Total Deduction: " + (stateTax + federalTax));
        System.out.println("Net Pay: $" + netPay);


    }
}
