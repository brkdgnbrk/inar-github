package week_08.assignment;

import java.util.Scanner;

public class Question_08_37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[][] capitals = {{"Türkiye", "Ankara"},
                {"Fransa", "Paris"},
                {"ispanya", "Madrid"},
                {"İngiltere", "Londra"},
                {"Amerika", "New York"},};
        int correctCount = 0;
        for (int i = 0; i < capitals.length; i++) {
            System.out.print("What is the capital of " + capitals[i][0] + "? ");
            String capital = input.nextLine();
            if (capital.equalsIgnoreCase(capitals[i][1])) {
                System.out.println("Your answer is correct");
                correctCount++;
            } else {
                System.out.println("The correct answer should be " + capitals[i][1]);

            }

        }
        System.out.println("The correct count is " + correctCount);
    }
}