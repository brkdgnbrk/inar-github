package week_02.assignments;

import java.util.Scanner;

public class Question_02_05 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the subtotal and a gratuity rate: ");
        double subtotal = input.nextDouble();
        double gratuityRate = input.nextDouble();

        double gratuity = subtotal *( gratuityRate / 100.0);
        double total = subtotal + gratuity;
        System.out.print("The gratuity is " + "$" + gratuity + " and total is " + "$" + total);
    }
}
