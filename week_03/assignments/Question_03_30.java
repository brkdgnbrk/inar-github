package week_03.assignments;

import java.util.Scanner;

public class Question_03_30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long totalMilliSeconds = System.currentTimeMillis();
        long totalSecond = totalMilliSeconds / 1000;
        long currentSecond = totalSecond % 60;
        long totalMinutes = totalSecond / 60;
        long currentMinutes = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHours = totalHours % 24;

        System.out.print("Enter the time zone offset to GMT: ");
        int offset = input.nextInt();
        currentHours = (currentHours + offset) % 24;
        if (currentHours >= 12) {
            System.out.println("The current time is " + (currentHours % 12) + " : " + currentMinutes + ":" + currentSecond + " PM");
        } else {
            System.out.println("The current time is " + (currentHours % 12) + " : " + currentMinutes + ":" + currentSecond + " AM");
        }

    }
}
