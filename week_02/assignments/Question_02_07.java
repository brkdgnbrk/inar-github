package week_02.assignments;

import java.util.Scanner;

public class Question_02_07 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of minutes ");

        int minutes = input.nextInt();
        int year = minutes / 60 / 24 / 365;
        int day = minutes / 60 / 24 % 365;


        System.out.println(minutes + " minutes is approximately " + year + " years and " + day + " days");
    }
}
