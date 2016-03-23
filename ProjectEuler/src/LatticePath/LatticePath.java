package LatticePath;

/**
 * Created by u120987 on 25/02/2016.
 */
import java.math.*;
public class LatticePath {
    public static void main(String[] args) {
        double outD = centralBinomialCoefficients(20);
        BigInteger out = new BigDecimal(outD).toBigInteger();
        System.out.println(out);
    }

    public static double centralBinomialCoefficients(long in) {
        return factorial(2*in) / Math.pow(factorial(in),2);
    }

    public static double factorial(long n) {
        if (n==1) return 1;
        else return (n*factorial(n-1));
    }
}
