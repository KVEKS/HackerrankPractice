import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);
        int ii = scan.nextInt();
        double dd = scan.nextDouble();
        String ss ="";
        while (scan.hasNext()) {
            ss += scan.nextLine();
        }
        System.out.println(i + ii);
        System.out.println(d + dd);
        System.out.println(s + ss);
        scan.close();
    }
}
