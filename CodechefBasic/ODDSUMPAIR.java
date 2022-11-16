package CodechefBasic;

import java.util.Scanner;

public class ODDSUMPAIR {
    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(System.in);
            int test_case = s.nextInt();
            for (int i = 1; i <= test_case; i++) {
                int a = s.nextInt();
                int b = s.nextInt();
                int c = s.nextInt();
                int aandb = a + b;
                int aandc = a + c;
                int candb = b + c;
                if (aandb % 2 != 0 || aandc % 2 != 0 || candb % 2 != 0) {
                    System.out.println("YES");
                } else System.out.println("NO");
            }
        } catch (Exception e) {

        }


    }
}
