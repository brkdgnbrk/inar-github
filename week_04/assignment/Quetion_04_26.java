package week_04.assignment;

import java.util.Scanner;

public class Quetion_04_26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount in dollars and cents: ");
        String money = input.next();
        String dollar = money.substring(0, money.indexOf('.'));
        int cents = Integer.parseInt(money.substring(money.indexOf('.') + 1));

        int quarters = cents / 25;
        cents %= 25;

        int dimes = cents / 10;
        cents %= 10;

        int nickels = cents / 5;
        cents %= 5;

        System.out.println("Equivalent in Monetary Units: ");
        System.out.println("Dollars: " + dollar);
        System.out.println("Quarters: " + quarters);
        System.out.println("Dimes: " + dimes);
        System.out.println("Nickels: " + nickels);
        System.out.println("Pennies: " + cents);

    }
}
