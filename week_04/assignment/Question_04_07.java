package week_04.assignment;

import java.util.Scanner;

public class Question_04_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of the bounding circle: ");
        double radius = input.nextDouble();

        double oneEdgeDistance = 2 * Math.PI / 5;
        double x1 = radius * Math.cos(0);
        double y1 = radius * Math.sin(0);
        double x2 = radius * Math.cos(oneEdgeDistance);
        double y2 = radius * Math.sin(oneEdgeDistance);
        double x3 = radius * Math.cos(2 * oneEdgeDistance);
        double y3 = radius * Math.sin(2 * oneEdgeDistance);
        double x4 = radius * Math.cos(3 * oneEdgeDistance);
        double y4 = radius * Math.sin(3 * oneEdgeDistance);
        double x5 = radius * Math.cos(4 * oneEdgeDistance);
        double y5 = radius * Math.sin(4 * oneEdgeDistance);

        System.out.println("The coordinates of five points on the pentagon are:");
        System.out.println(x1 + "," + y1);
        System.out.println(x2 + "," + y2);
        System.out.println(x3 + "," + y3);
        System.out.println(x4 + "," + y4);
        System.out.println(x5 + "," + y5);
    }
}