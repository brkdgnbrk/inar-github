package week_07.assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Question_07_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOfStudent = input.nextInt();
        String[] names = new String[numberOfStudent];
        double[] scores = new double[numberOfStudent];
        for (int i = 0; i < scores.length; i++) {
            names[i] = input.next();
            scores[i] = input.nextDouble();
        }
        for (int i = 0; i < scores.length - 1; i++) {
            for (int j = i + 1; j < scores.length; j++) {
                if (scores[i] < scores[j]) {
                    double tempScore = scores[i];
                    scores[i] = scores[j];
                    scores[j] = tempScore;

                    String tempName = names[i];
                    names[i] = names[j];
                    names[j] = tempName;
                }
            }
        }
        System.out.println(Arrays.toString(scores));
        System.out.println(Arrays.toString(names));
    }
}