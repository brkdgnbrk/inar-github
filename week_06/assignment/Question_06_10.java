package week_06.assignment;

public class Question_06_10 {
    public static void main(String[] args) {
        final int number = 10000;
        int count = 0;
        for (int num = 2; num <number ; num++) {
            if (isPrime(num)) {
                count++;
            }

        }
        System.out.println("The number of prime numbers less than 10,000 is: " + count);
    }


    public static boolean isPrime(int number) {
        for (int divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }

        return true;

    }
}
