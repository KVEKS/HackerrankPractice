import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        if(!scan.hasNext()) { 
            System.out.print("0"); 
            return; 
        }
        String s = scan.nextLine();
        String[] arrOfStr = s.trim().split("[, ?.@_!']+"); 
        System.out.println(arrOfStr.length);
        
        for (String a : arrOfStr) 
            System.out.println(a); 
        scan.close();
        
    }
}

