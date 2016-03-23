package Collatz;


import java.math.*;
public class LongestSeq {
    public static void main(String[] args) {
        System.out.println(collatzSeq(1000000));
    }

    public static long collatzSeq (int maxVal) {
        long max = 0;
        long maxChain = 0;

        for (int i = 1; i < maxVal; i++) {
            long chain = 0;
            long v = i;

            while (v != 1) {
                while((v%2)==1)	{v=(3*v+1)/2; chain+=2;}
				while((v%2)==0)	{v/=2; chain++;}
            }
            if (chain+1 > maxChain) {
                maxChain = chain+1;
                max = i;
            }
        }
        return max;
    }
}
