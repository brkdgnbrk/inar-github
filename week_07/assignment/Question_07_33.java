package week_07.assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Question_07_33 {
    public static void main(String[] args) {
        String[] zodiac = {"monkey", "rooster", "dog", "pig", "rat", "ox", "tiger", "rabbit", "dragon", "snake", "horse", "sheep" };
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = input.nextInt();
        System.out.print(year+" is a year of "+zodiac[year % 12]+" in zodiac");

    }
}