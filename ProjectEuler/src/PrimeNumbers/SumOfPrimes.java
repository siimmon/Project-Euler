package PrimeNumbers;

/**
 * Created by u120987 on 19/02/2016.
 */
import java.math.*;
public class SumOfPrimes {
    public static void main(String args[]) {
      System.out.println(sumofNums(2000000));
    }

    public static long sumofNums(long val) {
        long out = 0;

        for (int i = 2; i < val; i++) {
            if (isPrime(i)) {
                out += i;
            }
        }
        return out;
    }

    public static boolean isPrime(long n) {
        long upTo = 0;
        double upToD = Math.sqrt(n);
        upTo = (long) upToD;

        for (int i = 2; i <= upTo; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
