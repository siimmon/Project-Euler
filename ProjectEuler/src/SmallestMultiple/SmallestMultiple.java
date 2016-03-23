package SmallestMultiple;

/**
 * Created by u120987 on 19/02/2016.
 */
public class SmallestMultiple {
    public static void main(String args[]) {
        System.out.println(smallestMultiple(20));
    }

    public static long smallestMultiple(long n) {
        for (long i = n; i <= factorial(n); i+=n) {
            if (isMultiple(i,n)) return i;
        }
        return -1;
    }

    public static boolean isMultiple(long x, long n) {
        for (long i = n; i >= 1; i--) {
            if (x % i > 0) return false;
        }
        return true;
    }

    public static long factorial(long n) {
        if (n==1) return 1;
        else return (n*factorial(n-1));
    }
}
