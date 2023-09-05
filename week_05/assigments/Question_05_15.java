package week_05.assigments;

public class Question_05_15 {
    public static void main(String[] args) {
        final int NUMBER_LINE = 10;
        int count = 0;
        int i = 33;
        for (i = 33; i < 127; i++) {

            if (count % NUMBER_LINE == 0) {
                System.out.println();
            }
            count++;
            System.out.print((char) i+" ");

        }
    }
}
