package LexPerms;

/**
 * Created by Simon on 11/08/2016.
 */
import java.util.*;

class LexPerms {
    public String decToFac(int in) {
        String ret = "";
        int fac = 1;

        while (in > 0) {
            if (in%fac < 10) {
                ret = in%fac+ret;
            } else {
                if (in%fac == 10) {
                    ret = 'A'+ret;
                }
                if (in%fac == 11) {
                    ret = 'B'+ret;
                }
                if (in%fac == 12) {
                    ret = 'C'+ret;
                }
            }

            in = in/fac;
            fac++;
        }
        return ret;
    }

    public static void main(String[] args) {
        LexPerms a = new LexPerms();
        Scanner in = new Scanner(System.in);
        int size = 1;

        for (int i = 0; i < size; i++) {
            char[] letters = {'0','1','2','3','4','5','6','7','8','9'};
            ArrayList<Character> listOfChars = new ArrayList<Character>();

            for (char c : letters) {
                listOfChars.add(c);
            }

            String facToUse = a.decToFac(999999);
            String out = "";
            while (!(listOfChars.isEmpty())) {
                if (listOfChars.size() > facToUse.length()) {
                    out = out+listOfChars.get(0);
                    listOfChars.remove(0);
                }
                else {
                    for (int j = 0; j < facToUse.length(); j++) {
                        int indexToGet = -1;
                        if (Character.isLetter(facToUse.charAt(j))) {
                            if (facToUse.charAt(j) == 'A') {
                                indexToGet = 10;
                            } else
                            if (facToUse.charAt(j) == 'B') {
                                indexToGet = 11;
                            } else
                            if (facToUse.charAt(j) == 'C') {
                                indexToGet = 12;
                            }
                        }
                        else {
                            indexToGet = Character.getNumericValue(facToUse.charAt(j));
                        }

                        out = out+listOfChars.get(indexToGet);
                        listOfChars.remove(indexToGet);
                    }
                }
            }


            System.out.print(out+" ");
        }


    }
}