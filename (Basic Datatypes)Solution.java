import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        int a=0;
        int b=0;
        int n =0;
        int sum=0;
        for(int i=0;i<t;i++){
             a = in.nextInt();
             b = in.nextInt();
             n = in.nextInt();
        
        
            sum=(int)a;
            for(int j=0;j<n;j++)
            {
                sum = sum+((int)(Math.pow(2,j))*b);
                System.out.print(sum + " ");
            }

            System.out.println();
        
        }

        in.close();
    }
}

