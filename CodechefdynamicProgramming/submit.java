package CodechefdynamicProgramming;

import java.util.Scanner;

public class submit {
    public static void main(String[] args) {
        int dp[] = new int[100];
        dp[0] = 0;
        dp[1] = 2;
        for (int i = 2; i < 100; i++) {
            dp[i] = dp[i - 1] + i + 1;
        }
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            int n = s.nextInt();
            //simple approach
//            long res = n+((n*(n+1))/2);
            System.out.println(dp[n]);
        }
    }
}