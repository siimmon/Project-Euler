package PythagTriplet;

/**
 * Created by u120987 on 19/02/2016.
 */
import java.math.*;
public class PythagTriplet {
    public static void main (String args[]) {



        System.out.println(theOne(1000));
        System.out.println(calculate(1000));
    }

    public static int aSquaredbSquaredRetC (int a, int b) {
        double cD = Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
        if (cD*10 % 10 > 0) {
            return -1;
        }

        int c = (int) cD;

        return c;

    }

    public static boolean isPythagTriplet (int a, int b, int c)   {
        if (a < b && b < c) {
            return true;
        }
        return false;
    }

    public static String theOne (int val) {
        long out = -1;
        int one = -1;
        int two = -1;
        int three = -1;


        for (int i = 0; i < val; i++) {
            for (int j = i+1; j < val; j++) {
                int c = aSquaredbSquaredRetC(i,j);

                if (isPythagTriplet(i,j,c) && i+j+c == val) {
                    out = i*j*c;
                    one = i;
                    two = j;
                    three = c;
                }
            }

        }
        return out+" "+one+" "+two+" "+three;
    }

    //from https://algoexplode.wordpress.com/2013/07/24/special-pythagorean-triplet-project-euler-problem-9/
    public static int calculate(int n){
        for(int a=2;a<n;a++){
            if((n*n-2*n*a)%(2*n-2*a)==0){
                int b=(n*n-2*n*a)/(2*n-2*a);
                int ret= a*b*(n-a-b);
                if(ret>0) return ret;
            }
        }
        return 0;//no Triplet
    }


}
