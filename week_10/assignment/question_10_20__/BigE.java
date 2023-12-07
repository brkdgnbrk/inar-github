package week_10.assignment.question_10_20__;

import java.math.BigInteger;

public class BigE {
    public static void main(String[] args) {
        /*  double e=1.0;
        double firstValue=1.0;
        for (int i = 1; i <100000 ; i++) {
            firstValue=firstValue/i;
            e+=firstValue;
            if (i%10000==0){
                System.out.println("e at i= "+i+" is "+e);*/

        BigInteger firstValue = new BigInteger("1");
        BigInteger bigIntegerE = BigInteger.ZERO;

        System.out.println("The e values for i=100 to 1000: ");
        System.out.println("i                    e\n---------------------------");
        for (BigInteger i = new BigInteger("1"); i.compareTo(new BigInteger("1000")) <= 0; i = i.add(new BigInteger("1"))) {
            BigInteger denominator = i;
            for (BigInteger k = i.subtract(firstValue);
                 k.compareTo(firstValue) >= 1;
                 k = k.subtract(firstValue)) {
                denominator = denominator.multiply(k);
            }


        }
    }
}