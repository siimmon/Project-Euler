package MaxPathSum;

/**
 * Created by u120987 on 01/03/2016.
 */
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MaxPathSum {
    public static void main(String[] args) throws IOException {
        String s = "C:\\Users\\u120987\\IdeaProjects\\Si projects - local\\Project Euler\\src\\MaxPathSum\\prob.txt";
        int[][] Triangle = readFile(s);

        int lines = Triangle.length;
        for (int i = lines-2; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                Triangle[i][j] += Math.max(Triangle[i+1][j],Triangle[i+1][j+1]);
            }
        }

        System.out.println(Triangle[0][0]);
    }

    public static int[][] readFile (String filename) throws IOException {
        int[][] Triangle = {{0}, {0}};
        try {
            FileReader fr = new FileReader(filename);
            FileReader fr2 = new FileReader(filename);
            BufferedReader br = new BufferedReader(fr);
            BufferedReader br2 = new BufferedReader(fr2);

            String S;
            String Sline[];
            int lines = 0;

            while ((S = br.readLine()) != null) {         /* while line in buffer is not null then lines++ */
                lines++;
            }

            Triangle = new int[lines][lines];       /* change triangle to size of lines */
            Sline = new String[lines];              /* change sline string array to size of lines i.e. 0's on end */

            int j = 0;

            while ((S = br2.readLine()) != null) {
                Sline = S.split(" ");
                for (int i = 0; i < Sline.length; i++) {
                    Triangle[j][i] = Integer.parseInt(Sline[i]);
                }
                j++;
            }

            fr.close();
            fr2.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error reading file");
        }
        return Triangle;
    }

}

