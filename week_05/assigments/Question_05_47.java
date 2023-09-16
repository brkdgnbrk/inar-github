package week_05.assigments;

import java.util.Scanner;

public class Question_05_47 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first 12 digits of an ISBN-13 as a string: ");
        String isbn = input.nextLine();
        char sum = 0;
        int sum1 = 0;
        int sum2 = 0;
        if (isbn.length() < 12) {
            System.out.println("İnvalid input");
        } else {
            for (int i = 0; i < isbn.length(); i++) {
                sum = isbn.charAt(i);
                if ((i + 1) % 2 == 0) {
                    sum1 += 3 * Character.getNumericValue(sum);
                } else {
                    sum2 += Character.getNumericValue(sum);

                }
            }
            int sum3 = 10 - (sum1 + sum2) % 10;
            if (sum3 == 10) {
                System.out.print(isbn + "0");
            } else {
                System.out.println(isbn + sum3);
            }
        }
    }
}