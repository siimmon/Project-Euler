package PrimeNumbers;

/**
 * Created by u120987 on 19/02/2016.
 */
public class PrimeNumbers {
    public static void main(String args[]) {
        System.out.println(primeNumCount(10001));
    }

    public static boolean isPrime(long n) {
        for (long i = 2; i < n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static long primeNumCount(long n) {
        long out = 2;

        for (long i = 1, j = out; i <= n; j++) {
            if (isPrime(j)) {
                out = j;
                i++;
            }
        }
        return out;

    }
}
