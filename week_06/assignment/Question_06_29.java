package week_06.assignment;

public class Question_06_29 {
    public static void main(String[] args) {
        for (int i = 2; i < 1000; i++) {
            if (isTwinPrime(i)) {
                System.out.println("(" + i + ", " + (i + 2) + ")");
            }
        }
    }

    public static boolean isPrime(int number) {
        for (int divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }

        return true;
    }

    public static boolean isTwinPrime(int number) {
        return isPrime(number) && isPrime(number + 2);
    }

}


