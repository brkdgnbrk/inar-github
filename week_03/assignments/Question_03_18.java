package week_03.assignments;

import java.util.Scanner;

public class Question_03_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the weight of the package(in pounds) : ");
        double weight = input.nextDouble();
        if (0 < weight && weight <= 1) {
            System.out.println("Shipping cost of package is " + "$" + weight * 3.5);
        } else if (weight <= 3) {
            System.out.println("Shipping cost of package is " + "$" + weight * 5.5);
        } else if (weight <= 10) {
            System.out.println("Shipping cost of package is " + "$" + weight * 8.5);
        } else if (weight <= 20) {
            System.out.println("Shipping cost of package is " + "$" + weight * 10.5);
        } else {
            System.out.println("The package cannot be shipped");
        }
    }
}
