package week_06.assignment;

public class Question_06_28 {
    public static void main(String[] args) {
        System.out.println("p               2^p-1");
        System.out.println("--------------------------");
        for (int i = 2; i < 32; i++) {
            double mersenne = mersennePrime(i);
            if (mersenne != 0) {
                System.out.printf("%-5d %15.0f\n",i,mersenne);
            }
        }

    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int divisor = 2; divisor <= Math.sqrt(number); divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }
        return true;
    }

    public static double mersennePrime(int number) {
        if (isPrime(number)) {
            double mersenne = Math.pow(2, number) - 1;
            return mersenne;
        }return 0;
    }

}


