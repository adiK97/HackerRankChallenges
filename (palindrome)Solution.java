import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        StringBuilder newstr = new StringBuilder();
        newstr.append(A);
        /* Enter your code here. Print output to STDOUT. */
        if((newstr.toString()).compareTo((newstr.reverse()).toString())==0)
            System.out.println("Yes");
        else
            System.out.println("No");
        
    }
}



