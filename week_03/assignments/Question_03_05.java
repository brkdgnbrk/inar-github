package week_03.assignments;

import javax.swing.*;
import java.util.Scanner;

public class Question_03_05 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter today's day: ");
        int today = input.nextInt();
        System.out.println("Enter the number of days elapsed since today: ");
        int numberOfDaysElapsed = input.nextInt();
        int futureDay = (today + numberOfDaysElapsed) % 7;

        if (today == 0) {
            System.out.print("Today is Sunday");
        } else if (today == 1) {
            System.out.print("Today is Monday ");
        } else if (today == 2) {
            System.out.print("Today is Tuesday");
        } else if (today == 3) {
            System.out.print("Today is Wednesday");
        } else if (today == 4) {
            System.out.print("Today is Thursday");
        } else if (today == 5) {
            System.out.print("Today is Friday");
        } else if (today == 6) {
            System.out.print("Today is Saturday");
        }
        if (futureDay == 0) {
            System.out.print("and the future day is Sunday");
        } else if (futureDay == 1) {
            System.out.print("and the future day is Monday ");
        } else if (futureDay == 2) {
            System.out.print("and the future day is Tuesday");
        } else if (futureDay == 3) {
            System.out.print("and the future day is Wednesday");
        } else if (futureDay == 4) {
            System.out.print("and the future day is Thursday");
        } else if (futureDay == 5) {
            System.out.print("and the future day is Friday");
        } else if (futureDay == 6) {
            System.out.print("and the future day is Saturday");

        }
    }
}