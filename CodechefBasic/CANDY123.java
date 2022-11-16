package CodechefBasic;

import java.util.Scanner;

public class CANDY123 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int test_case = s.nextInt();
        for (int i = 1; i <= test_case; i++) {
            int a=s.nextInt();
            int b=s.nextInt();
            int  s1=0,s2=0;
            int count=1;
            while(s1<=a&&s2<=b)
            {
                if(count%2!=0)
                    s1=s1+count;
                else
                    s2=s2+count;
                count++;
            }
            if(s1>a)
                System.out.println("Bob");
            else
                System.out.println("Limak");
        }


        }

    }
