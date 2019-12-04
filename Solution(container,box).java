import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.Arrays;

public class Solution {

    // Complete the organizingContainers function below.
    static String organizingContainers(int[][] container, int n) {

        int[] box = new int[n];
        int[] ball = new int[n];
        int sum1 = 0;
        int sum2 = 0;
        for(int i=0;i<n;i++){
            sum1 = 0;
            sum2 = 0;
            for(int j=0;j<n;j++){
                sum1 = sum1+container[i][j];
                sum2 = sum2+container[j][i];
            }
            box[i] = sum1;
            ball[i] = sum2;

        }
        Arrays.sort(box);
        Arrays.sort(ball);
        for(int j = 0; j< n ; j++)
            System.out.println(box[j] + "  " + ball[j]);

        System.out.println("\n\n  ");


        if(Arrays.equals(box,ball))
            return "Possible";
        else
            return "Impossible";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[][] container = new int[n][n];

            for (int i = 0; i < n; i++) {
                String[] containerRowItems = scanner.nextLine().split(" ");
                scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

                for (int j = 0; j < n; j++) {
                    int containerItem = Integer.parseInt(containerRowItems[j]);
                    container[i][j] = containerItem;
                }
            }

            String result = organizingContainers(container,n);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
