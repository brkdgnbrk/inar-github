package week_02.assignments;

import java.util.Scanner;

public class Question_02_13 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        final double MONTHLY_INTEREST_RATE = 0.00417;

        System.out.print("Enter the monthly saving amount: ");

        double savingAmount=input.nextDouble();


        double totalAmount=(savingAmount)*(1+MONTHLY_INTEREST_RATE);

        totalAmount=(savingAmount+totalAmount)*(1+MONTHLY_INTEREST_RATE);

        totalAmount=(savingAmount+totalAmount)*(1+MONTHLY_INTEREST_RATE);

        totalAmount=(savingAmount+totalAmount)*(1+MONTHLY_INTEREST_RATE);

        totalAmount=(savingAmount+totalAmount)*(1+MONTHLY_INTEREST_RATE);

        totalAmount=(savingAmount+totalAmount)*(1+MONTHLY_INTEREST_RATE);

        System.out.println("After the sixth month,the account value is  $"+(int)(totalAmount*100)/100.0 );


    }
}
