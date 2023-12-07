package week_10.assignment.question_10_21;

import java.math.BigInteger;

public class Divisible {
    public static void main(String[] args) {
        final int NUMBERS_TO_FIND = 10;

        BigInteger currentNumber = BigInteger.valueOf(Long.MAX_VALUE).add(BigInteger.ONE);
        int foundCount = 0;

        System.out.println("First " + NUMBERS_TO_FIND + " numbers greater than Long.MAX_VALUE that are divisible by 5 or 6:");

        while (foundCount < NUMBERS_TO_FIND) {
            if (isDivisibleBy5Or6(currentNumber)) {
                System.out.println(currentNumber);
                foundCount++;
            }

            currentNumber = currentNumber.add(BigInteger.ONE);
        }
    }

    private static boolean isDivisibleBy5Or6(BigInteger number) {
        return number.remainder(BigInteger.valueOf(5)).equals(BigInteger.ZERO) ||
                number.remainder(BigInteger.valueOf(6)).equals(BigInteger.ZERO);
    }
}