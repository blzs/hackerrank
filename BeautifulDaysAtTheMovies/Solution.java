import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int reverse(int x) {
        int reverse = 0;
        for( ; x != 0; x/=10) {
            reverse = reverse * 10 + x % 10;
        }
        return reverse;
    }

    // Complete the beautifulDays function below.
    static int beautifulDays(int i, int j, int k) {
        int beautifulDays = 0;
        for( ; i <=j; i++) {
            int reverse = reverse(i);
            if( (i-reverse) %k == 0) beautifulDays++;
        }
        return beautifulDays;
    }
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] ijk = scanner.nextLine().split(" ");

        int i = Integer.parseInt(ijk[0]);

        int j = Integer.parseInt(ijk[1]);

        int k = Integer.parseInt(ijk[2]);

        int result = beautifulDays(i, j, k);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}