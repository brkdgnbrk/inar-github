package week_10.assignment.question_10_16;

import java.math.BigInteger;

public class BigInteger1 {
    public static void main(String[] args) {
        int count = 0;
        BigInteger n = new BigInteger("10000000000000000000000000000000000000000000000000");
        BigInteger zero = BigInteger.ZERO;  //kalan 0 mı onun için lazım

        while (count < 10) {
            if (n.remainder(new BigInteger("2")).equals(zero) ||
                    n.remainder(new BigInteger("3")).equals(zero)) {
                System.out.println(n);
                count++;
            }
            n = n.add(BigInteger.ONE);
        }
    }
}