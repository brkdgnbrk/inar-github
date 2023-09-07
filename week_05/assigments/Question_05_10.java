package week_05.assigments;

public class Question_05_10 {
    public static void main(String[] args) {
        int totalNumber = 1000;
        int firstNumber;
        final int NUMBERS_PER_LINE = 10;
        int count = 0;
        for (firstNumber = 100; totalNumber > firstNumber; firstNumber++) {
            if (firstNumber % 5 == 0 && firstNumber % 6 == 0) {
                System.out.print(firstNumber+" ");
                count++;
                if ((count % NUMBERS_PER_LINE) == 0) {
                    System.out.println();
                }

                }
            }
        }
    }

