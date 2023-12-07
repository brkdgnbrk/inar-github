package week_13.assignment.question_13_18;

import java.math.BigInteger;

public class TestClass {
    public static void main(String[] args) {
        // Create a Rational object
        Rational r = new Rational(BigInteger.ONE, new BigInteger("2"));

        // Add a series of Rationol objects to r
        for (BigInteger i = r.getNumerator().add(BigInteger.ONE);
             i.compareTo(new BigInteger("100")) <= 0;
             i = i.add(BigInteger.ONE)) {
            r = r.add(new Rational(i, i.add(BigInteger.ONE)));
        }


        System.out.println(r);
    }
}
