package AmicableNumbers;

/**
 * Created by u120987 on 09/03/2016. yoyo testtest
 */
public class AmicableNumbers {
    public static void main(String[] args) {
        int out = 0;

        for (int i = 0; i < 10000; i++) {
            out += isAmicableNum(i);
        }

        System.out.println(out);
    }

    public static boolean isDivisor (int num, int div) {
        if (num % div == 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public static int isAmicableNum (int val) {
        int valOut = 1;

        for (int i = 2; i < val; i++) {
            if (isDivisor(val,i)) {
                if (val/i > i) {
                    valOut += i;
                    valOut += val/i;
                }
            }
        }

        int potAmicableNum = valOut;
        int potAmicableOut = 1;

        for (int i = 2; i < potAmicableNum; i++) {
            if (isDivisor(potAmicableNum,i)) {
                if (potAmicableNum/i > i) {
                    potAmicableOut += i;
                    potAmicableOut += potAmicableNum/i;
                }
            }
        }

        if (potAmicableOut == val && val < potAmicableNum) {
              return val + potAmicableNum;
                //return true;
        }
        else {
            return 0;
            //return false;
        }
    }
}
