package week_09.assignment.question_09_04;

import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        Random random = new Random();

        int countNumber = 0;
        int line = 10;
        while (countNumber != 50) {
            int number = random.nextInt(100);
            countNumber++;
            if (countNumber % line != 0) {
                System.out.printf("%3d", number);
            } else {
                System.out.println(" " + number);
            }

        }
    }
}
