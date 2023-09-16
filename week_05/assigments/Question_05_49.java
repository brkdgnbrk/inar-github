package week_05.assigments;

import java.util.Scanner;

public class Question_05_49 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        int count = 0;
        int count1 = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.toUpperCase().charAt(i);
            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                count++;
            } else if (ch >= 'A' && ch <= 'Z') {
                count1++;

            }

        }
        System.out.println("The number of vowel is " + count + "\nThe number of consonants is " + count1);
    }
}