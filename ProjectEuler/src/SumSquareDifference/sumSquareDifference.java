package SumSquareDifference;

/**
 * Created by u120987 on 19/02/2016.
 */
import java.math.*;

public class sumSquareDifference {
    public static void main(String args[]) {
        long val = 100;

        System.out.println(Math.pow(sumSquare(val),2)-squareNaturalNum(val));

    }

    public static long squareNaturalNum (long n) {
        long tot = 0;

        for (int i = 1; i <= n; i++) {
            tot += Math.pow(i,2);
        }

        return tot;
    }

    public static long sumSquare(long n) {
        if (n == 1) return 1;

        return (n+(sumSquare(n-1)));
    }

}

