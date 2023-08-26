package week_03.assignments;

import java.util.Scanner;

public class Question_03_33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight and price for package 1: ");

        double weightOfPackage1 = input.nextDouble();
        double priceOfPackage1 = input.nextDouble();
        double package1PerOneWeight = weightOfPackage1/priceOfPackage1;

        System.out.print("Enter weight and price for package 2: ");
        double weightOfPackage2 = input.nextDouble();
        double priceOfPackage2 = input.nextDouble();
        double package2PerOneWeight = weightOfPackage2/priceOfPackage2;

        if (priceOfPackage1 > priceOfPackage2) {
            System.out.println("Package 1 has a better price.");
        } else if (priceOfPackage1 == priceOfPackage2) {
            System.out.println("Two packages have the same price");
        } else {
            System.out.println("Package 2 has a better price.");
        }
    }
}
