package week_02.assignments;

import java.util.Scanner;

public class Question_02_08 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the time zone offset to GMT: ");

        int offset = input.nextInt();


        long totalMillisecond = System.currentTimeMillis();

        long totalSeconds = totalMillisecond / 1000;

        long currentSecond = totalSeconds % 60;

        long totalMinutes = totalSeconds / 60;

        long currentMinutes = totalMinutes % 60;

        long totalHours = totalMinutes / 60;

        long currentHours = (totalHours+offset) % 24;

        System.out.println("The current time is "+ (currentHours) + " : "+ currentMinutes + " : " + currentSecond);


    }
}
