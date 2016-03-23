package PowerDigitSum;

/**
 * Created by u120987 on 25/02/2016.
 */
import java.math.*;
public class PowerDigitSum {
    public static void main(String args[]) {

        System.out.println(sumDigit(powerDigit(2,1000)));
    }

    public static BigInteger powerDigit(double val, double pow) {
        double outD = Math.pow(val, pow);
        BigInteger out = new BigDecimal(outD).toBigInteger();

        return out;
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
