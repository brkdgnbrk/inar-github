package week_06.assignment;

import java.util.Scanner;

public class Question_06_25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter milliseconds: ");
        long milliseconds = input.nextLong();
        System.out.println("hours:minutes:seconds: " + convertMillis(milliseconds));

    }

    public static String convertMillis(long millis) {
        long totalSecond = (int) (millis / 1000);
        int hours = (int) (totalSecond / 3600);
        int minute = (int) (((totalSecond % (60 * 60)) / 60));
        int second = (int) ((totalSecond % 60));
        return hours + ":" + minute + ":" + second;
    }
}
