package DynamicProgramming;

import java.util.Scanner;

import static java.lang.System.in;

public class fibonacci {
    public static int fibb(int n, int [] dp) {

        if(n==0|| n==1){
            return  1;
        } else if (dp[n] !=-1) {
            return dp[n];
        }
        dp[n]= fibb(n-1,dp)+fibb(n-2,dp);
        return dp[n];
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(in);
//        int test_case = s.nextInt();
//        for (int i = 1; i <= test_case; i++) {
            int size = s.nextInt();
            int dp[] = new int[size+1];
            for (int j = 0; j <= args.length; j++) {
                dp[j] = -1;
            }
            int n = s.nextInt();
             int answer =fibb(n , dp);
        System.out.println("answer"+answer);
        }


    }

