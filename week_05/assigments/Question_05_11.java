package week_05.assigments;

public class Question_05_11 {
    public static void main(String[] args) {
        int totalNumber = 200;
        int count = 0;
        final int NUMBERS_PER_LINE = 10;
        for (int i = 100; totalNumber > i; i++) {
            if (i % 30 != 0 && i % 6 == 0 || i % 5 == 0) {
                count++;
                System.out.print(i + " ");
                if (count % NUMBERS_PER_LINE == 0) {

                    System.out.println();

                }
            }

        }
    }
}
