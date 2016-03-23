package NumberLetterCount;

/**
 * Created by u120987 on 25/02/2016.
 */
public class NumberLetterCount {

    public static final String[] units = {
            "", "one", "two", "three", "four", "five", "six", "seven",
            "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen",
            "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"
    };

    public static final String[] tens = {
            "",        // 0
            "",        // 1
            "twenty",  // 2
            "thirty",  // 3
            "forty",   // 4
            "fifty",   // 5
            "sixty",   // 6
            "seventy", // 7
            "eighty",  // 8
            "ninety"   // 9
    };

    public static String convert(final int n) {
        if (n < 0) {
            return "minus " + convert(-n);
        }

        if (n < 20) {
            return units[n];
        }

        if (n < 100) {
            return tens[n / 10] + ((n % 10 != 0) ? " " : "") + units[n % 10];
        }

        if (n < 1000) {
            return units[n / 100] + " hundred" + ((n % 100 != 0) ? " and " : "") + convert(n % 100);
        }

        if (n < 1000000) {
            return convert(n / 1000) + " thousand" + ((n % 1000 != 0) ? " " : "") + convert(n % 1000);
        }

        return null;
    }

    public static int convertToLetterCount (String in) {
        int out = 0;

        for (int i = 0; i < in.length(); i++) {
            char c = in.charAt(i);
            String cS = Character.toString(c);

            if (cS.equals(" ")) {
                // do nothing
            } else {
                out++;
            }
        }
        return out;
    }

    public static void main(String args[]) {
        long out = 0;
        for (int i = 1; i <= 1000; i++) {
            out += convertToLetterCount(convert(i));
        }
        System.out.println(out);
    }
}
