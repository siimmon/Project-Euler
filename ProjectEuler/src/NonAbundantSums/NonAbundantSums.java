package NonAbundantSums;

import java.util.ArrayList;

/**
 * Created by u120987 on 10/03/2016.
 */
public class NonAbundantSums {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> sumList = new ArrayList<Integer>();
        int limit = 28124;
        long out = 0;

        for (int i = 0; i < limit; i++) {
            if (typeOfNumber(i) == "Abundant") {
                list.add(i);
            }
        }



        for (int i = 0; i < list.size(); i++) {
            for (int j = i; j < list.size(); j++) {
                int tempNum = list.get(i)+list.get(j);
                if (tempNum < limit) {
                    sumList.add(tempNum);
                }
            }
        }

        for (int i = 1; i < limit; i++) {
            if (sumList.contains(i) == false) {
                out += i;
            }
        }

        System.out.println(out);
    }

    public static String typeOfNumber(int val) {
        if (sumOfDivisors(val) == 1) {
            return "Prime";
        } else if (sumOfDivisors(val) == val) {
            return "Perfect";
        } else if (sumOfDivisors(val) > val) {
            return "Abundant";
        } else if (sumOfDivisors(val) < val) {
            return "Deficient";
        } else {
            return "Unknown";
        }
    }

    public static int sumOfDivisors (int n) {
        int [] vals = theDivisors(n);
        int out = 0;

        for (int i = 0; i < vals.length; i++) {
            out += vals[i];
        }

        return out;
    }

    public static int[] theDivisors (int n) {
        int[] divisors = {1};

        if (isPrime(n)) {
            return divisors;
        }
        else {
            long upTo = 0;
            double upToD = Math.sqrt(n);
            upTo = (long) upToD;
            int count = 0;

            for (int i = 2; i <= upTo; i++) {
                if (n % i == 0) {
                    count+=2;
                }
            }
            count += 1; //add one to val of sum of divisors for 1

            divisors = new int[count];
            divisors[0] = 1;
            for (int i = 1; i < divisors.length-1; i++) {
                for (int j = 2; j <= upTo; j++) {
                    if (n % j == 0) {
                        divisors[i] = j;
                        if(n/j != j) {divisors[i+1] = n/j;};
                    }
                }
            }
        }

       return divisors;
    }

    public static boolean isPrime(long n) {
        for (long i = 2; i < n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

}
