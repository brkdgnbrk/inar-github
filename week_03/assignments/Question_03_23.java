package week_03.assignments;

import java.util.Scanner;

public class Question_03_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a point with two coordinates: ");
        double point1 = input.nextDouble();
        double point2 = input.nextDouble();
        double width = 10.0 / 2;
        double height = 5.0 / 2;
        if ((Math.pow(Math.pow(point1, 2), 0.5) <= width && (Math.pow(Math.pow(point2, 2), 0.5)) <= height)) {
            System.out.println("Point " + "( " + point1 + " , " + point2 + " )" + " is in the retangle");

        } else {
            System.out.println("Point " + "( " + point1 + " , " + point2 + " )" + " is not in the retangle");
        }
    }
}