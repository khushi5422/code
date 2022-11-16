package CodechefBasic;

import java.util.Scanner;

public class TWODISH {
    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(System.in);
            int test_case = s.nextInt();
            for (int i = 1; i <= test_case; i++) {
                int n = s.nextInt();
                int a = s.nextInt();
                int b = s.nextInt();
                int c = s.nextInt();
                int count = 0;
                b = b-a;
                count+=a;
                if(b<=c)
                    count+=b;
                else
                    count+=c;
                if(count>=n){
                    System.out.println("YES");
                } else System.out.println("NO");

            }
        } catch (Exception e) { }


    }
}
