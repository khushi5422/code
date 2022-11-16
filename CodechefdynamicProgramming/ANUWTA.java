package CodechefdynamicProgramming;

import java.util.Scanner;

public class ANUWTA {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        long dp[]=new long[100001];
        dp[0]=0;dp[1]=2;
        for(int i=2;i<100001;i++){
            dp[i]=dp[i-1]+i+1;
        }
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while(t-->0){
            int n=s.nextInt();

            System.out.println(dp[n]);
        }
    }
}
