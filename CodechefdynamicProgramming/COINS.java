package CodechefdynamicProgramming;

import java.util.Scanner;

public class COINS {

    public static long check(long c){
        if(c<=10){
            return c;
        }else{
            return Math.max(c,check(c/2)+check(c/4)+check(c/3));
        }
    }
    public static void main(String[] args) {

            Scanner s = new Scanner(System.in);
            int test_case = s.nextInt();
            for(int i = 1 ; i <=test_case;i++){
                long c= s.nextInt();
                System.out.println(check(c));
            }
    }
}
