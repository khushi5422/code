package CodechefBasic;

import java.util.Scanner;

public class S01E01candy {
    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(System.in);
            int test_case = s.nextInt();
            for (int i = 1; i <= test_case; i++) {
                int n = s.nextInt();
                int j;
//                if(n>=21)
                for ( j = 1; j <= 100; j++) {
                }
                    if (n % j == 0 | n % 6 == 0) {
                        System.out.println("YES");
                    } else System.out.println("NO");
                }
        } catch (Exception e) {
        }
    }
}
