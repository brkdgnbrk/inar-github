package week_03.assignments;

import java.util.Scanner;

public class Question_03_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the amount (e.g 11,56) : ");
        double money = input.nextDouble();
        int remainder = (int) (money * 100);

        System.out.println("Your amount " + money + " consist of");

        int dollar = remainder / 100;
        remainder = remainder % 100;

        int quarter = remainder / 25;
        remainder = remainder % 25;

        int dime = remainder / 10;
        remainder = remainder % 10;

        int nickel = remainder / 5;
        remainder = remainder % 5;

        int penny = remainder;

        System.out.println(dollar + ((dollar>1)?" dollars":" dollar"));
        System.out.println(quarter + ((quarter>1)?" quarters":" quarter"));
        System.out.println(dime + ((dime>1)?" dimes":" dime"));
        System.out.println(nickel + ((nickel>1)?" nickels":" nickel"));
        System.out.println(penny + ((penny>1)?" pennies":" penny"));

    }

}


