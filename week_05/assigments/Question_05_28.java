package week_05.assigments;

import java.util.Scanner;

public class Question_05_28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = input.nextInt();
        System.out.print("Enter the first day of the year : ");
        int firstDayOfYear = input.nextInt();

        for (int month = 1; month <= 12; month++) {
            String monthName = "";
            int daysInMonth = 0;

            switch (month) {
                case 1:
                    monthName = "January";
                    daysInMonth = 31;
                    break;
                case 2:
                    monthName = "February";
                    daysInMonth = (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) ? 29 : 28; // Şubat gün sayısı
                    break;
                case 3:
                    monthName = "March";
                    daysInMonth = 31;
                    break;
                case 4:
                    monthName = "April";
                    daysInMonth = 30;
                    break;
                case 5:
                    monthName = "May";
                    daysInMonth = 31;
                    break;
                case 6:
                    monthName = "June";
                    daysInMonth = 30;
                    break;
                case 7:
                    monthName = "July";
                    daysInMonth = 31;
                    break;
                case 8:
                    monthName = "August";
                    daysInMonth = 31;
                    break;
                case 9:
                    monthName = "September";
                    daysInMonth = 30;
                    break;
                case 10:
                    monthName = "October";
                    daysInMonth = 31;
                    break;
                case 11:
                    monthName = "November";
                    daysInMonth = 30;
                    break;
                case 12:
                    monthName = "December";
                    daysInMonth = 31;
                    break;
            }

            String dayName = "";
            switch (firstDayOfYear) {
                case 0:
                    dayName = "Sunday";
                    break;
                case 1:
                    dayName = "Monday";
                    break;
                case 2:
                    dayName = "Tuesday";
                    break;
                case 3:
                    dayName = "Wednesday";
                    break;
                case 4:
                    dayName = "Thursday";
                    break;
                case 5:
                    dayName = "Friday";
                    break;
                case 6:
                    dayName = "Saturday";
                    break;
            }

            System.out.println(monthName + " 1, " + year + " is " + dayName);
            firstDayOfYear = (firstDayOfYear + daysInMonth) % 7;
        }
    }

}







