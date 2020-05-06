import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int maxRepeating(String s) 
    { 
        int len = s.length(); 
        int current_count = 0;
        int prev_count = 0;
        int max = 0;
        for (int i=0; i<len; i++) {              
            if(s.charAt(i) == '1') {
                current_count++;
            } else {
                if (current_count != 0) { 
                prev_count = current_count;
                current_count = 0;
                } else continue;
            }
        }
        if (prev_count > current_count) {
            max = prev_count;
        } else {
            max = current_count;
        }
        return max; 
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        System.out.println(maxRepeating(Integer.toBinaryString(n)));
        scanner.close();
    }
}
