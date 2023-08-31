package week_04.assignment;

import java.util.Locale;
import java.util.Scanner;

public class Question_04_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = input.nextInt();
        System.out.print("Enter a month: ");
        String month = input.next();
        char ch = month.toUpperCase().charAt(0);
        String str = month.substring(1, 3);
        switch (month) {
            case "Jan":
                System.out.println(ch + str + " " + year + " has 31 days");
                break;
            case "Feb":
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    System.out.println(ch + str + " " + year + " has 29 days");
                } else {
                    System.out.println(ch + str + " " + year + " has 28 days");
                }
                break;
            case "Mar":
                System.out.println(ch + str + " " + year + " has 31 days");
                break;
            case "Apr":
                System.out.println(ch + str + " " + year + " has 30 days");
                break;
            case "May":
                System.out.println(ch + str + " " + year + " has 31 days");
                break;
            case "Jun":
                System.out.println(ch + str + " " + year + " has 30 days");
                break;
            case "Jul":
                System.out.println(ch + str + " " + year + " has 31 days");
                break;
            case "Aug":
                System.out.println(ch + str + " " + year + " has 31 days");
                break;
            case "Sep":
                System.out.println(ch + str + " " + year + " has 30 days");
                break;
            case "Nov":
                System.out.println(ch + str + " " + year + " has 31 days");
                break;
            case "Oct":
                System.out.println(ch + str + " " + year + " has 30 days");
                break;
            case "Dec":
                System.out.println(ch + str + " " + year + " has 31 days");
                break;
        }

    }

/*
public class Question_04_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = input.nextInt();
        input.nextLine(); // Önceki girdiden kalan yeni satır karakterini temizle
        System.out.print("Enter a month: ");
        String month = input.nextLine();
        char ch = month.toUpperCase().charAt(0);
        String str = month.substring(1, 3);
        int days = 0; // Ayın kaç gün çektiğini saklamak için bir değişken

        switch (month) {
            case "Jan":
            case "Mar":
            case "May":
            case "Jul":
            case "Aug":
            case "Oct":
            case "Dec":
                days = 31;
                break;
            case "Apr":
            case "Jun":
            case "Sep":
            case "Nov":
                days = 30;
                break;
            case "Feb":
                // Şubat'ın gün sayısını hesaplayalım
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    days = 29; // Artık yıl
                } else {
                    days = 28; // Normal yıl
                }
                break;
            default:
                System.out.println("Invalid month");
                return; // Geçersiz ay için programı sonlandır
        }

        System.out.println(ch + str + " " + year + " has " + days + " days");
    }
*/
}