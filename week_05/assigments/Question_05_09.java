package week_05.assigments;

import java.util.Scanner;

public class Question_05_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String highestScoreName = "";
        String secondHighestScoreName = "";
        int highestScore = 0;
        int secondHighestScore = 0;
        int count = 0;
        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();
        int score = 0;
        String name = "";
        System.out.println("Enter each student' name and score: ");
        for (int i = 0; numberOfStudents > i; i++) {
            name = input.next();
            score = input.nextInt();
            count++;
            System.out.println("Student: " + count + "\n    Name: " + name + "\n    Score: " + score);

            if (score > highestScore) {
                secondHighestScore = highestScore;
                secondHighestScoreName = highestScoreName;

                highestScore = score;
                highestScoreName = name;

            } else if (score > secondHighestScore) {
                secondHighestScore = score;
                secondHighestScoreName = name;

            }

        }
        System.out.println("The highest scoring student: " + highestScoreName.toUpperCase());
        System.out.println("The second highest scoring student: " + secondHighestScoreName.toUpperCase());
    }
}