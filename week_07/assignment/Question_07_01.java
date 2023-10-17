package week_07.assignment;

import java.util.Scanner;

public class Question_07_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int[] studentScore = new int[input.nextInt()];
        char[] grades = new char[studentScore.length];
        System.out.print("Enter " + studentScore.length + " scores: ");
        for (int i = 0; i < studentScore.length; i++) {
            studentScore[i] = input.nextInt();
        }


        getGrades(studentScore, grades);
        for (int i = 0; i < studentScore.length; i++) {
            System.out.println("Student " + i + " score is " + studentScore[i] + " and grade is " + grades[i]);
        }

    }

    public static int best(int[] studentScore) {
        int best = -1;
        for (int i = 0; i < studentScore.length; i++) {
            if (studentScore[i] > best) {
                best = studentScore[i];
            }

        }
        return best;
    }

    public static void getGrades(int[] studentScore, char[] grades) {
        int best = best(studentScore);
        for (int i = 0; i < studentScore.length; i++) {
            if (studentScore[i] >= best - 10)
                grades[i] = 'A';
            else if (studentScore[i] >= best - 20)
                grades[i] = 'B';
            else if (studentScore[i] >= best - 30)
                grades[i] = 'C';
            else if (studentScore[i] >= best - 40)
                grades[i] = 'D';
            else
                grades[i] = 'F';
        }

    }
}


