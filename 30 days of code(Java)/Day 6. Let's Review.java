import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int lines = Integer.parseInt(reader.readLine());
        for (int j = 0; j < lines; j++) {
            String left = "";
            String right = "";
            String line = reader.readLine();
            char[] charArr = line.toCharArray();
            for (int i = 0; i < charArr.length; i++) {
                if (i % 2 == 0) {
                    left += charArr[i];
                } else {
                    right += charArr[i];
                }
            }
            System.out.println(left + " " + right);
        }        
    }
}
