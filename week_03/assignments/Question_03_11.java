package week_03.assignments;

import java.util.Scanner;



public class Question_03_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the month as integer: ");
        int monthNumber = input.nextInt();
        System.out.print("Enter the year as integer: ");
        int yearNumber = input.nextInt();

        boolean leapYear=(yearNumber%4==0 && yearNumber%100!=0)||yearNumber%400==0;

        switch (monthNumber) {
            case 1:
                System.out.print("January "+yearNumber+ " had 31 days");break;
            case 2:
                System.out.println("February " + yearNumber+" had " +((leapYear)? "29 days":"28 days"));break;
            case 3:
                System.out.print("March "+yearNumber+ " had 31 days");break;
            case 4:
                System.out.print("April "+yearNumber+ " had 30 days");break;
            case 5:
                System.out.print("May "+yearNumber+ " had 31 days");break;
            case 6:
                System.out.print("June "+yearNumber+ " had 30 days");break;
            case 7:
                System.out.print("July "+yearNumber+ " had 31 days");break;
            case 8:
                System.out.print("August "+yearNumber+ " had 31 days");break;
            case 9:
                System.out.print("September "+yearNumber+ " had 30 days");break;
            case 10:
                System.out.print("October "+yearNumber+ " had 31 days");break;
            case 11:
                System.out.print("November "+yearNumber+ " had 30 days");break;
            case 12:
                System.out.print("December "+yearNumber+ " had 31 days");break;
        }


        }
    }
