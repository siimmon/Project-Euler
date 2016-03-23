package FactorialDigitSum;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Created by u120987 on 08/03/2016.
 */



public class FactorialDigitSum {
    public static void main (String[] args) {
        BigDecimal out = BigDecimal.valueOf(1);
        int val = 100;

        for (int i = val; i > 0; i--) {
            out = out.multiply(BigDecimal.valueOf(i));
        }

        BigInteger outBI = out.toBigInteger();

        System.out.println(sumDigit(outBI));
    }

    public static long sumDigit (BigInteger val) {
        String valToString = String.valueOf(val);
        long out = 0;

        for (int i = 0; i < valToString.length(); i++) {
            out += valToString.charAt(i)-48;
        }

        return out;
    }



}


