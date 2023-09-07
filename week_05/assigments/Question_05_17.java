package week_05.assigments;

import java.util.Scanner;

public class Question_05_17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        int count = scanner.nextInt();
        scanner.close();

        if (count < 1 || count > 15) {
            System.out.println("Enter a valid between 1 and 15.");
        } else {
            for (int i = 1; i <= count; i++) { //satır sayısını belirler

                for (int j = 1; j <= count - i; j++) {   //  başatan itibaren boşluk saısını belirler
                    System.out.print("  ");
                }

                for (int j = i; j >= 1; j--) {   // azalan sıraya göre sayıları yazar  mesela 3. satır için  3 2 1
                    System.out.print(j + " ");
                }

                for (int j = 2; j <= i; j++) {    // artan sırayı yazar mesela 3. satır 2 3

                    System.out.print(j + " ");
                }
                System.out.println();
            }
        }
    }
}