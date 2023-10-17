package week_07.assignment;

public class Question_07_06 {
    public static void main(String[] args) {
        int[] primeNumbers = new int[50];
        int number = 2;
        int primeCount = 0;

        while (primeCount < 50) {
            boolean isPrime = true;

            for (int i = 0; i < primeCount && primeNumbers[i] * 2 <= number; i++) {
                if (number % primeNumbers[i] == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                primeNumbers[primeCount] = number;
                primeCount++;
            }

            number++;
        }


        for (int i = 0; i < 50; i++) {
            System.out.print(primeNumbers[i]);
            if (i < 49) {
                System.out.print(", ");
            }
        }
    }
}
