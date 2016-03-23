package TrianglularNumbers;

/**
 * Created by u120987 on 23/02/2016.
 */
public class TriangularNumbers {
    public static void main (String[] args) {
        int i = 0;
        while (!isMultiple(triangleNumbers(i))) {
            i++;
            }
        System.out.println(triangleNumbers(i));
    }

    public static int triangleNumbers (int val) {
        int out = 0;

        for (int i = 0, j = 1; i < val; j++) {
            out += j;
            i++;
        }

        return out;
    }

    public static boolean isMultiple(int val) {
        int count = 0;
        double valRt = Math.sqrt(val);
        int valRtI = (int) valRt;
        for (int i = valRtI; i >= 1; i--) {
            if (val % i == 0) count+=2;

            if (count == 500) return true;
        }

        return false;

    }
}
