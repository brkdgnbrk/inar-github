package week_05.assigments;

public class Question_05_20 {
    public static void main(String[] args) {
        int endValue = 1000;
        int startValue = 2;
        final int NUMBER_PER_LINE = 8;
        int count = 0;

        for (startValue = 2; startValue < endValue; startValue++) {
            boolean isPrime = true;
            for (int i = 2; 2 <= endValue / 2; i++) {
                if (startValue % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(startValue + " ");
            }
        }
    }
}