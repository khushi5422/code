package CodechefdynamicProgramming;

import java.util.Scanner;

public class SUMTRIAN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int d[][] = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j <= i; j++) {
                    d[i][j] = sc.nextInt();
                }
            }
            for (int i = n - 2; i >= 0; i--) {
                for (int j = 0; j <= i; j++) {
                    d[i][j] += Math.max(d[i + 1][j], d[i + 1][j + 1]);
                }
            }
            System.out.println(d[0][0]);
        }
    }
}
