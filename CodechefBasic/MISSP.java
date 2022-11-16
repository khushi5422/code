package CodechefBasic;

import java.util.Scanner;

public class MISSP {
    public static void main(String[] args) {
            Scanner in=new Scanner(System.in);
            int n=in.nextInt();
            for(int i=0;i<n;i++){
                int t=in.nextInt();
                int[] arr=new int[t];
                for(int j=0;j<t;j++){
                    arr[j]=in.nextInt();
                }
                int r=0;
                for(int k=0;k<t;k++){

                    r=r^arr[k];
                }
                System.out.println(r);
            }
        }

    }

