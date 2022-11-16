package CodechefBasic;

import java.util.Scanner;

public class PROGLANG {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int test_case = s.nextInt();
        for (int i = 1; i <= test_case; i++) {
            int a = s.nextInt();
            int b = s.nextInt();
            int a1 = s.nextInt();
            int b1 = s.nextInt();
            int a2 = s.nextInt();
            int b2 = s.nextInt();
            if(a==b1 && b==a1 || a==a1 && b==b1) {
                System.out.println("1");
            }
            else if(a==b2 && b==a2 || a==a2 && b==b2) {
                System.out.println("2");
            }
            else System.out.println("0");
        }

    }
}
