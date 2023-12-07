package week_10.assignment.question_10_18;

import java.math.BigInteger;

public class SquareNumbers {
    public static void main(String[] args) {
        BigInteger bigInteger = BigInteger.valueOf(Long.MAX_VALUE);
        int count=0;
        while (count < 10) {
            BigInteger square = bigInteger.multiply(bigInteger);

            System.out.println(square);

            count++;


            bigInteger = bigInteger.add(BigInteger.ONE);
        }
    }
}

