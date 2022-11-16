package CodechefdynamicProgramming;

import java.util.Scanner;

public class SUBINC {

        public static void main (String[] args) throws java.lang.Exception
        {
            Scanner sc= new Scanner(System.in);
            int test= sc.nextInt();
            for(int j = 0 ; j<=test;j++){
                int n= sc.nextInt();
                long[] arr= new long[n];
                for(int i=0; i<n; i++){
                    arr[i]= sc.nextLong();
                }
                long[] dp= new long[n];
                dp[0]=1;
                long sum=1;
                for(int i=1; i<n; i++){
                    if(arr[i]>=arr[i-1])
                        dp[i]=dp[i-1]+1;
                    else dp[i]=1;

                    sum+=dp[i];
                }
                System.out.println(sum);
            }
        }
    }
