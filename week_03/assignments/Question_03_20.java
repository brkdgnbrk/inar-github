package week_03.assignments;

import java.util.Scanner;

public class Question_03_20 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the temperature in Fahrenheit between -58°F and 41°F: ");

        double temperature = input.nextDouble();

        System.out.println("Enter the wind speed (>=2) in miles per hour: ");

        double speed = input.nextDouble();

        double windChillIndex = 35.74 + (0.6215 * temperature) - (35.75 * Math.pow(speed, 0.16)) + (0.4275 * temperature * Math.pow(speed, 0.16));

        if (-58 < temperature && temperature < 41 && speed >= 2) {
            System.out.println("The wind chill index is " + windChillIndex);
        } else if (speed < 2 && temperature > 40 || temperature < -58) {
            System.out.println("The temperature and the speed invalid");
        } else if (temperature > 40 || temperature < -58) {
            System.out.println("The temperature invalid");
        } else if (speed < 2) {
            System.out.println("The speed invalid");
        }


    }

}


