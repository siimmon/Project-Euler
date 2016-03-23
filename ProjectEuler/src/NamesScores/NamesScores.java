package NamesScores;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

/**
 * Created by u120987 on 09/03/2016.
 */
public class NamesScores {
    public static void main(String[] args) throws IOException {
        long lStartTime = System.currentTimeMillis();
        String s = "C:\\Users\\u120987\\IdeaProjects\\Si projects - local\\Project Euler\\src\\NamesScores\\p022_names.txt";
        String[] names = namesArray(s);
        Arrays.sort(names);

        long totalVal = 0;

        for (int i = 0; i < names.length; i++) {
            int val = 0;
            String name = names[i];

            for (int j = 0; j < name.length(); j++) {
                if (name.charAt(j) == '"') {
                    //ignore quote
                }
                else {
                    val = (Character.getNumericValue(name.charAt(j))-9)*(i+1);
                    totalVal += val;
                }
            }
        }

        System.out.println(totalVal);

        long lEndTime = System.currentTimeMillis();
        double difference = lEndTime - lStartTime;
        System.out.println(difference/1000);

      /*  String name = "colin";

        for (int i = 0; i < name.length(); i++) {
            System.out.println(Character.getNumericValue(name.charAt(i))-9);
        }*/

    }

    public static String[] namesArray (String filename) throws IOException {
        String[] names = {};

        try {
            FileReader fr = new FileReader(filename);
            FileReader fr2 = new FileReader(filename);
            BufferedReader br = new BufferedReader(fr);
            BufferedReader br2 = new BufferedReader(fr2);

            String S;
            String Sline[];
            int count = 0;

            while ((S = br.readLine()) != null) {
                for (int i = 0; i < S.length(); i++) {
                    if (S.charAt(i) == ',') {
                        count++;
                    }
                }
            }
            count += 1; //add one for first name

            names = new String[count];
            Sline = new String[count];

            while ((S = br2.readLine()) != null) {
                Sline = S.split(",");
                for (int i = 0; i < Sline.length; i++) {
                    names[i] = Sline[i];
                }
            }

            fr.close();
            fr2.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error reading file");
        }
        return names;
    }
}
