package week_04.assignment;

import java.util.Scanner;

public class Question_04_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Enter point 1 (latitude and longitude) in degrees: ");
        double latitude1 = input.nextDouble();
        double longitude1 = input.nextDouble();
        double latitude1Radian = Math.toRadians(latitude1);
        double longitude1Radian = Math.toRadians(longitude1);

        System.out.print("Enter point 2 (latitude and longitude) in degrees: ");
        double latitude2 = input.nextDouble();
        double longitude2 = input.nextDouble();
        double latitude2Radian = Math.toRadians(latitude2);
        double longitude2Radian = Math.toRadians(longitude2);

        final double AVERAGE_EARTH_RADIUS = 6371.01;
        double distance = AVERAGE_EARTH_RADIUS * (Math.acos(Math.sin(latitude1Radian) * Math.sin(latitude2Radian) + Math.cos(latitude1Radian) * Math.cos(latitude2Radian) * Math.cos(longitude1Radian - longitude2Radian)));

        System.out.println("The distance between the two points is " + distance);
    }
}
