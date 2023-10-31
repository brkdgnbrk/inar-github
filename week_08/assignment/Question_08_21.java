package week_08.assignment;

import java.util.Scanner;

public class Question_08_21 {
    public static void main(String[] args) {
        double[][] coordinates = getValue();
        double centralDistance=centralCity(coordinates);
        totalDistance(coordinates,centralDistance);

    }

    public static double[][] getValue() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of cities: ");
        int numberOfCities = input.nextInt();
        System.out.println("Enter the coordinates of the cities:");
        double[][] coordinates = new double[numberOfCities][2];
        for (int i = 0; i < coordinates.length; i++) {
            for (int j = 0; j < coordinates[0].length; j++) {
                coordinates[i][j] = input.nextDouble();

            }

        }return coordinates;
    }


    public static double centralCity(double coordinates[][]) {
        int p1 = 0;
        int p2 = 1;
        double shortestDistance = distance(coordinates[p1][0], coordinates[p1][1], coordinates[p2][0], coordinates[p2][1]);
        for (int i = 0; i < coordinates.length; i++) {
            for (int j = i + 1; j < coordinates[0].length; j++) {
                double distance = distance(coordinates[i][0], coordinates[i][1], coordinates[j][0], coordinates[j][1]);
                if (shortestDistance > distance) {
                    shortestDistance = distance;
                    p1 = i;
                    p2 = j;
                }
            }
        }
        System.out.println("The central city is at ("+coordinates[p1][0]+", "+coordinates[0][p2]+")");
       return shortestDistance;
    }

    public static void totalDistance(double[][] coordinates,double centralDistance) {
        double totalDistance=0;
        for (int i = 0; i < coordinates.length; i++) {
            for (int j = 0; j < coordinates[0].length; j++) {
                totalDistance += distance(coordinates[i][0], coordinates[i][1], coordinates[j][0], coordinates[j][1]);
            }

        }
        System.out.println("The total distance to all other cities is "+(totalDistance-centralDistance));
    }

    public static double distance(double x0, double y0, double x1, double y1) {
        return Math.sqrt(Math.pow(x1 - x0, 2) + Math.pow(y1 - y0, 2));
    }

}
