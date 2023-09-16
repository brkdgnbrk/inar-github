package week_05.assigments;

import java.util.Scanner;

public class Question_05_36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
        String isbn = input.next();
        int d10 = 0;
        for (int i = 0; i <= 8; i++) {
            d10 += Integer.parseInt(isbn.charAt(i) + "") * (i + 1);

        }
        d10 %= 11;
        for (int j = 0; 8 >= j; j++) {
            int isbnInt = Integer.parseInt(isbn.charAt(j) + "");
            System.out.print(isbnInt);
        }
        if (d10 == 10) {
            System.out.print("X");
        } else {
            System.out.print(d10);

        }
    }
}



