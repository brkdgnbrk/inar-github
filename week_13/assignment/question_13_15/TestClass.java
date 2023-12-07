package week_13.assignment.question_13_15;

import week_13.assignment.question_13_15.Rational;

import java.math.BigInteger;

public class TestClass {
    public static void main(String[] args) {

        Rational r1 = new Rational(new BigInteger("5"),
                new BigInteger("6"));
        Rational r2 = new Rational(new BigInteger("1"),
                new BigInteger("4"));


        System.out.println(r1 + " + " + r2 + " = " + r1.add(r2));
        System.out.println(r1 + " - " + r2 + " = " + r1.subtract(r2));
        System.out.println(r1 + " * " + r2 + " = " + r1.multiply(r2));
        System.out.println(r1 + " / " + r2 + " = " + r1.divide(r2));
        System.out.println(r2 + " is " + r2.doubleValue());
    }
}